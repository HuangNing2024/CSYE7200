import org.apache.spark.sql.{DataFrame, SparkSession}
import org.apache.spark.sql.functions.{col, date_format, from_unixtime, hour, month, udf, unix_timestamp, when, year}
import org.apache.spark.sql.types.{DoubleType, IntegerType, TimestampType}

class DataAnalysisProcess {

  val spark: SparkSession = SparkSession.builder().master("local").getOrCreate()

  def loadData(file: String) = {
    val dataSet = spark.read.
      option("header", "true")
      .option("mode", "DROPMALFORMED") // delete bad-formatted record
      .option("inferSchema", "false")
      .format("com.databricks.spark.csv")
      .load(file)
      .distinct() // avoid duplicated records
      .na.drop() // delete rows which contains null/ NaN value
      .toDF()
      .cache()

    dataSet
  }


  // Process and clean Data
  def process(df: DataFrame): DataFrame = {

    // Transfer the data type
    val df1 = df
      .withColumn("Week_day_string", date_format(col("DateTime"), "u"))
      .withColumn("Week_day_number", col("Week_day_string").cast(IntegerType))
      .withColumn("Longitude", col("X").cast(DoubleType))
      .withColumn("Latitude", col("Y").cast(DoubleType))
      .drop("Week_day_string")
      .drop("X")
      .drop("Y")
      .drop("DayOfWeek")
      .drop("Resolution")
      .drop("Descript")


    //     Process the outliers
    df1.createOrReplaceTempView("df1")
    val outliersDF = spark.sql("SELECT * FROM df1 WHERE latitude > 50")
    outliersDF.createOrReplaceTempView("outliersDF")
    val othersDF = spark.sql("SELECT * FROM df1 WHERE latitude <= 50")
    othersDF.createOrReplaceTempView("othersDF")
    val meanY = othersDF.groupBy("PdDistrict").mean("latitude").withColumnRenamed("avg(latitude)", "Latitude")
    meanY.createOrReplaceTempView("meanY")
    val query = "select o.IncidntNum, o.Category, o.PdDistrict, o.Address, o.Datetime, o.newCategory, o.Week_day_number" +
      ", o.Longitude, m.Latitude as Latitude from outliersDF as o left join meanY as m on m.PdDistrict = o.PdDistrict"
    val outliersProcessDF = spark.sql(query)
    outliersProcessDF.createOrReplaceTempView("outliersProcessDF")

    val dfFinal = othersDF.union(outliersProcessDF).drop("Category")



    dfFinal
  }


  //    saving dataset
  def saveFile(df: DataFrame, path: String): Unit = {
    try {
      df.coalesce(1).write.option("header", "true").format("csv").save(path)

    } catch {
      case e1: IllegalArgumentException => print("Fail to save the file:" + e1)
      case e2: RuntimeException => print("Fail to save the file:" + e2)
      case e3: Exception => print("Fail to save the file:" + e3)
    }
  }


  // add a few time-related features to the original datasets such as:
  //   - the year
  //   - the month
  //   - the hour of day
  val enrichTime = (df: DataFrame) => {
    df.withColumn("Hour", hour(col("Datetime")))
      .withColumn("Month", month(col("Datetime")))
      .withColumn("Year", year(col("Datetime")))
      .withColumn("ExactDate", date_format(col("Datetime"), "YYYY-MM-dd"))
      .withColumn("ExactTime", date_format(col("Datetime"), "HH:mm"))
  }


  def enrichDayOrNight(sunsetDF: DataFrame)(df: DataFrame): DataFrame = {
    val sunsetDF2 = sunsetDF
      .withColumn("sunriseTime", from_unixtime(unix_timestamp(col("Sunrise"), "hh:mm a"), "HH:mm").cast(TimestampType))
      .withColumn("sunsetTime", from_unixtime(unix_timestamp(col("Sunset"), "hh:mm a"), "HH:mm").cast(TimestampType))
    val df2 = df.withColumn("Time", col("ExactTime").cast(TimestampType))
    df2.createOrReplaceTempView("df2")
    sunsetDF2.createOrReplaceTempView("sunsetDF2")
    val query = "select a.*, b.* from df2 as a join sunsetDF2 as b on a.ExactDate = b.date"
    val finalDF = spark.sql(query).withColumn("isNight",
      when(col("Time") > col("sunsetTime") || col("Time") < col("sunriseTime"), 1)
        .otherwise(0))
      .drop("sunriseTime")
      .drop("sunsetTime")
      .drop("Time")
      .drop("date")
      .drop("Sunrise")
      .drop("Sunset")
      .drop("ExactTime")
      .drop("ExactDate")
    finalDF
  }


  // add a weekend feature telling whether or not the crime incident occurred on a weekend
  val enrichWeekend = (df: DataFrame) => {
    def weekendUDF = udf { (dayOfWeek: Int) =>
      dayOfWeek match {
        case _@(5 | 6 | 7) => 1
        case _ => 0
      }
    }

    df.withColumn("isWeekend", weekendUDF(col("Week_day_number")))
  }


  val enrichSeason = (df: DataFrame) => {
    def seasonUDF = udf { (Month: Int) =>
      Month match {
        case _@(3 | 4 | 5) => 0 // Spring
        case _@(5 | 6 | 7) => 1 // Summer
        case _@(8 | 9 | 10) => 2 // Fall
        case _ => 3 // Winter
      }
    }

    df.withColumn("season", seasonUDF(col("Month")))
  }


  // add address-related features:
  //   - whether or not the crime incident occurred at an intersection
  //   - a street feature which is the street corresponding to the parsed address
  val enrichAddress = (df: DataFrame) => {
    def addressTypeUDF = udf { (address: String) =>
      if (address contains "/") "Intersection"
      else "Street"
    }

    val streetRegex = """\d{1,4} Block of (.+)""".r
    val intersectionRegex = """(.+) / (.+)""".r

    def addressUDF = udf { (address: String) =>
      streetRegex findFirstIn address match {
        case Some(streetRegex(s)) => s
        case None => intersectionRegex findFirstIn address match {
          case Some(intersectionRegex(s1, s2)) => if (s1 < s2) s1 else s2
          case None => address
        }
      }
    }

    df
      .withColumn("AddressType", addressTypeUDF(col("Address")))
      .withColumn("Street", addressUDF(col("Address")))
      .drop("Address")
  }


  //  def enrichHoliday(holidayDF: DataFrame)(df: DataFrame): DataFrame = {
  //    df.createOrReplaceTempView("df")
  //    holidayDF.createOrReplaceTempView("holidayDF")
  //    val query = "select a.*, b.isHoliday from df as a left join holidayDF as b on b.Date = a.ExactDate"
  //    val finalDF = spark.sql(query)
  //    finalDF
  //  }


  // add weather-related features:
  //   - the average temperature of the day
  //   - the most occurring weather condition
  def enrichWeather(weatherDF: DataFrame)(df: DataFrame): DataFrame = {
    //    df.join(weatherDF, df("ExactDate") === weatherDF("date"), "left_outer")
    df.join(weatherDF, df("ExactDate") === weatherDF("date"))
      .drop("date")
      .withColumn("temperature", col("temperatureC").cast(DoubleType))
      .drop("temperatureC")
  }

}