import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql._
import org.apache.spark.sql.types._
import org.scalatest.{BeforeAndAfter, FunSuite, Matchers}



//class MachineLearningSpec extends FlatSpec with Matchers {
class MachineLearningSpec extends FunSuite with Matchers with BeforeAndAfter {
  Logger.getLogger("org.apache.spark").setLevel(Level.ERROR)
  Logger.getLogger("org.eclipse.jetty.server").setLevel(Level.OFF)
  private val master = "local[*]"
  private val appName = "testing"
  var spark: SparkSession = _



  test("Enriched Data successfully") {
    spark = new SparkSession.Builder().appName(appName).master(master).getOrCreate()
    val sc = spark.sqlContext

    val DA = new DataAnalysisProcess

    val actualDF = DA.loadData("testEnrichedData.csv")

    val schema = List(
      StructField("IncidntNum", StringType, nullable = true),
      StructField("PdDistrict", StringType, nullable = true),
      StructField("Datetime", StringType, nullable = true),
      StructField("newCategory", StringType, nullable = true),
      StructField("Week_day_number", IntegerType, nullable = true),
      StructField("Longitude", DoubleType, nullable = true),
      StructField("Latitude", DoubleType, nullable = true),
      StructField("Hour", IntegerType, nullable = true),
      StructField("Month", IntegerType, nullable = true),
      StructField("Year", IntegerType, nullable = true),
      StructField("isWeekend", IntegerType, nullable = true),
      StructField("season", IntegerType, nullable = true),
      StructField("AddressType", StringType, nullable = true),
      StructField("Street", StringType, nullable = true),
      StructField("weather", StringType, nullable = true),
      StructField("temperature", DoubleType, nullable = true),
      StructField("isNight", IntegerType, nullable = true)
    )

    val sampleRow = Seq(Row("50926860", "PARK", "2005-08-16 11:30:00", "Property",  2, -122.445086506657, 37.7731558815454, 11, 8, 2005, 0, 2, "Street", "FELL ST", "Partly Cloudy", 16.325, 0))

    val df = spark.createDataFrame(
      spark.sparkContext.parallelize(sampleRow),
      StructType(schema)
    )

    df.count() should equal (actualDF.count())
    df.except(actualDF).count() should equal(0)

  }

  test("Incident Number should be unique before/ after Machine Learning modeling") {
    spark = new SparkSession.Builder().appName(appName).master(master).getOrCreate()
    val sc = spark.sqlContext

    val DA = new DataAnalysisProcess

    val classificationDF = DA.loadData("classification_result.csv")
    val incidntNumDF = classificationDF.select("IncidntNum").distinct()
    incidntNumDF.count() should equal (classificationDF.count())

  }


  test("NLP result - One Description can only map to one Crime Category") {
    spark = new SparkSession.Builder().appName(appName).master(master).getOrCreate()
    val sc = spark.sqlContext
    val DA = new DataAnalysisProcess


    val nlpDF = DA.loadData("nlp_result.csv")
    val nlpUniqueDescription = nlpDF.select("Descript").distinct()
    nlpDF.count() should equal (nlpUniqueDescription.count())

  }

}
