////import com.esri.core.geometry.{Geometry, OperatorContains, OperatorImportFromWkt, Point, Polygon, SpatialReference, WktImportFlags}
//import org.apache.spark.ml.Pipeline
//import org.apache.spark.ml.classification.{LogisticRegression, OneVsRest}
//import org.apache.spark.ml.evaluation.MulticlassClassificationEvaluator
//import org.apache.spark.ml.feature._
////import org.apache.spark.ml.tuning.{CrossValidator, ParamGridBuilder}
//
//
//
//
//// crimes info
//case class Crimes(IncidntNum: String,
//                  PdDistrict: String,
//                  Datetime: String,
//                  newCategory: String,
//                  Week_day_number: Integer,
//                  Longitude: Double,
//                  Latitude: Double,
//                  Hour: Integer,
//                  Month: Integer,
//                  Year: Integer,
//                  isWeekend: Integer,
//                  season: Integer,
//                  AddressType: String,
//                  Street: String,
//                  weather: String,
//                  temperature: Double,
//                  isNight: Integer)
//
////case class Neighborhood(name: String, polygon: Polygon)
//
//
////object Neighborhood {
////  val DA = new DataAnalysisClassification
////  implicit val decodeNbhd: Decoder[Neighborhood] = Decoder.instance { c =>
////    for {
////      name <- c.downField("name").as[String]
////      poly <- c.downField("polygon").as[String]
////    } yield Neighborhood(name, DA.createGeometryFromWKT[Polygon](poly))
////  }
////}
//
//
//
//object DataAnalysisClassification {
//
//  val DA = new DataAnalysis
//
//
//  def main(args: Array[String]): Unit = {
//
//
//    val data = DA.process(DA.loadData("data20150514_oversampling4.csv")).cache()
//    val sunsetrise = DA.loadData("sunsetrise.csv").cache()
//    val weather = DA.loadData("weather.csv").cache()
////    val holiday = DA.loadData("holiday.csv").cache()
//
//
//    // Feature Engineering
////    val enrichFunctions = List(DA.enrichTime, DA.enrichWeekend, DA.enrichAddress, DA.enrichWeather(weather)(_))
//    val funcs = Seq(DA.enrichTime, DA.enrichWeekend, DA.enrichSeason, DA.enrichAddress, DA.enrichWeather(weather)(_), DA.enrichDayOrNight(sunsetrise)(_))
//    val enriched = funcs.foldLeft(data) {(previousres, f) => f(previousres)}
//
//
//    val Array(part1, part2) = enriched.randomSplit(Array(0.2, 0.8), seed = 1234L)
//      .map(_.cache())
//
//
//    val categoricalFeatures = Seq("PdDistrict", "AddressType", "weather")
//    val numericalFeatures = Seq(
//      "Week_day_number", "isNight", "isWeekend", "Hour", "Month", "Year",
//      "Longitude", "Latitude", "temperature", "season"
//    )
//
//
////    val enrichedData = part1
////      .select((categoricalFeatures ++ numericalFeatures).map(col): _*)
//    val enrichedData = part1
//    enrichedData.cache()
//
//    /* LR */
//        val pdIndexer = new StringIndexer()
//          .setInputCol("PdDistrict")
//          .setOutputCol("PdDistrict_idx")
//          .fit(enrichedData)
//        val data1 = pdIndexer.transform(enrichedData).cache()
//
//
//        val addressIndexer = new StringIndexer()
//          .setInputCol("AddressType")
//          .setOutputCol("AddressType_idx")
//          .fit(enrichedData)
//        val data2 = addressIndexer.transform(data1).cache()
//
//
//        //    val streetIndexer = new StringIndexer()
//        //      .setInputCol("Street")
//        //      .setOutputCol("Street_idx")
//        //      .fit(enrichedData)
//        //    val data3 = streetIndexer.transform(data2).cache()
//
//
//        val weatherIndexer = new StringIndexer()
//          .setInputCol("weather")
//          .setOutputCol("weather_idx")
//          .fit(enrichedData)
//        val data3 = weatherIndexer.transform(data2).cache()
//
//        // One Hot Encoding for Categorical variables
//        val encoder = new OneHotEncoderEstimator()
//          .setInputCols(categoricalFeatures.map(_ + "_idx").toArray)
//          .setOutputCols(categoricalFeatures.map(_ + "_vec").toArray)
//          .fit(data3)
//        val data4 = encoder.transform(data3)
//
//
//        // Final feature columns
//        val featureCols = (categoricalFeatures.map(_ + "_vec") ++ numericalFeatures).toArray
//
//
//        val assembler = new VectorAssembler()
//          .setInputCols(featureCols)
//          .setOutputCol("features")
//        val rawData = assembler.transform(data4)
//
//
//        val standardscaler = new StandardScaler()
//          .setInputCol("features")
//          .setOutputCol("scaled_features")
//          .fit(rawData)
//        val data5 = standardscaler.transform(rawData)
//
//
//        val targetIndexer = new StringIndexer()
//          .setInputCol("newCategory")
//          .setOutputCol("label")
//          .fit(data5)
////        val dataFinal = targetIndexer.transform(data5).cache()
//
//
//        val Array(trainSet, testSet) = data5.randomSplit(Array(0.8, 0.2), seed = 1234L)
//          .map(_.cache())
//
//        val Binarylr = new LogisticRegression()
//          .setMaxIter(30)
//          .setRegParam(0.3)
//          .setElasticNetParam(0.8)
//          .setFeaturesCol("scaled_features")
//          .setPredictionCol("prediction")
//          .setLabelCol("label")
//
//        val lr = new OneVsRest().setClassifier(Binarylr)
//          .setFeaturesCol("scaled_features")
//          .setPredictionCol("prediction")
//          .setLabelCol("label")
//
//
//
//    val labelConverter = new IndexToString()
//      .setInputCol("prediction")
//      .setOutputCol("predCategory")
//      .setLabels(targetIndexer.labels)
//
//
//        val lrPipeline = new Pipeline()
//          .setStages(Array(targetIndexer, lr, labelConverter))
//
//        val model = lrPipeline.fit(trainSet)
//
//
//    // Make the prediction
//    val predictions = model.transform(testSet)
//
//
//    val evaluator = new MulticlassClassificationEvaluator()
//      .setLabelCol("label")
//      .setPredictionCol("prediction")
//      .setMetricName("accuracy")
//
//
//
//    val accuracy = evaluator.evaluate(predictions)
//    println(s"Test Error = ${(1.0 - accuracy)}")
//
//
//  }
//
//
//}
