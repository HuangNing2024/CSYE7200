import org.apache.spark.ml.{Pipeline, PipelineModel}
import org.apache.spark.ml.classification.{RandomForestClassificationModel, RandomForestClassifier}
import org.apache.spark.ml.feature.{IndexToString, StringIndexer, VectorAssembler}
//import com.esri.core.geometry.{Geometry, OperatorContains, OperatorImportFromWkt, Point, Polygon, SpatialReference, WktImportFlags}
//import org.apache.spark.ml.tuning.{CrossValidator, ParamGridBuilder}
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator


object DataAnalysisClassificationRF {

  val DA = new DataAnalysisProcess

  def main(args: Array[String]): Unit = {


    val train = DA.process(DA.loadData("data20150514_oversampling_train.csv")).cache()
    val test = DA.process(DA.loadData("data20150514_oversampling_test_f2.csv")).cache()
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

//    val Array(part1, part2) = enriched.randomSplit(Array(0.1, 0.9), seed = 1234L)
//      .map(_.cache())
//    val enrichedData = part1
//    enrichedData.cache()

        // ====================================================
        /* Random Forest */

        // Encode categorical features

    val enrichedData = enrichedTrain.union(enrichedTest)

    val featureIndexer = categoricalFeatures.map { colName =>
      new StringIndexer()
        .setInputCol(colName)
        .setOutputCol(colName + "_idx")
        .fit(enrichedData)
    }

        // Final feature columns
    val featureCols = (categoricalFeatures.map(_ + "_idx") ++ numericalFeatures).toArray

        // Final feature columns

    def assembler = new VectorAssembler()
      .setInputCols(featureCols)
      .setOutputCol("features")


    def targetIndexer = new StringIndexer()
      .setInputCol("newCategory")
      .setOutputCol("newCategory_idx")
      .fit(enrichedTrain)


//    val allData: Dataset[Crimes] = enrichedData.as[Crimes]
//    val dataSchema = StructType(allData.schema)
//
//    val (trainRdd, testRdd) = Util.splitDataset(0.8, allData)
//    val train = DA.spark.createDataFrame(trainRdd, dataSchema)
//    val test = DA.spark.createDataFrame(testRdd, dataSchema)


//    val Array(trainSet, testSet) = enrichedData.randomSplit(Array(0.8, 0.2), seed = 1234L)
//      .map(_.cache())




        val labelConverter = new IndexToString()
          .setInputCol("prediction")
          .setOutputCol("predCategory")
          .setLabels(targetIndexer.labels)

        /* RF*/
        val rf = new RandomForestClassifier()
          .setLabelCol("newCategory_idx")
          .setFeaturesCol("features")
          .setNumTrees(15)
          .setMaxDepth(5)
          .setMaxBins(2089)


    val rfpipeline = new Pipeline().setStages((featureIndexer :+ targetIndexer :+ assembler :+ rf :+ labelConverter).toArray)
    val model = rfpipeline.fit(enrichedTrain)



    // Make the prediction
    val predictions = model.transform(enrichedTest)


    val evaluator = new MulticlassClassificationEvaluator()
      .setLabelCol("newCategory_idx")
      .setPredictionCol("prediction")
      .setMetricName("accuracy")



    val accuracy = evaluator.evaluate(predictions)
    println(s"Test Error = ${(1.0 - accuracy)}")


//    println("Evaluation of Random Forest model without dimensionality reduction")

//    val evaluator_rf = new MulticlassClassificationEvaluator()
//      .setMetricName("weightedPrecision")
//      .setLabelCol("newCategory_idx")
//    println("Precision:" + evaluator_rf.evaluate(predictions))


//    val evaluator1_rf = new MulticlassClassificationEvaluator()
//      .setMetricName("weightedRecall")
//      .setLabelCol("newCategory_idx")
//    println("Recall:" + evaluator1_rf.evaluate(predictions))


    // You can get class of object using object.getClass()
//    val sameModel = sc.objectFile[PipelineModel]("filepath").first()


    /* save output data */
//    val labels = enrichedTrain.select("newCategory").distinct().collect()
//      .map { case Row(label: String) => label }
//      .sorted
//
//    val labelToVec = (predictedLabel: String) => {
//      val array = new Array[Int](labels.length)
//      array(labels.indexOf(predictedLabel)) = 1
//      array.toSeq
//    }
//
//    val schema = StructType(predictions.schema.fields ++ labels.map(StructField(_, IntegerType)))
//    val resultDF = DA.spark.createDataFrame(
//      predictions.rdd.map { r => Row.fromSeq(
//        r.toSeq ++
//          labelToVec(r.getAs[String]("predCategory"))
//      )},
//      schema
//    )
//
//
//
////    resultDF.limit(20).show()
//
//    // saving the results
//    resultDF
//      //      .drop("predictedLabel")
//      .drop("features")
//      .drop("rawPrediction")
//      .drop("probability")
//      .coalesce(1)
//      .write
//      .format("csv")
//      .option("header", "true")
//      .save("predicted.csv")

    val result = predictions
      .drop("features")
      .drop("probability")
      .drop("rawPrediction")


    //    write the prediction result into csv file
    try{
      //      repartition (preferred if upstream data is large, but requires a shuffle)
      //      coalesce(1)(can use when fit all the data into RAM on one worker thus)
      result.repartition(1).write.format("com.databricks.spark.csv").option("header", "true").save("result_rf.csv")
    }catch{
      case e1:IllegalArgumentException=> print("fail to save the data into csv:"+e1)
      case e2:RuntimeException => print("fail to save the data into csv:"+e2)
      case e3: Exception =>print("fail to save the data into csv:"+e3)
    }

//    val conf:SparkConf = new SparkConf().setAppName("rf").setMaster("local")
//    val sc: SparkContext = new SparkContext(conf)
//    sc.parallelize(Seq(model), 1).saveAsObjectFile("rfModel")  // https://stackoverflow.com/questions/37301597/how-to-save-randomforestclassifier-spark-model-in-scala


    /* Feature Importance*/
//     checking the importance of each feature
    val featureImportances = model
      .asInstanceOf[PipelineModel]
      .stages(categoricalFeatures.size + 2)
      .asInstanceOf[RandomForestClassificationModel].featureImportances
    assembler.getInputCols
      .zip(featureImportances.toArray)
      .foreach { case (feat, imp) => println(s"feature: $feat, importance: $imp") }


  }


}
