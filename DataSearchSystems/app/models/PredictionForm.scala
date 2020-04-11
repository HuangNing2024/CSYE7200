package models

import scala.io.Source

case class PredictionForm(year: Int, month: Int, street: String, crimeType: String)

object PredictionForm {
  def read_result_csv(path:String):List[List[String]]={
    var bufferedSource = Source.fromFile(path)

    var resultList: List[List[String]] = List()

    for (line <- bufferedSource.getLines) {
      val cols = line.split(",")
      resultList = resultList :+ cols.toList

    }
    resultList

  }
}
