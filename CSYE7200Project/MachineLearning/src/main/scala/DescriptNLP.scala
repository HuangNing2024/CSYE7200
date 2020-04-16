import java.util.Locale

import org.apache.spark.SparkContext
import org.apache.spark.ml.Pipeline
import org.apache.spark.ml.classification.LogisticRegression
import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
import org.apache.spark.ml.feature._


object DescriptNLP {

  val DA = new DataAnalysisProcess


  def main(args: Array[String]): Unit = {


    Locale.setDefault(Locale.US)

    // Load Data
    val train = DA.loadData("train.csv").select("Category", "Descript")
    val test = DA.loadData("test.csv").select("Category", "Descript")
    val data = train.union(test)


    // Transfer the Description sentences to words
    val regexTokenizer = new RegexTokenizer()
      .setInputCol("Descript")
      .setOutputCol("words")
      .setPattern("\\W")

    // Specify the stopwords
    val add_stopwords = Array("http","https","amp","rt","t","c","the")

    // Remove Stop Words
    val remover = new StopWordsRemover()
      .setInputCol("words")
      .setOutputCol("filtered")
      .setStopWords(add_stopwords)


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


    /* Logistic Regression using TF-IDF Features */

    // Pipeline the language process
    val nlpPipeline = new Pipeline().setStages(Array(regexTokenizer, remover, hashingTF, idf, targetIndexer))
    val dataFinal = nlpPipeline.fit(data).transform(data)

    // Split the dataset
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

    // Evaluate Model Performance
    val accuracy = evaluator.evaluate(predictions)
    println(s"Test Error = ${(1.0 - accuracy)}")

    // Form the final output data to support front-end function
    val result = predictions
      .drop("features")
      .drop("probability")
      .drop("rawPrediction")
      .drop("filtered")
      .drop("words")
      .drop("rawFeatures")
      .drop("label")
      .drop("prediction")
      .drop("Category")
      .distinct()


   // Write the final dataset into system
    DA.saveOutputResult(result, "result_nlp.csv")

    // Change the saved csv folder to single csv file
    DA.changeFilePath("result_nlp.csv", "nlp_result.csv")

    DA.spark.stop()

  }
}
