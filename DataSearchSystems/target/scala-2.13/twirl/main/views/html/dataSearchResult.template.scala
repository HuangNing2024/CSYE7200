
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

object dataSearchResult extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
  """),_display_(/*4.4*/defining(play.core.PlayVersion.current)/*4.43*/ { version =>_display_(Seq[Any](format.raw/*4.56*/("""
  """),format.raw/*5.3*/("""<!doctype html>
    <html class="fixed">
      <head>

          <!-- Basic -->
        <meta charset="UTF-8">

        <title>Form Layouts | Okler Themes | Porto-Admin</title>
        <meta name="keywords" content="HTML5 Admin Template" />
        <meta name="description" content="Porto Admin - Responsive HTML5 Template">
        <meta name="author" content="okler.net">

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
          <header>"""),_display_(/*46.20*/cusCommonSidebar()),format.raw/*46.38*/("""</header>
            <!-- end: header -->


          <div class="inner-wrapper">
              <!-- start: sidebar -->
            """),_display_(/*52.14*/commonSidebar()),format.raw/*52.29*/("""
              """),format.raw/*53.15*/("""<!-- end: sidebar -->

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
                    <li><span>Layouts</span></li>
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
                          <label class="col-sm-4 control-label">Month: </label>
                          <div class="col-sm-8">
                            <input type="text" name="name" class="form-control">
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="col-sm-4 control-label">Day: </label>
                          <div class="col-sm-8">
                            <input type="text" name="name" class="form-control">
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="col-sm-4 control-label">Year: </label>
                          <div class="col-sm-8">
                            <input type="text" name="name" class="form-control">
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="col-sm-4 control-label">Street: </label>
                          <div class="col-sm-8">
                            <input type="text" name="name" class="form-control">
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="col-sm-4 control-label">Police Officer Name: </label>
                          <div class="col-sm-8">
                            <input type="text" name="name" class="form-control">
                          </div>
                        </div>
                        <div class="form-group">
                          <label class="col-sm-4 control-label">Crime Type: </label>
                          <div class="col-sm-8">
                            <input type="text" name="name" class="form-control">
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
  """)))}),format.raw/*158.4*/("""
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
                  DATE: 2020-04-10T19:42:01.469
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/dataSearchResult.scala.html
                  HASH: a363a4b9dd65ef6e226ec4931f5ca6cef678a35b
                  MATRIX: 733->1|829->3|859->8|882->23|921->25|951->30|998->69|1048->82|1078->86|2765->1746|2804->1764|2971->1904|3007->1919|3051->1935|7845->6698
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|71->46|71->46|77->52|77->52|78->53|183->158
                  -- GENERATED --
              */
          