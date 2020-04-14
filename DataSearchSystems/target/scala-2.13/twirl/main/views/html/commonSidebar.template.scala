
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

object commonSidebar extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),_display_(/*2.2*/defining(play.core.PlayVersion.current)/*2.41*/ { version =>_display_(Seq[Any](format.raw/*2.54*/("""
  """),format.raw/*3.3*/("""<aside id="sidebar-left" class="sidebar-left">

    <div class="sidebar-header">
      <div class="sidebar-title">
        Navigation
      </div>
      <div class="sidebar-toggle hidden-xs" data-toggle-class="sidebar-left-collapsed" data-target="html" data-fire-event="sidebar-left-toggle">
        <i class="fa fa-bars" aria-label="Toggle sidebar"></i>
      </div>
    </div>

    <div class="nano">
      <div class="nano-content">
        <nav id="menu" class="nav-main" role="navigation">
          <ul class="nav nav-main">
            <li>
              <a href=""""),_display_(/*19.25*/routes/*19.31*/.HomeController.dashboard()),format.raw/*19.58*/("""">

                <i class="fa fa-home" aria-hidden="true"></i>
                <span>Dashboard</span>
              </a>
            </li>

            <li class="nav-parent nav-expanded nav-active">
              <a>
                <i class="fa fa-list-alt" aria-hidden="true"></i>
                <span>Forms</span>
              </a>
              <ul class="nav nav-children">

                <li class="nav-active">
                  <a href=""""),_display_(/*34.29*/routes/*34.35*/.HomeController.datasearch()),format.raw/*34.63*/("""">
                    <i class="fa fa-map-marker" aria-hidden="true"></i>
                    <span>Find history Info</span>
                  </a>

                </li>
                <li class="nav-active">
                  <a href=""""),_display_(/*41.29*/routes/*41.35*/.HomeController.nlpSearch()),format.raw/*41.62*/("""">
                    <i class="fa fa-list-alt" aria-hidden="true"></i>
                    <span>Find NLP Prediction</span>

                  </a>
                </li>
              </ul>
            </li>
            <li class="nav-parent">
              <a href=""""),_display_(/*50.25*/routes/*50.31*/.HomeController.downloadCsv()),format.raw/*50.60*/("""">
                <i class="fa fa-table" aria-hidden="true"></i>
                <span>Tables</span>
              </a>
              <ul class="nav nav-children">
                <li>
                  <a href="tables-basic.html">
                    Basic
                  </a>
                </li>

              </ul>
            </li>


          </ul>
        </nav>

        <hr class="separator" />

        <div class="sidebar-widget widget-tasks">
          <div class="widget-header">

          </div>
          <div class="widget-content">

          </div>
        </div>

        <hr class="separator" />


      </div>

    </div>

  </aside>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-10T19:23:10.226
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/commonSidebar.scala.html
                  HASH: 0dff39a1bd7eb0a3cfaa44207496ff62027f2b09
                  MATRIX: 730->1|826->3|854->6|901->45|951->58|981->62|1596->650|1611->656|1659->683|2155->1152|2170->1158|2219->1186|2493->1433|2508->1439|2556->1466|2862->1745|2877->1751|2927->1780
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|44->19|44->19|44->19|59->34|59->34|59->34|66->41|66->41|66->41|75->50|75->50|75->50
                  -- GENERATED --
              */
          