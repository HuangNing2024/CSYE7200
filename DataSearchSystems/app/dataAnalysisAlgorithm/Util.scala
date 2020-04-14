


object Util {

  val DA = new DataAnalysisProcess

//  def splitDataset(trainRatio: Double, allData: Dataset[Crimes])= {
////    val allData: Dataset[Crimes] = df.as[Crimes]
////    val dataSchema = allData.schema
//    val trainSize = math.round(allData.count() * trainRatio).toInt
//    val trainRdd = allData.rdd
//      .zipWithIndex()
//      .filter{case(_, index) => index < trainSize}
//      .map {case(row, _) => row}
//    val testRdd = allData.rdd
//      .zipWithIndex()
//      .filter{case(_, index) => index >= trainSize}
//      .map {case(row, _) => row}
//
////    val train = DA.spark.createDataFrame(trainRdd, dataSchema)
////    val test = DA.spark.createDataFrame(testRdd, dataSchema)
//
//    (trainRdd, testRdd)
//  }


}
