


   /* Cross Validation */
//
////    val paramGrid = new ParamGridBuilder()
////      .addGrid(rf.impurity, Array("entropy", "gini"))
////      .build()
////
////
////    val cv = new CrossValidator()
////      .setEstimator(rfpipeline)
////      .setEvaluator(evaluator)
////      .setEstimatorParamMaps(paramGrid)
////      .setNumFolds(3)

   // Train the model
   //    val model = cv.fit(trainSet)










   /* LR */
//    val pdIndexer = new StringIndexer()
//      .setInputCol("PdDistrict")
//      .setOutputCol("PdDistrict_idx")
//      .fit(enrichedData)
//    val data1 = pdIndexer.transform(enrichedData).cache()
//
//
//    val addressIndexer = new StringIndexer()
//      .setInputCol("AddressType")
//      .setOutputCol("AddressType_idx")
//      .fit(enrichedData)
//    val data2 = addressIndexer.transform(data1).cache()
//
//
//    //    val streetIndexer = new StringIndexer()
//    //      .setInputCol("Street")
//    //      .setOutputCol("Street_idx")
//    //      .fit(enrichedData)
//    //    val data3 = streetIndexer.transform(data2).cache()
//
//
//    val weatherIndexer = new StringIndexer()
//      .setInputCol("weather")
//      .setOutputCol("weather_idx")
//      .fit(enrichedData)
//    val data3 = weatherIndexer.transform(data2).cache()
//
//    // One Hot Encoding for Categorical variables
//    val encoder = new OneHotEncoderEstimator()
//      .setInputCols(categoricalFeatures.map(_ + "_idx").toArray)
//      .setOutputCols(categoricalFeatures.map(_ + "_vec").toArray)
//      .fit(data3)
//    val data4 = encoder.transform(data3)
//
//    //    data4.limit(10).show()
//    //    data4.printSchema()
//
//    // Final feature columns
//    val featureCols = (categoricalFeatures.map(_ + "_vec") ++ numericalFeatures).toArray
//
//
//    val assembler = new VectorAssembler()
//      .setInputCols(featureCols)
//      .setOutputCol("features")
//    val rawData = assembler.transform(data4)
//
//
//    val standardscaler = new StandardScaler()
//      .setInputCol("features")
//      .setOutputCol("scaled_features")
//      .fit(rawData)
//    val data5 = standardscaler.transform(rawData)
//
//
//    val targetIndexer = new StringIndexer()
//      .setInputCol("Category")
//      .setOutputCol("Category_idx")
//      .fit(data5)
//    val dataFinal = targetIndexer.transform(data5).cache()
//
//
//    val Array(trainSet, testSet) = dataFinal.randomSplit(Array(0.8, 0.2), seed = 1234L)
//      .map(_.cache())

//    val Binarylr = new LogisticRegression()
//      .setMaxIter(10)
//      .setRegParam(0.3)
//      .setElasticNetParam(0.8)
////      .setFeaturesCol("scaled_features")
////      .setPredictionCol("prediction")
////      .setLabelCol("Category_idx")
//
//    val lr = new OneVsRest().setClassifier(Binarylr)
//      .setFeaturesCol("scaled_features")
//      .setPredictionCol("prediction")
//      .setLabelCol("Category_idx")
//
//
//    val lrPipeline = new Pipeline()
//      .setStages(Array(targetIndexer, lr))
//
//    val model = lrPipeline.fit(trainSet)



// ====================================================
/* KNN */   // - has error: java.lang.NoSuchMethodError: org.apache.spark.ml.param.shared.HasInputCols.
//    val pca = new PCA()
//      .setInputCol("features")
//      .setK(50)
//      .setOutputCol("pcaFeatures")
//    org.apache.spark.ml.param.shared

//    val knn = new KNNClassifier()
//      .setTopTreeLeafSize(enrichedData.count().toInt / 500)
//      .setFeaturesCol("features")
//      .setPredictionCol("prediction")
//      .setK(10)
//
//
//    val knnPipeline = new Pipeline()
//      .setStages((featureIndexer :+ targetIndexer :+ assembler :+ knn).toArray)
////      .setStages((featureIndexer :+ targetIndexer :+ assembler :+ knn :+ labelConverter).toArray)
//
//    val model = knnPipeline.fit(trainSet)
//





//    val cleanPred = predictions.select("IncidntNum", "Category", "predCategory")
//    val cleanPred: DataFrame = predictions.drop("features")
//      .drop("rawPrediction")
//      .drop("probability")
//      .drop("PdDistrict_idx")
//      .drop("AddressType_idx")
//      .drop("Street_idx")
//      .drop("weather_idx")
//      .drop("PdDistrict").drop("Address").drop("Datetime").drop("Week_day_number").drop("Longitude").drop("Latitude").drop("Hour").drop("Month")
//    .drop("Year").drop("ExactDate").drop("ExactTime").drop("isWeekend").drop("AddressType").drop("Street").drop("weather").drop("temperature")
//    .drop("Sunrise").drop("Sunset").drop("isNight").drop("Category_idx").drop("prediction")
////      .drop("Category")



//    val schema = StructType(cleanPred.select("IncidntNum", "Category","predCategory"
//    ).schema.fields)
//    val resultDF = DA.spark.createDataFrame(predictions.rdd.map { r => Row.fromSeq(
//      r.toSeq
//    )},
//      schema)


//    ,
//    "Week_day_number", "Longitude", "Latitude", "Hour", "Month", "Year", "ExactDate", "ExactTime", "isWeekend", "AddressType",
//    "Street", "weather", "temperature", "Sunrise", "Sunset", "isNight", "PdDistrict_idx", "AddressType_idx", "Street_idx", "weather_idx",
//    "Category_idx", "features", "rawPrediction", "probability", "prediction", "predCategory"
//    IncidntNum	Category	PdDistrict	Address	Datetime	Week_day_number	Longitude	Latitude	Hour	Month	Year	ExactDate	ExactTime	isWeekend	AddressType	Street	weather	temperature	Sunrise	Sunset	isNight











   // Regression Dirty Codes

   // Split the data in train and test set
   //    val Array(trainSet, testSet) = dataset.randomSplit(Array(0.8, 0.2), seed = 1234L)
   //      .map(_.cache())

   // Building ML models part, we need to move this part to a new class file
   // Feature Engineering
   //    val pdIndex = new StringIndexer()
   //      .setInputCol("PdDistrict")
   //      .setOutputCol("PdDistrict_idx")
   //      .fit(trainOriginal)
   //    val train1 = pdIndex.transform(trainOriginal).cache()
   //
   //    val categoryIndex = new StringIndexer()
   //      .setInputCol("Category")
   //      .setOutputCol("Category_idx")
   //      .fit(train1)
   //    val train2 = categoryIndex.transform(train1).cache()

   //    val featureCols = Array("PdDistrict_idx", "Category_idx", "Week_day_number")
   //    val train = train2.groupBy("PdDistrict_idx", "Category_idx", "Week_day_number")
   //      .count
   //      .withColumnRenamed("count", "Occurences")
   //    train.limit(20).show

   //    val assembler = new VectorAssembler()
   //      .setInputCols(featureCols)
   //      .setOutputCol("features")




   /* Random Forest */
   //    val rf = new RandomForestRegressor()
   //      .setLabelCol("Occurences")
   //      .setFeaturesCol("features")
   //      .setNumTrees(10)
   //      .setMaxDepth(4)
   //      .setMaxBins(40)
