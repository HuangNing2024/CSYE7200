package models

import play.api.data._
import play.api.data.Forms._

case class BasicForm(Year: Int, Month: Int, Street: String, CrimeType: String)

// this could be defined somewhere else,
// but I prefer to keep it in the companion object
object BasicForm {
  val form: Form[BasicForm] = Form(
    mapping(
      "Year" -> number(min = 2003,max=2015),
      "Month" -> number(min = 1,max=12),
      "Street" -> nonEmptyText,
      "CrimeType" -> nonEmptyText
    )(BasicForm.apply)(BasicForm.unapply)
  )
}
