import org.apache.spark.ml.{Pipeline, PipelineModel}
import org.apache.spark.ml.classification.{RandomForestClassificationModel, RandomForestClassifier}
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorAssembler}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator


object DataAnalysisClassificationRF {

  val DA = new DataAnalysisProcess

  def main(args: Array[String]): Unit = {

    // Load data
    val train = DA.process(DA.loadData("train.csv")).drop("Category").cache()
    val test = DA.process(DA.loadData("test.csv")).drop("Category").cache()
    val sunsetrise = DA.loadData("sunsetrise.csv").cache()
    val weather = DA.loadData("weather.csv").cache()


    // Feature Engineering
    val funcs = Seq(DA.enrichTime, DA.enrichWeekend, DA.enrichSeason, DA.enrichAddress, DA.enrichWeather(weather)(_), DA.enrichDayOrNight(sunsetrise)(_))
    val enrichedTrain = funcs.foldLeft(train) {(previousres, f) => f(previousres)}
    val enrichedTest = funcs.foldLeft(test) {(previousres, f) => f(previousres)}


    val categoricalFeatures = Seq("PdDistrict", "AddressType", "Street", "weather")
    val numericalFeatures = Seq(
      "Week_day_number", "isNight", "isWeekend", "Hour", "Month", "Year",
      "Longitude", "Latitude", "temperature", "season"
    )


    /* Random Forest */

    // Get the whole dataset
    val enrichedData = enrichedTrain.union(enrichedTest)

  // Encode categorical features
    val featureIndexer = categoricalFeatures.map { colName =>
      new StringIndexer()
        .setInputCol(colName)
        .setOutputCol(colName + "_idx")
        .fit(enrichedData)
    }

    // Final feature columns
    val featureCols = (categoricalFeatures.map(_ + "_idx") ++ numericalFeatures).toArray

    // Include all features into a vector
    def assembler = new VectorAssembler()
      .setInputCols(featureCols)
      .setOutputCol("features")

    // Encode the target variable
    def targetIndexer = new StringIndexer()
      .setInputCol("newCategory")
      .setOutputCol("newCategory_idx")
      .fit(enrichedTrain)

    // Change the category index to the original category name
    val labelConverter = new IndexToString()
      .setInputCol("prediction")
      .setOutputCol("predCategory")
      .setLabels(targetIndexer.labels)

    // Build the Machine Learning/ Random Forest Model
    val rf = new RandomForestClassifier()
      .setLabelCol("newCategory_idx")
      .setFeaturesCol("features")
      .setNumTrees(15)
      .setMaxDepth(5)
      .setMaxBins(2089)

    // Pipeline the process and train the model
    val rfpipeline = new Pipeline().setStages((featureIndexer :+ targetIndexer :+ assembler :+ rf :+ labelConverter).toArray)
    val model = rfpipeline
      .fit(enrichedTrain)


    // Make the prediction
    val predictions = model
      .transform(enrichedTest)

    // Evaluate the model performance
    val evaluator = new MulticlassClassificationEvaluator()
      .setLabelCol("newCategory_idx")
      .setPredictionCol("prediction")
      .setMetricName("accuracy")

    val accuracy = evaluator.evaluate(predictions)
    println(s"Test Error = ${(1.0 - accuracy)}")


    /* Feature Importance*/
    // Check the importance of each feature
    val featureImportances = model
      .asInstanceOf[PipelineModel]
      .stages(categoricalFeatures.size + 2)
      .asInstanceOf[RandomForestClassificationModel].featureImportances
    assembler.getInputCols
      .zip(featureImportances.toArray)
      .foreach { case (feat, imp) => println(s"feature: $feat, importance: $imp") }


    // Form the final output dataset for supporting the front-end functions
    val result = predictions
      .drop("features")
      .drop("probability")
      .drop("rawPrediction")
      .drop("PdDistrict_idx")
      .drop("AddressType_idx")
      .drop("Street_idx")
      .drop("weather_idx")
      .drop("newCategory_idx")
      .drop("prediction")
      .drop("Hour")
      .drop("Month")
      .drop("Year")
      .drop("isWeekend")

    // Write the prediction result into the system
    DA.saveOutputResult(result, "result_classification.csv")

    // Change the saved csv folder to single csv file
    DA.changeFilePath("result_classification.csv", "classification_result.csv")

    DA.spark.stop()

  }


}
