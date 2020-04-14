import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature._


object DescriptNLP {

  val DA = new DataAnalysisProcess


  def main(args: Array[String]): Unit = {

//    val data = DA.loadData("data20150514.csv").select("Category", "Descript")

    val train = DA.loadData("data20150514_oversampling_train.csv").select("Category", "Descript")
    val test = DA.loadData("data20150514_oversampling_test_f2.csv").select("Category", "Descript")
    val data = train.union(test)


    val regexTokenizer = new RegexTokenizer()
      .setInputCol("Descript")
      .setOutputCol("words")
      .setPattern("\\W")
//    val data0 = regexTokenizer.transform(data)


    val add_stopwords = Array("http","https","amp","rt","t","c","the")
    val remover = new StopWordsRemover()
      .setInputCol("words")
      .setOutputCol("filtered")
      .setStopWords(add_stopwords)

//    val data1 = remover.transform(data0)


    val hashingTF = new HashingTF()
      .setInputCol("filtered")
      .setOutputCol("rawFeatures")
      .setNumFeatures(10000)


    val idf = new IDF()
      .setInputCol("rawFeatures")
      .setOutputCol("features")
      .setMinDocFreq(5)




    val targetIndexer = new StringIndexer()
      .setInputCol("Category")
      .setOutputCol("label")
      .fit(data)
//    val dataFinal = targetIndexer.transform(data2)




    val nlpPipeline = new Pipeline().setStages(Array(regexTokenizer, remover, hashingTF, idf, targetIndexer))
    val dataFinal = nlpPipeline.fit(data).transform(data)

//    dataFinal.show(10)


    val Array(trainSet, testSet) = dataFinal.randomSplit(Array(0.7, 0.3), seed = 1234L)
      .map(_.cache())


    val labelConverter = new IndexToString()
      .setInputCol("prediction")
      .setOutputCol("predCategory")
      .setLabels(targetIndexer.labels)


    val lr = new LogisticRegression()
      .setMaxIter(20)
      .setRegParam(0.3)
      .setElasticNetParam(0)
      .setPredictionCol("prediction")
      .setFeaturesCol("features")
      .setLabelCol("label")


    val lrpipeline = new Pipeline().setStages(Array(lr, labelConverter))

    val evaluator = new MulticlassClassificationEvaluator()
      .setPredictionCol("prediction")
      .setMetricName("accuracy")


    /* Cross Validation */
//    val paramGrid = new ParamGridBuilder()
//      .addGrid(lr.regParam, Array(0.1, 0.3, 0.5))   // regularization parameter
//      .addGrid(lr.elasticNetParam, Array(0.0, 0.1, 0.2)) // Elastic Net Parameter (Ridge = 0)
//      .addGrid(lr.maxIter, Array(10, 20, 50))     // Number of iterations
//      .addGrid(hashingTF.numFeatures, Array(10, 100, 1000, 10000))  // Number of features
//      .build()

//    val cv = new CrossValidator()
//      .setEstimator(lr)
//      .setEvaluator(evaluator)
//      .setEstimatorParamMaps(paramGrid)
//      .setNumFolds(5)


    val model = lrpipeline.fit(trainSet)
//    val model = cv.fit(trainSet)


    val predictions = model.transform(testSet)


//    predictions.select("Descript", "Category", "label", "prediction").show(20)

    predictions.show(20)

    val accuracy = evaluator.evaluate(predictions)
    println(s"Test Error = ${(1.0 - accuracy)}")

    val result = predictions
      .drop("features")
      .drop("probability")
      .drop("rawPrediction")
      .drop("filtered")
      .drop("words")
      .drop("rawFeatures")


   //    write the prediction result into csv file
    try{
      //      repartition (preferred if upstream data is large, but requires a shuffle)
      //      coalesce(1)(can use when fit all the data into RAM on one worker thus)
      result.repartition(1).write.format("com.databricks.spark.csv").option("header", "true").save("result_nlp.csv")
    }catch{
      case e1:IllegalArgumentException=> print("fail to save the data into csv:"+e1)
      case e2:RuntimeException => print("fail to save the data into csv:"+e2)
      case e3: Exception =>print("fail to save the data into csv:"+e3)
    }

  }
}
