package models

import play.api.data._
import play.api.data.Forms._

case class NLPForm(description: String)

// this could be defined somewhere else,
// but I prefer to keep it in the companion object
object NLPForm {
  val form: Form[NLPForm] = Form(
    mapping(
      "description" -> text
    )(NLPForm.apply)(NLPForm.unapply)
  )
}
