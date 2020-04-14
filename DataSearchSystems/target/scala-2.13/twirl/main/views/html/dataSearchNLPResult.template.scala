
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
/*1.2*/import helper._

object dataSearchNLPResult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(results: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.19*/("""
"""),_display_(/*4.2*/main("Welcome")/*4.17*/ {_display_(Seq[Any](format.raw/*4.19*/("""
  """),_display_(/*5.4*/defining(play.core.PlayVersion.current)/*5.43*/ { version =>_display_(Seq[Any](format.raw/*5.56*/("""
  """),format.raw/*6.3*/("""<!doctype html>
    <html class="fixed">
      <head>

          <!-- Basic -->
        <meta charset="UTF-8">

        <title>NLP Search Result</title>
          <!-- Mobile Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

          <!-- Web Fonts  -->
        <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800|Shadows+Into+Light" rel="stylesheet" type="text/css">

          <!-- Vendor CSS -->
        <link rel="stylesheet" href="assets/vendor/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" href="assets/vendor/font-awesome/css/font-awesome.css" />
        <link rel="stylesheet" href="assets/vendor/magnific-popup/magnific-popup.css" />
        <link rel="stylesheet" href="assets/vendor/bootstrap-datepicker/css/datepicker3.css" />

          <!-- Theme CSS -->
        <link rel="stylesheet" href="assets/stylesheets/theme.css" />

          <!-- Skin CSS -->
        <link rel="stylesheet" href="assets/stylesheets/skins/default.css" />

          <!-- Theme Custom CSS -->
        <link rel="stylesheet" href="assets/stylesheets/theme-custom.css">

          <!-- Head Libs -->
        <script src="assets/vendor/modernizr/modernizr.js"></script>

      </head>
      <body>
        <section class="body">

            <!-- start: header -->
          <header>"""),_display_(/*43.20*/cusCommonSidebar()),format.raw/*43.38*/("""</header>
            <!-- end: header -->

          <div class="inner-wrapper">
              <!-- start: sidebar -->
            """),_display_(/*48.14*/commonSidebar()),format.raw/*48.29*/("""
            """),format.raw/*49.13*/("""<!-- end: header -->
            <section role="main" class="content-body">
              <header class="page-header">
                <h2>Form Layouts</h2>

                <div class="right-wrapper pull-right">
                  <ol class="breadcrumbs">
                    <li>
                      <a href="index.html">
                        <i class="fa fa-home"></i>
                      </a>
                    </li>
                    <li><span>Forms</span></li>

                  </ol>

                  <a class="sidebar-right-toggle" data-open="sidebar-right"><i class="fa fa-chevron-left"></i></a>
                </div>
              </header>

                <!-- start: page -->

                <div class="row">
                  <form id="form1" class="form-horizontal">
                    <section class="panel">
                      <header class="panel-heading">
                        <div class="panel-actions">
                          <a href="#" class="fa fa-caret-down"></a>
                          <a href="#" class="fa fa-times"></a>
                        </div>

                        <h2 class="panel-title">Data Search Form</h2>

                      </header>
                      <div class="panel-body">

                        <div class="form-group">
                          <label class="col-sm-4 control-label">Crime Type: </label>
                          <div class="col-sm-8">
                            <input type="text" name="name" class="form-control" value=""""),_display_(/*88.89*/results),format.raw/*88.96*/("""">
                          </div>
                        </div>
                      </div>
                      <footer class="panel-footer">
                        <button class="btn btn-primary">Submit </button>
                        <button type="reset" class="btn btn-default">Reset</button>
                      </footer>
                    </section>
                  </form>
                </div>
                <!-- end: page -->
            </section>
          </div>
        </section>

          <!-- Vendor -->
        <script src="assets/vendor/jquery/jquery.js"></script>
        <script src="assets/vendor/jquery-browser-mobile/jquery.browser.mobile.js"></script>
        <script src="assets/vendor/bootstrap/js/bootstrap.js"></script>
        <script src="assets/vendor/nanoscroller/nanoscroller.js"></script>
        <script src="assets/vendor/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
        <script src="assets/vendor/magnific-popup/magnific-popup.js"></script>
        <script src="assets/vendor/jquery-placeholder/jquery.placeholder.js"></script>

          <!-- Theme Base, Components and Settings -->
        <script src="assets/javascripts/theme.js"></script>

          <!-- Theme Custom -->
        <script src="assets/javascripts/theme.custom.js"></script>

          <!-- Theme Initialization Files -->
        <script src="assets/javascripts/theme.init.js"></script>

      </body>
    </html>
  """)))}),format.raw/*124.4*/("""
""")))}))
      }
    }
  }

  def render(results:String): play.twirl.api.HtmlFormat.Appendable = apply(results)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (results) => apply(results)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-10T19:42:01.462
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/dataSearchNLPResult.scala.html
                  HASH: f8585f6ff6d248d60801f02855d455ec7501e56f
                  MATRIX: 432->1|766->21|878->38|906->41|929->56|968->58|998->63|1045->102|1095->115|1125->119|2586->1553|2625->1571|2790->1709|2826->1724|2868->1738|4466->3309|4494->3316|6020->4811
                  LINES: 17->1|22->3|27->3|28->4|28->4|28->4|29->5|29->5|29->5|30->6|67->43|67->43|72->48|72->48|73->49|112->88|112->88|148->124
                  -- GENERATED --
              */
          