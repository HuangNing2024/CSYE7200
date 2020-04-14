
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

object cssmap extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("DefineMap")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
  """),_display_(/*4.4*/defining(play.core.PlayVersion.current)/*4.43*/ { version =>_display_(Seq[Any](format.raw/*4.56*/("""
  """),format.raw/*5.3*/("""<!doctype html>
      <html class="fixed sidebar-left-collapsed">
          <head>
                  <!-- Basic -->
              <meta charset="UTF-8">
              <title>Map Builder | Okler Themes | Porto-Admin</title>
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
                  <!-- Specific Page Vendor CSS -->
              <link rel="stylesheet" href="assets/vendor/select2/select2.css" />
                  <!-- Theme CSS -->
              <link rel="stylesheet" href="assets/stylesheets/theme.css" />
                  <!-- Skin CSS -->
              <link rel="stylesheet" href="assets/stylesheets/skins/default.css" />
                  <!-- Theme Custom CSS -->
              <link rel="stylesheet" href="assets/stylesheets/theme-custom.css">
                  <!-- Head Libs -->
              <script src="assets/vendor/modernizr/modernizr.js"></script>
              <link rel="stylesheet" href="https://unpkg.com/leaflet@1.6.0/dist/leaflet.css"
              integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ=="
              crossorigin=""/>
              <script src="https://unpkg.com/leaflet@1.6.0/dist/leaflet.js"
              integrity="sha512-gZwIG9x3wUXg2hdXF6+rVkLF/0Vi9U8D2Ntg4Ga5I5BZpVkVxlJWbSQtXPSiUTtC0TjtGOmxa1AJPuV0CPthew=="
              crossorigin=""></script>

          </head>
          <body>
              <section class="body">
                      <!-- start: header -->
                  <header>"""),_display_(/*44.28*/cusCommonSidebar()),format.raw/*44.46*/("""</header>
                      <!-- end: header -->

                  <div class="inner-wrapper">
                          <!-- start: sidebar -->
                      """),_display_(/*49.24*/commonSidebar()),format.raw/*49.39*/("""
                          """),format.raw/*50.27*/("""<!-- end: sidebar -->

                      <section role="main" class="content-body">
                          <header class="page-header">
                              <h2>Map Builder</h2>

                              <div class="right-wrapper pull-right">
                                  <ol class="breadcrumbs">
                                      <li>
                                          <a href="index.html">
                                              <i class="fa fa-home"></i>
                                          </a>
                                      </li>
                                      <li><span>Maps</span></li>
                                      <li><span>Builder</span></li>
                                  </ol>

                                  <a class="sidebar-right-toggle" data-open="sidebar-right"><i class="fa fa-chevron-left"></i></a>
                              </div>
                          </header>

                              <!-- start: page -->
                          <section class="content-with-menu" data-theme-gmap-builder>
                              <div class="content-with-menu-container">
                                  <menu id="content-menu" class="inner-menu" role="menu">
                                      <div class="nano">
                                          <div class="nano-content">
                                              <div class="inner-menu-content">
                                                  <hr class="separator" />

                                                  <p class="title">Map Center</p>

                                                  <div class="form-group">
                                                      <div class="row">
                                                          <label class="col-xs-12 control-label" for="latitude">Year</label>
                                                          <div class="col-xs-12">
                                                              <input value = """"),_display_(/*86.80*/results(0)/*86.90*/(9)),format.raw/*86.93*/("""" id="latitude" name="latitude" class="form-control" type="text" data-builder-field="latlng">
                                                          </div>
                                                      </div>
                                                  </div>

                                                  <div class="form-group">
                                                      <div class="row">
                                                          <label class="col-xs-12 control-label" for="longitude">Month</label>
                                                          <div class="col-xs-12">
                                                              <input id="longitude"  value = """"),_display_(/*95.96*/results(0)/*95.106*/(8)),format.raw/*95.109*/("""" name="longitude" class="form-control" type="text" data-builder-field="latlng">
                                                          </div>
                                                      </div>
                                                  </div>
                                                  <hr class="separator" />

                                                  <hr class="separator" />
                                              </div>
                                          </div>
                                      </div>
                                  </menu>
                                  <div class="inner-body">
                                      <div id="gmap"></div>
                                  </div>
                              </div>
                          </section>
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

                  <!-- Specific Page Vendor -->
              <script src="assets/vendor/select2/select2.js"></script>
