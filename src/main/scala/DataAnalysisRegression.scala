import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.evaluation.RegressionEvaluator
import org.apache.spark.ml.feature.{StringIndexer, VectorAssembler}
import org.apache.spark.ml.regression.GBTRegressor
import org.apache.spark.sql.functions._
import org.apache.spark.sql.types.IntegerType


object DataAnalysisRegression {

  val DA = new DataAnalysisProcess


  def main(args: Array[String]): Unit = {

//    val train = DA.process(DA.loadData("data20150514_oversampling_ordered_train.csv")).cache()
//    val test = DA.process(DA.loadData("data20150514_oversampling_ordered_test.csv")).cache()
    val train = DA.process(DA.loadData("data20150514_oversampling_train.csv")).cache()
    val test = DA.process(DA.loadData("data20150514_oversampling_test_f2.csv")).cache()
//    val data = DA.process(DA.loadData("data20150514_2.csv")).cache()
    val sunsetrise = DA.loadData("sunsetrise.csv").cache()
    val weather = DA.loadData("weather.csv").cache()
    //    val holiday = DA.loadData("holiday.csv").cache()


    // Feature Engineering
    val funcs = Seq(DA.enrichTime, DA.enrichWeekend, DA.enrichSeason, DA.enrichAddress, DA.enrichWeather(weather)(_), DA.enrichDayOrNight(sunsetrise)(_))
//    val enriched = funcs.foldLeft(data) {(previousres, f) => f(previousres)}
    val enrichedTrain = funcs.foldLeft(train) {(previousres, f) => f(previousres)}
    val enrichedTest = funcs.foldLeft(test) {(previousres, f) => f(previousres)}





    val categoricalFeatures = Seq("PdDistrict", "AddressType", "Street", "weather")
    val numericalFeatures = Seq(
      "Week_day_number", "isNight", "isWeekend", "Hour", "Month", "season"
    )

//    import DA.spark.sqlContext.implicits._

    val enrichedData = enrichedTrain.union(enrichedTest)

    val dataset = enrichedData.groupBy("PdDistrict", "AddressType", "Street", "weather",
      "Week_day_number", "isNight", "isWeekend", "Hour", "Month", "Year", "season")
      .count
      .withColumnRenamed("count", "Occurences")
      .drop("Year")
//      .select("*").where(dataset("Occurences") < 9)


    val trainSet = enrichedTrain.groupBy("PdDistrict", "AddressType", "Street", "weather",
      "Week_day_number", "isNight", "isWeekend", "Hour", "Month", "Year", "season")
      .count
      .withColumnRenamed("count", "Occurences")
      .drop("Year")

    val testSet = enrichedTest.groupBy("PdDistrict", "AddressType", "Street", "weather",
      "Week_day_number", "isNight", "isWeekend", "Hour", "Month", "Year", "season")
      .count
      .withColumnRenamed("count", "Occurences")
      .drop("Year")

    DA.saveFile(dataset, "dataInModel_regression.csv")

    // Feature Engineering
    val featureIndexer = categoricalFeatures.map { colName =>
      new StringIndexer()
        .setInputCol(colName)
        .setOutputCol(colName + "_idx")
        .fit(dataset)
    }

    val featureCols = (categoricalFeatures.map(_ + "_idx") ++ numericalFeatures).toArray

    def assembler = new VectorAssembler()
      .setInputCols(featureCols)
      .setOutputCol("features")




    /* GBT */
    val gbt = new GBTRegressor()
      .setLabelCol("Occurences")
      .setFeaturesCol("features")
      .setMaxIter(10)
      .setMaxBins(2089)

    val gbtpipeline = new Pipeline().setStages((featureIndexer :+ assembler :+ gbt).toArray)

    // Train model
    val model = gbtpipeline.fit(trainSet)

    // Make prediction
    val predictions = model.transform(testSet)


    // Evaluate model performance
    val evaluator = new RegressionEvaluator()
      .setLabelCol("Occurences")
      .setPredictionCol("prediction")
      .setMetricName("rmse")

    val rmse = evaluator.evaluate(predictions)
    println("Root Mean Squared Error (RMSE) on test data = " + rmse)      //0.18


    val predictionsClean = predictions.withColumn("predictionInt", col("prediction").cast(IntegerType))
    val result = predictionsClean.drop("features")

    //    write the prediction result into csv file
    try{
      //      repartition (preferred if upstream data is large, but requires a shuffle)
      //      coalesce(1)(can use when fit all the data into RAM on one worker thus)
      result.repartition(1).write.format("com.databricks.spark.csv").option("header", "true").save("result_regression.csv")
    }catch{
      case e1:IllegalArgumentException=> print("fail to save the data into csv:"+e1)
      case e2:RuntimeException => print("fail to save the data into csv:"+e2)
      case e3: Exception =>print("fail to save the data into csv:"+e3)
    }


  }

}

