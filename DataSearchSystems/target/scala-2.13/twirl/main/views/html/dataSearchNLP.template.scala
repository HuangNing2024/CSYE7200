
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

object dataSearchNLP extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[Form[NLPForm],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(userForm: Form[NLPForm])(implicit request: RequestHeader,messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.95*/("""
  """),format.raw/*3.3*/("""<!doctype html>
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
"""),format.raw/*19.147*/("""

          """),format.raw/*21.11*/("""<!-- Vendor CSS -->
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
"""),format.raw/*37.73*/("""

      """),format.raw/*39.7*/("""</head>
      <body>
        <section class="body">

            <!-- start: header -->
            <header>"""),_display_(/*44.22*/cusCommonSidebar()),format.raw/*44.40*/("""</header>
            <!-- end: header -->

            <div class="inner-wrapper">
              <!-- start: sidebar -->
            """),_display_(/*49.14*/commonSidebar()),format.raw/*49.29*/("""
              """),format.raw/*50.15*/("""<!-- end: sidebar -->

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

                        <div class="form-group">
                          <label class="col-sm-4 control-label">Crime Description: </label>
                          <div class="col-sm-8">
                            """),_display_(/*88.30*/helper/*88.36*/.form(action = routes.HomeController.simpleFormPost())/*88.90*/ {_display_(Seq[Any](format.raw/*88.92*/("""
                              """),_display_(/*89.32*/helper/*89.38*/.CSRF.formField),format.raw/*89.53*/("""
                              """),_display_(/*90.32*/helper/*90.38*/.inputText(userForm("description"))),format.raw/*90.73*/("""

                              """),format.raw/*92.31*/("""<input type="submit"  value="Submit">
                            """)))}),format.raw/*93.30*/("""
                          """),format.raw/*94.27*/("""</div>
                        </div>
                      </div>
                      <footer class="panel-footer">
                      </footer>
                    </section>

                </div>
                <!-- end: page -->
            </section>
          </div>
        </section>

          <!-- Vendor -->
"""),format.raw/*108.67*/("""
"""),format.raw/*109.97*/("""
"""),format.raw/*110.76*/("""
"""),format.raw/*111.79*/("""
"""),format.raw/*112.98*/("""
"""),format.raw/*113.83*/("""
"""),format.raw/*114.91*/("""

"""),format.raw/*116.59*/("""
"""),format.raw/*117.64*/("""

"""),format.raw/*119.36*/("""
"""),format.raw/*120.71*/("""

"""),format.raw/*122.50*/("""
"""),format.raw/*123.69*/("""

      """),format.raw/*125.7*/("""</body>
    </html>
"""))
      }
    }
  }

  def render(userForm:Form[NLPForm],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(userForm)(request,messagesProvider)

  def f:((Form[NLPForm]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (userForm) => (request,messagesProvider) => apply(userForm)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-10T19:38:14.460
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/dataSearchNLP.scala.html
                  HASH: f370a59948bee46a4cee27f38dcc872071929b08
                  MATRIX: 775->3|963->96|993->100|1594->818|1636->832|2406->1646|2443->1656|2584->1770|2623->1788|2790->1928|2826->1943|2870->1959|4291->3353|4306->3359|4369->3413|4409->3415|4469->3448|4484->3454|4520->3469|4580->3502|4595->3508|4651->3543|4713->3577|4812->3645|4868->3673|5238->4080|5269->4178|5300->4255|5331->4335|5362->4434|5393->4518|5424->4610|5457->4672|5488->4737|5521->4776|5552->4848|5585->4901|5616->4971|5654->4981
                  LINES: 21->2|26->2|27->3|43->19|45->21|61->37|63->39|68->44|68->44|73->49|73->49|74->50|112->88|112->88|112->88|112->88|113->89|113->89|113->89|114->90|114->90|114->90|116->92|117->93|118->94|132->108|133->109|134->110|135->111|136->112|137->113|138->114|140->116|141->117|143->119|144->120|146->122|147->123|149->125
                  -- GENERATED --
              */
          