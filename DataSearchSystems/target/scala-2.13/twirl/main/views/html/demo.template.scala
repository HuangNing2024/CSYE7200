
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object demo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[NLPForm],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[NLPForm])(implicit request: RequestHeader,messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.95*/("""
"""),_display_(/*2.2*/main("Welcome")/*2.17*/ {_display_(Seq[Any](format.raw/*2.19*/("""
"""),_display_(/*3.2*/defining(play.core.PlayVersion.current)/*3.41*/ { version =>_display_(Seq[Any](format.raw/*3.54*/("""

"""),format.raw/*5.1*/("""<section id="content">
  <div class="wrapper doc">
    <article>


      <img src="assets/images/play-stack.png" alt="Play Stack" class="small-5 medium-4 large-3" />

      <ul>
        <li><a href=""""),_display_(/*13.23*/routes/*13.29*/.HomeController.index),format.raw/*13.50*/("""#Introduction">Projects Introduction</a>
        <li><a href=""""),_display_(/*14.23*/routes/*14.29*/.HomeController.nlpSearch()),format.raw/*14.56*/("""">Search</a>

      </ul>
      """),_display_(/*17.8*/helper/*17.14*/.form(action = helper.CSRF(routes.HomeController.simpleFormPost()))/*17.81*/ {_display_(Seq[Any](format.raw/*17.83*/("""
        """),_display_(/*18.10*/helper/*18.16*/.inputText(userForm("description"))),format.raw/*18.51*/("""

        """),format.raw/*20.9*/("""<input type="submit"  value="Submit">
        """)))}),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""</article>
    <aside class="">
      """),_display_(/*24.8*/commonSidebar()),format.raw/*24.23*/("""
    """),format.raw/*25.5*/("""</aside>
  </div>
</section>
""")))}),format.raw/*28.2*/("""
""")))}))
      }
    }
  }

  def render(userForm:Form[NLPForm],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(request,messagesProvider)

  def f:((Form[NLPForm]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (request,messagesProvider) => apply(userForm)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-08T16:38:58.463
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/demo.scala.html
                  HASH: e18ad14b0a676172707effb54f88f1aaf2ac9ded
                  MATRIX: 766->1|954->94|982->97|1005->112|1044->114|1072->117|1119->156|1169->169|1199->173|1434->381|1449->387|1491->408|1582->472|1597->478|1645->505|1707->541|1722->547|1798->614|1838->616|1876->627|1891->633|1947->668|1986->680|2065->728|2098->734|2165->775|2201->790|2234->796|2297->829
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|28->3|28->3|30->5|38->13|38->13|38->13|39->14|39->14|39->14|42->17|42->17|42->17|42->17|43->18|43->18|43->18|45->20|46->21|47->22|49->24|49->24|50->25|53->28
                  -- GENERATED --
              */
          