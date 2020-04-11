
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

object dataSearch extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[BasicForm],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(userForm: Form[BasicForm])(implicit request: RequestHeader,messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.97*/("""
"""),_display_(/*2.2*/main("Welcome")/*2.17*/ {_display_(Seq[Any](format.raw/*2.19*/("""
  """),_display_(/*3.4*/defining(play.core.PlayVersion.current)/*3.43*/ { version =>_display_(Seq[Any](format.raw/*3.56*/("""
  """),format.raw/*4.3*/("""<!doctype html>
    <html class="fixed">
      <head>
          <!-- Basic -->
        <meta charset="UTF-8">

        <title>SearchDate</title>
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
          <header>"""),_display_(/*39.20*/cusCommonSidebar()),format.raw/*39.38*/("""</header>
            <!-- end: header -->

          <div class="inner-wrapper">
              <!-- start: sidebar -->
            <aside id="sidebar-left" class="sidebar-left">"""),_display_(/*44.60*/commonSidebar()),format.raw/*44.75*/("""</aside>
              <!-- end: sidebar -->

            <section role="main" class="content-body">
              <header class="page-header">
                <h2>San Francisco Data Search Panel </h2>

                <div class="right-wrapper pull-right">
                  <ol class="breadcrumbs">
                    <li>
                      <i class="fa fa-home"></i>

                    </li>
                  </ol>

                  <a class="sidebar-right-toggle" data-open="sidebar-right"><i class="fa fa-chevron-left"></i></a>
                </div>
              </header>

                <!-- start: page -->

                <div class="row">

                    <section class="panel">
                      <header class="panel-heading">
                        <div class="panel-actions">
                          <a href="#" class="fa fa-caret-down"></a>
                          <a href="#" class="fa fa-times"></a>
                        </div>

                        <h2 class="panel-title">Data Search Form</h2>

                      </header>
                      <div class="panel-body">

                        """),_display_(/*79.26*/helper/*79.32*/.form(action = helper.CSRF(routes.HomeController.simpleFormPost2()))/*79.100*/ {_display_(Seq[Any](format.raw/*79.102*/("""
                          """),_display_(/*80.28*/helper/*80.34*/.inputText(userForm("year"))),format.raw/*80.62*/("""
                          """),_display_(/*81.28*/helper/*81.34*/.inputText(userForm("month"))),format.raw/*81.63*/("""
                          """),_display_(/*82.28*/helper/*82.34*/.inputText(userForm("street"))),format.raw/*82.64*/("""
                          """),_display_(/*83.28*/helper/*83.34*/.inputText(userForm("crimeType"))),format.raw/*83.67*/("""
                          """),format.raw/*84.27*/("""<input style = "display:inline-block; width:150px; height:30px; margin-left: 100px" type="submit" value="Submit">
                          """)))}),format.raw/*85.28*/("""

                      """),format.raw/*87.23*/("""</div>
                    </section>

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
  """)))}),format.raw/*116.4*/("""
""")))}))
      }
    }
  }

  def render(userForm:Form[BasicForm],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(request,messagesProvider)

  def f:((Form[BasicForm]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (request,messagesProvider) => apply(userForm)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-10T16:49:02.890
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/dataSearch.scala.html
                  HASH: 4742c32805c2079c8851dc763a1e7d48cde333af
                  MATRIX: 774->1|964->96|992->99|1015->114|1054->116|1084->121|1131->160|1181->173|1211->177|2661->1600|2700->1618|2911->1802|2947->1817|4160->3003|4175->3009|4253->3077|4294->3079|4350->3108|4365->3114|4414->3142|4470->3171|4485->3177|4535->3206|4591->3235|4606->3241|4657->3271|4713->3300|4728->3306|4782->3339|4838->3367|5011->3509|5065->3535|6229->4668
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|28->3|28->3|29->4|64->39|64->39|69->44|69->44|104->79|104->79|104->79|104->79|105->80|105->80|105->80|106->81|106->81|106->81|107->82|107->82|107->82|108->83|108->83|108->83|109->84|110->85|112->87|141->116
                  -- GENERATED --
              */
          