import org.apache.spark.SparkContext



object SearchingMapDataUtil {

  val DA = new DataAnalysisProcess

  def main(args: Array[String]): Unit = {

    // Load data
    val data = DA.process(DA.loadData("data_reclassify.csv")).cache()
    val weather = DA.loadData("weather.csv").cache()


    // Feature Engineering and form the output dataset to support front-end functions
    val funcs = Seq(DA.enrichTime, DA.enrichAddress, DA.enrichWeather(weather)(_))
    val enrichedData = funcs.foldLeft(data) {(previousres, f) => f(previousres)}
      .drop("Hour")
      .drop("ExactDate")
      .drop("ExactTime")
      .drop("AddressType")
      .drop("temperature")

    // Save the output data in the system
    DA.saveFile(enrichedData, "dataAfterProcess.csv")

    // Change the saved csv folder to single csv file
    DA.changeFilePath("dataAfterProcess.csv", "searchingData.csv")

    DA.spark.stop()

  }


}
