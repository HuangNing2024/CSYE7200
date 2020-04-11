package models

import play.api.data._
import play.api.data.Forms._

case class BasicForm(year: Int, month: Int, street: String, crimeType: String)

// this could be defined somewhere else,
// but I prefer to keep it in the companion object
object BasicForm {
  val form: Form[BasicForm] = Form(
    mapping(
      "year" -> default(number, 0),
      "month" -> default(number, 0),
      "street" -> text,
      "crimeType" -> text
    )(BasicForm.apply)(BasicForm.unapply)
  )
}