"""),format.raw/*128.90*/("""
              """),format.raw/*129.15*/("""<script src="assets/javascripts/maps/snazzy.themes.js"></script>

                  <!-- Theme Base, Components and Settings -->
              <script src="assets/javascripts/theme.js"></script>

                  <!-- Theme Custom -->
              <script src="assets/javascripts/theme.custom.js"></script>

                  <!-- Theme Initialization Files -->
              <script src="assets/javascripts/theme.init.js"></script>
              <script type="text/javascript">
                      let r = window.location.search.substr(1);
                      console.log(r);
                      let mymap = L.map('gmap').setView([37.7749,-122.4194], 13);
                      L.tileLayer('https://api.mapbox.com/styles/v1/"""),format.raw/*143.69*/("""{"""),format.raw/*143.70*/("""id"""),format.raw/*143.72*/("""}"""),format.raw/*143.73*/("""/tiles/"""),format.raw/*143.80*/("""{"""),format.raw/*143.81*/("""z"""),format.raw/*143.82*/("""}"""),format.raw/*143.83*/("""/"""),format.raw/*143.84*/("""{"""),format.raw/*143.85*/("""x"""),format.raw/*143.86*/("""}"""),format.raw/*143.87*/("""/"""),format.raw/*143.88*/("""{"""),format.raw/*143.89*/("""y"""),format.raw/*143.90*/("""}"""),format.raw/*143.91*/("""?access_token="""),format.raw/*143.105*/("""{"""),format.raw/*143.106*/("""accessToken"""),format.raw/*143.117*/("""}"""),format.raw/*143.118*/("""', """),format.raw/*143.121*/("""{"""),format.raw/*143.122*/("""
                          """),format.raw/*144.27*/("""attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, <a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery ? <a href="https://www.mapbox.com/">Mapbox</a>',
                          maxZoom: 18,
                          id: 'mapbox/streets-v11',
                          accessToken: 'pk.eyJ1IjoidGlhbmp1IiwiYSI6ImNrM3Q4cmU4cjAwYm4za25rbGU2a3JicHcifQ.oyS4Lf8QqdXFb9MQ2VlWYQ'
                      """),format.raw/*148.23*/("""}"""),format.raw/*148.24*/(""").addTo(mymap);


                      let marker;
                      """),_display_(/*152.24*/for(result <- results) yield /*152.46*/ {_display_(Seq[Any](format.raw/*152.48*/("""
                      """),format.raw/*153.23*/("""marker = L.marker(["""),_display_(/*153.43*/result(6)),format.raw/*153.52*/(""","""),_display_(/*153.54*/result(5)),format.raw/*153.63*/("""]).addTo(mymap);
                      marker.bindPopup("<b>Offense Type:" + """"),_display_(/*154.63*/result(3)),format.raw/*154.72*/(""""
                              + "</b><br>Occurred Date:" + """"),_display_(/*155.62*/result(2)),format.raw/*155.71*/(""""
                              + "<br>Street:" + """"),_display_(/*156.51*/result(13)),format.raw/*156.61*/("""").openPopup();
                      """)))}),format.raw/*157.24*/("""

                      """),format.raw/*159.23*/("""// console.log(mockData.length, mockData[0])
                      //     let marker = new Array(mockData.length)
                      // for(let i = 0; i < mockData.length; i++)"""),format.raw/*161.66*/("""{"""),format.raw/*161.67*/("""
                      """),format.raw/*162.23*/("""//     marker[i] = L.marker([mockData[i].Lat, mockData[i].Long]).addTo(mymap)
                      //     marker[i].bindPopup("<b>Offense Type:" + mockData[i].OFFENSE_CODE_GROUP
                      //             + "</b><br>Occurred Date:" + mockData[i].OCCURRED_ON_DATE
                      //             + "<br>Street:" + mockData[i].STREET).openPopup();
                      // """),format.raw/*166.26*/("""}"""),format.raw/*166.27*/("""

              """),format.raw/*168.15*/("""</script>

                  <!-- Examples -->
"""),format.raw/*171.90*/("""
          """),format.raw/*172.11*/("""</body>
      </html>

  """)))}),format.raw/*175.4*/("""
""")))}),format.raw/*176.2*/("""


"""))
      }
    }
  }

  def render(results:List[List[String]]): play.twirl.api.HtmlFormat.Appendable = apply(results)

  def f:((List[List[String]]) => play.twirl.api.HtmlFormat.Appendable) = (results) => apply(results)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-04-10T19:43:12.966
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/cssmap.scala.html
                  HASH: a5c520b3ad2297f0665f6ab9c79b8c301116ee8a
                  MATRIX: 742->1|866->30|896->35|921->52|960->54|990->59|1037->98|1087->111|1117->115|3622->2595|3661->2613|3866->2791|3902->2806|3958->2834|6090->4939|6109->4949|6133->4952|6898->5690|6918->5700|6943->5703|8736->7556|8781->7572|9557->8319|9587->8320|9618->8322|9648->8323|9684->8330|9714->8331|9744->8332|9774->8333|9804->8334|9834->8335|9864->8336|9894->8337|9924->8338|9954->8339|9984->8340|10014->8341|10058->8355|10089->8356|10130->8367|10161->8368|10194->8371|10225->8372|10282->8400|10790->8879|10820->8880|10927->8959|10966->8981|11007->8983|11060->9007|11108->9027|11139->9036|11169->9038|11200->9047|11308->9127|11339->9136|11431->9200|11462->9209|11543->9262|11575->9272|11647->9312|11702->9338|11912->9519|11942->9520|11995->9544|12415->9935|12445->9936|12492->9954|12571->10093|12612->10105|12672->10134|12706->10137
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|69->44|69->44|74->49|74->49|75->50|111->86|111->86|111->86|120->95|120->95|120->95|153->128|154->129|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|168->143|169->144|173->148|173->148|177->152|177->152|177->152|178->153|178->153|178->153|178->153|178->153|179->154|179->154|180->155|180->155|181->156|181->156|182->157|184->159|186->161|186->161|187->162|191->166|191->166|193->168|196->171|197->172|200->175|201->176
                  -- GENERATED --
              */
          