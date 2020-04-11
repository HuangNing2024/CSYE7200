
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

object downloadCsv extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[List[String]],RequestHeader,MessagesProvider,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(resultsList: List[List[String]])(implicit request: RequestHeader,messagesProvider: MessagesProvider):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.103*/("""
"""),format.raw/*3.1*/("""<!doctype html>
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
      """),format.raw/*19.153*/("""

      """),format.raw/*21.7*/("""<!-- Vendor CSS -->
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
    """),format.raw/*37.77*/("""

  """),format.raw/*39.3*/("""</head>
  <body>
    <section class="body">

        <!-- start: header -->
      <header>"""),_display_(/*44.16*/cusCommonSidebar()),format.raw/*44.34*/("""</header>
        <!-- end: header -->

      <div class="inner-wrapper">
          <!-- start: sidebar -->
        """),_display_(/*49.10*/commonSidebar()),format.raw/*49.25*/("""
          """),format.raw/*50.11*/("""<!-- end: sidebar -->

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

          <section class="panel">
            <header class="panel-heading">
              <div class="panel-actions">
                <a href="#" class="fa fa-caret-down"></a>
                <a href="#" class="fa fa-times"></a>
              </div>

              <h2 class="panel-title">Basic</h2>
            </header>
            <div class="panel-body">
              <table class="table table-bordered table-striped mb-none" id="datatable-default">
                <thead>
                  <tr>
                      <th>PdDistrict</th>
                      <th>Street</th>
                      <th>Weather</th>
                      <th class="hidden-phone">Weekday</th>
                      <th class="hidden-phone">isNight</th>
                      <th >Hour</th>
                      <th >Month</th>
                      <th >Season</th>
                      <th >Occurence</th>
                      <th>predition</th>
                  </tr>
                </thead>
                <tbody>
                  """),_display_(/*97.20*/for(result <- resultsList) yield /*97.46*/ {_display_(Seq[Any](format.raw/*97.48*/("""
                    """),format.raw/*98.21*/("""<tr class="gradeX">
                      <td>"""),_display_(/*99.28*/result(0)),format.raw/*99.37*/("""</td>
                      <td>"""),_display_(/*100.28*/result(1)),format.raw/*100.37*/("""</td>
                      <td>"""),_display_(/*101.28*/result(2)),format.raw/*101.37*/("""</td>
                      <td class="center hidden-phone">"""),_display_(/*102.56*/result(3)),format.raw/*102.65*/("""</td>
                      <td class="center hidden-phone">"""),_display_(/*103.56*/result(4)),format.raw/*103.65*/("""</td>
                      <td>"""),_display_(/*104.28*/result(5)),format.raw/*104.37*/("""</td>
                      <td>"""),_display_(/*105.28*/result(6)),format.raw/*105.37*/("""</td>
                      <td>"""),_display_(/*106.28*/result(7)),format.raw/*106.37*/("""</td>
                      <td>"""),_display_(/*107.28*/result(8)),format.raw/*107.37*/("""</td>
                      <td>"""),_display_(/*108.28*/result(9)),format.raw/*108.37*/("""</td>
                    </tr>
                  """)))}),format.raw/*110.20*/("""
                """),format.raw/*111.17*/("""</tbody>
              </table>
              <h2 align="center"><a href="http://localhost:9000/downloadResult">Download Result</a></h2>
            </div>
          </section>
            <!-- end: page -->
        </section>
      </div>
    </section>

      <!-- Vendor -->
    """),format.raw/*122.71*/("""
    """),format.raw/*123.101*/("""
    """),format.raw/*124.80*/("""
    """),format.raw/*125.83*/("""
    """),format.raw/*126.102*/("""
    """),format.raw/*127.87*/("""
    """),format.raw/*128.95*/("""

    """),format.raw/*130.63*/("""
    """),format.raw/*131.68*/("""

    """),format.raw/*133.40*/("""
    """),format.raw/*134.75*/("""

    """),format.raw/*136.54*/("""
    """),format.raw/*137.73*/("""

  """),format.raw/*139.3*/("""</body>
</html>
"""))
      }
    }
  }

  def render(resultsList:List[List[String]],request:RequestHeader,messagesProvider:MessagesProvider): play.twirl.api.HtmlFormat.Appendable = apply(resultsList)(request,messagesProvider)

  def f:((List[List[String]]) => (RequestHeader,MessagesProvider) => play.twirl.api.HtmlFormat.Appendable) = (resultsList) => (request,messagesProvider) => apply(resultsList)(request,messagesProvider)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-10T19:38:14.471
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/downloadCsv.scala.html
                  HASH: 3c93779fcfaca8958d06c3c43a4f76b39019d758
                  MATRIX: 778->3|975->104|1003->106|1566->786|1603->796|2333->1570|2366->1576|2489->1672|2528->1690|2677->1812|2713->1827|2753->1839|4433->3492|4475->3518|4515->3520|4565->3542|4640->3590|4670->3599|4732->3633|4763->3642|4825->3676|4856->3685|4946->3747|4977->3756|5067->3818|5098->3827|5160->3861|5191->3870|5253->3904|5284->3913|5346->3947|5377->3956|5439->3990|5470->3999|5532->4033|5563->4042|5648->4095|5695->4113|6017->4472|6053->4574|6088->4655|6123->4739|6159->4842|6194->4930|6229->5026|6266->5092|6301->5161|6338->5204|6373->5280|6410->5337|6445->5411|6479->5417
                  LINES: 21->2|26->2|27->3|43->19|45->21|61->37|63->39|68->44|68->44|73->49|73->49|74->50|121->97|121->97|121->97|122->98|123->99|123->99|124->100|124->100|125->101|125->101|126->102|126->102|127->103|127->103|128->104|128->104|129->105|129->105|130->106|130->106|131->107|131->107|132->108|132->108|134->110|135->111|146->122|147->123|148->124|149->125|150->126|151->127|152->128|154->130|155->131|157->133|158->134|160->136|161->137|163->139
                  -- GENERATED --
              */
          