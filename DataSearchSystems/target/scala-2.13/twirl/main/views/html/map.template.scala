
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

object map extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[List[String]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(results: List[List[String]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.20*/("""
"""),format.raw/*3.21*/("""
"""),format.raw/*4.11*/("""
"""),format.raw/*5.31*/("""
"""),format.raw/*6.29*/("""
"""),format.raw/*7.12*/("""
"""),format.raw/*8.11*/("""
"""),format.raw/*9.38*/("""
"""),format.raw/*10.15*/("""
"""),format.raw/*11.31*/("""
"""),format.raw/*12.28*/("""
"""),format.raw/*13.36*/("""
"""),format.raw/*14.34*/("""
"""),format.raw/*15.29*/("""
"""),format.raw/*16.25*/("""
"""),format.raw/*17.26*/("""
"""),format.raw/*18.16*/("""
"""),format.raw/*19.28*/("""
"""),format.raw/*20.15*/("""
"""),format.raw/*21.26*/("""
"""),format.raw/*22.26*/("""
"""),format.raw/*23.14*/("""
"""),format.raw/*24.16*/("""
"""),format.raw/*25.10*/("""
"""),format.raw/*26.17*/("""
"""),format.raw/*27.12*/("""
"""),format.raw/*28.12*/("""
"""),_display_(/*29.2*/main("DefineMap")/*29.19*/ {_display_(Seq[Any](format.raw/*29.21*/("""
  """),_display_(/*30.4*/defining(play.core.PlayVersion.current)/*30.43*/ { version =>_display_(Seq[Any](format.raw/*30.56*/("""

  """),format.raw/*32.3*/("""<!DOCTYPE html>
    <html lang="en">
        <script>
                function changeStyle() """),format.raw/*35.40*/("""{"""),format.raw/*35.41*/("""
                    """),format.raw/*36.21*/("""var template = document.getElementById("template");
                    var index = template.selectedIndex;
                    var templatevalue = template.options[index].value;
                    var templatecss = document.getElementById("templatecss");
                    templatecss.setAttribute("href","css/" + templatevalue + ".css");
                    document.getElementsByTagName("form")[0].setAttribute("class",templatevalue);
                """),format.raw/*42.17*/("""}"""),format.raw/*42.18*/("""
        """),format.raw/*43.9*/("""</script>
        <style>
                .smart-green """),format.raw/*45.30*/("""{"""),format.raw/*45.31*/("""
                    """),format.raw/*46.21*/("""margin-left:auto;
                    margin-right:auto;
                    max-width: 500px;
                    background: # F8F8F8;
                    padding: 30px 30px 20px 30px;
                    font: 12px Arial, Helvetica, sans-serif;
                    color: # 666;
                    border-radius: 5px;
                    -webkit-border-radius: 5px;
                    -moz-border-radius: 5px;
                """),format.raw/*56.17*/("""}"""),format.raw/*56.18*/("""
                """),format.raw/*57.17*/(""".smart-green h1 """),format.raw/*57.33*/("""{"""),format.raw/*57.34*/("""
                    """),format.raw/*58.21*/("""font: 24px "Trebuchet MS", Arial, Helvetica, sans-serif;
                    padding: 20px 0px 20px 40px;
                    display: block;
                    margin: -30px -30px 10px -30px;
                    color: # FFF;
                    background: # 9DC45F;
                    text-shadow: 1px 1px 1px # 949494;
                    border-radius: 5px 5px 0px 0px;
                    -webkit-border-radius: 5px 5px 0px 0px;
                    -moz-border-radius: 5px 5px 0px 0px;
                    border-bottom:1px solid # 89AF4C;

                """),format.raw/*70.17*/("""}"""),format.raw/*70.18*/("""
                """),format.raw/*71.17*/(""".smart-green h1>span """),format.raw/*71.38*/("""{"""),format.raw/*71.39*/("""
                    """),format.raw/*72.21*/("""display: block;
                    font-size: 11px;
                    color: # FFF;
                """),format.raw/*75.17*/("""}"""),format.raw/*75.18*/("""

                """),format.raw/*77.17*/(""".smart-green label """),format.raw/*77.36*/("""{"""),format.raw/*77.37*/("""
                    """),format.raw/*78.21*/("""display: block;
                    margin: 0px 0px 5px;
                """),format.raw/*80.17*/("""}"""),format.raw/*80.18*/("""
                """),format.raw/*81.17*/(""".smart-green label>span """),format.raw/*81.41*/("""{"""),format.raw/*81.42*/("""
                    """),format.raw/*82.21*/("""float: left;
                    margin-top: 10px;
                    color: # 5E5E5E;
                """),format.raw/*85.17*/("""}"""),format.raw/*85.18*/("""
                """),format.raw/*86.17*/(""".smart-green input[type="text"], .smart-green input[type="email"], .smart-green textarea, .smart-green select """),format.raw/*86.127*/("""{"""),format.raw/*86.128*/("""
                    """),format.raw/*87.21*/("""color: # 555;
                    height: 30px;
                    line-height:15px;
                    width: 100%;
                    padding: 0px 0px 0px 10px;
                    margin-top: 2px;
                    border: 1px solid # E5E5E5;
                    background: # FBFBFB;
                    outline: 0;
                    -webkit-box-shadow: inset 1px 1px 2px rgba(238, 238, 238, 0.2);
                    box-shadow: inset 1px 1px 2px rgba(238, 238, 238, 0.2);
                    font: normal 14px/14px Arial, Helvetica, sans-serif;
                """),format.raw/*99.17*/("""}"""),format.raw/*99.18*/("""
                """),format.raw/*100.17*/(""".smart-green textarea"""),format.raw/*100.38*/("""{"""),format.raw/*100.39*/("""
                    """),format.raw/*101.21*/("""height:100px;
                    padding-top: 10px;
                """),format.raw/*103.17*/("""}"""),format.raw/*103.18*/("""
                """),format.raw/*104.17*/(""".smart-green select """),format.raw/*104.37*/("""{"""),format.raw/*104.38*/("""
                    """),format.raw/*105.21*/("""background: url('down-arrow.png') no-repeat right, -moz-linear-gradient(top, # FBFBFB 0%, # E9E9E9 100%);
                    background: url('down-arrow.png') no-repeat right, -webkit-gradient(linear, left top, left bottom, color-stop(0%,# FBFBFB), color-stop(100%,# E9E9E9));
                    appearance:none;
                    -webkit-appearance:none;
                    -moz-appearance: none;
                    text-indent: 0.01px;
                """),format.raw/*111.17*/("""}"""),format.raw/*111.18*/("""
                """),format.raw/*112.17*/(""".smart-green .button """),format.raw/*112.38*/("""{"""),format.raw/*112.39*/("""
                    """),format.raw/*113.21*/("""background-color: # 9DC45F;
                    border-radius: 5px;
                    -webkit-border-radius: 5px;
                    -moz-border-border-radius: 5px;
                    border: none;
                    padding: 10px 25px 10px 25px;
                    color: # FFF;
                    text-shadow: 1px 1px 1px # 949494;
                """),format.raw/*121.17*/("""}"""),format.raw/*121.18*/("""
                """),format.raw/*122.17*/(""".smart-green .button:hover """),format.raw/*122.44*/("""{"""),format.raw/*122.45*/("""
                    """),format.raw/*123.21*/("""background-color:# 80A24A;
                """),format.raw/*124.17*/("""}"""),format.raw/*124.18*/("""
        """),format.raw/*125.9*/("""</style>
      <head>
          <meta charset="UTF-8">
          <title>Title</title>
          <link rel="stylesheet" href="https://unpkg.com/leaflet@1.6.0/dist/leaflet.css"
          integrity="sha512-xwE/Az9zrjBIphAcBb3F6JVqxf46+CDLwfLMHloNu6KEQCAWi6HcDUbeOfBIptF7tcCzusKFjFw2yuvEpDL9wQ=="
          crossorigin=""/>
          <script src="https://unpkg.com/leaflet@1.6.0/dist/leaflet.js"
          integrity="sha512-gZwIG9x3wUXg2hdXF6+rVkLF/0Vi9U8D2Ntg4Ga5I5BZpVkVxlJWbSQtXPSiUTtC0TjtGOmxa1AJPuV0CPthew=="
          crossorigin=""></script>

      </head>
        <style>

                #marker """),format.raw/*139.25*/("""{"""),format.raw/*139.26*/("""
                    """),format.raw/*140.21*/("""background-image: url('https://docs.mapbox.com/mapbox-gl-js/assets/washington-monument.jpg');
                    background-size: cover;
                    width: 50px;
                    height: 50px;
                    border-radius: 50%;
                    cursor: pointer;
                """),format.raw/*146.17*/("""}"""),format.raw/*146.18*/("""

                """),format.raw/*148.17*/(""".mapboxgl-popup """),format.raw/*148.33*/("""{"""),format.raw/*148.34*/("""
                    """),format.raw/*149.21*/("""max-width: 200px;
                """),format.raw/*150.17*/("""}"""),format.raw/*150.18*/("""

        """),format.raw/*152.9*/("""</style>
      <body>
        <section id="content">
          <div class="wrapper doc">
            <table cellpadding="10">
              <tr>
                <th>INCIDENT_NUMBER</th>
                <th>OFFENSE_CODE_GROUP</th>
                <th>OCCURRED_ON_DATE</th>
                <th>STREET</th>
                <th>Lat</th>
                <th>Long</th>
              </tr>
              """),_display_(/*165.16*/for(result <- results) yield /*165.38*/ {_display_(Seq[Any](format.raw/*165.40*/("""
                """),format.raw/*166.17*/("""<tr>
                """),_display_(/*167.18*/for(r <- result) yield /*167.34*/ {_display_(Seq[Any](format.raw/*167.36*/("""
                  """),format.raw/*168.19*/("""<td>"""),_display_(/*168.24*/r),format.raw/*168.25*/("""</td>
                """)))}),format.raw/*169.18*/("""
                """),format.raw/*170.17*/("""</tr>
              """)))}),format.raw/*171.16*/("""
            """),format.raw/*172.13*/("""</table>
            <br><br>

            <div id="mapid" style="width: 1000px;
              height: 800px;
              display: inline-block"></div>
          </div>

        </section>
              <h1>Contact Form
                  <span>Please fill all the texts in the fields.</span>
              </h1>
              <label>
                  <span>Themplate :</span>
                  <select id="template" name="themplate" onchange="changeStyle();">
                      <option value="basic-grey">basic-grey</option>
                      <option value="elegant-aero">elegant-aero</option>
                      <option value="smart-green">smart-green</option>
                      <option value="white-pink">white-pink</option>
                      <option value="bootstrap-frm">bootstrap-frm</option>
                      <option value="dark-matter">dark-matter</option>
                  </select>
              </label>
              <label>
                  <span>Your Name :</span>
                  <input id="name" type="text" name="name" placeholder="Your Full Name" />
              </label>
              <label>
                  <span>Your Email :</span>
                  <input id="email" type="email" name="email" placeholder="Valid Email Address" />
              </label>

              <label>
                  <span>Message :</span>
                  <textarea id="message" name="message" placeholder="Your Message to Us"></textarea>
              </label>
              <label>
                  <span>Subject :</span><select name="selection">
                  <option value="Job Inquiry">Job Inquiry</option>
                  <option value="General Question">General Question</option>
              </select>
              </label>
              <label>
                  <span>&nbsp;</span>
                  <input type="button" class="button" value="Send" />
              </label>
          </form>
"""),format.raw/*219.50*/("""
"""),format.raw/*220.33*/("""
"""),format.raw/*221.31*/("""
          """),format.raw/*222.11*/("""<script>
                  // mapboxgl.accessToken = 'pk.eyJ1IjoicGluaXN0IiwiYSI6ImNrOGYydm5vdTAwMGUzbG96Znh4Ymk4Y2YifQ.N_TmIcjg9UInZ7G3trxSow';
                  // 37?48?0?N?122?25
                  // 38?53.707?????77
                  // var monument = [-77.0353, 38.8895];
                  // var map = new mapboxgl.Map("""),format.raw/*227.49*/("""{"""),format.raw/*227.50*/("""
                  """),format.raw/*228.19*/("""//     container: 'map',
                  //     style: 'mapbox://styles/mapbox/light-v10',
                  //     center: monument,
                  //     zoom: 15
                  // """),format.raw/*232.22*/("""}"""),format.raw/*232.23*/(""");
                  //
                  // // create the popup
                  // var popup = new mapboxgl.Popup("""),format.raw/*235.53*/("""{"""),format.raw/*235.54*/(""" """),format.raw/*235.55*/("""offset: 25 """),format.raw/*235.66*/("""}"""),format.raw/*235.67*/(""")
                  //         .setText('Construction on the Washington Monument began in 1848.');
                  //
                  // // create DOM element for the marker
                  // var el = document.createElement('div');
                  // el.id = 'marker';
                  //
                  // // create the marker
                  // new mapboxgl.Marker(el)
                  //         .setLngLat(monument)
                  //         .setPopup(popup) // sets a popup on this marker
                  //         .addTo(map);

          </script>

        <script type="text/javascript">
                let r = window.location.search.substr(1);
                console.log(r);
                let mymap = L.map('mapid').setView([37.7749,-122.4194], 13);
                L.tileLayer('https://api.mapbox.com/styles/v1/"""),format.raw/*254.63*/("""{"""),format.raw/*254.64*/("""id"""),format.raw/*254.66*/("""}"""),format.raw/*254.67*/("""/tiles/"""),format.raw/*254.74*/("""{"""),format.raw/*254.75*/("""z"""),format.raw/*254.76*/("""}"""),format.raw/*254.77*/("""/"""),format.raw/*254.78*/("""{"""),format.raw/*254.79*/("""x"""),format.raw/*254.80*/("""}"""),format.raw/*254.81*/("""/"""),format.raw/*254.82*/("""{"""),format.raw/*254.83*/("""y"""),format.raw/*254.84*/("""}"""),format.raw/*254.85*/("""?access_token="""),format.raw/*254.99*/("""{"""),format.raw/*254.100*/("""accessToken"""),format.raw/*254.111*/("""}"""),format.raw/*254.112*/("""', """),format.raw/*254.115*/("""{"""),format.raw/*254.116*/("""
                    """),format.raw/*255.21*/("""attribution: 'Map data &copy; <a href="https://www.openstreetmap.org/">OpenStreetMap</a> contributors, <a href="https://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery ? <a href="https://www.mapbox.com/">Mapbox</a>',
                    maxZoom: 18,
                    id: 'mapbox/streets-v11',
                    accessToken: 'pk.eyJ1IjoidGlhbmp1IiwiYSI6ImNrM3Q4cmU4cjAwYm4za25rbGU2a3JicHcifQ.oyS4Lf8QqdXFb9MQ2VlWYQ'
                """),format.raw/*259.17*/("""}"""),format.raw/*259.18*/(""").addTo(mymap);


                let marker;
                """),_display_(/*263.18*/for(result <- results) yield /*263.40*/ {_display_(Seq[Any](format.raw/*263.42*/("""
                """),format.raw/*264.17*/("""marker = L.marker([37.7749,-122.4194]).addTo(mymap);
                marker.bindPopup("<b>Offense Type:" + """"),_display_(/*265.57*/result(1)),format.raw/*265.66*/(""""
                        + "</b><br>Occurred Date:" + """"),_display_(/*266.56*/result(2)),format.raw/*266.65*/(""""
                        + "<br>Street:" + """"),_display_(/*267.45*/result(0)),format.raw/*267.54*/("""").openPopup();
                """)))}),format.raw/*268.18*/("""

                """),format.raw/*270.17*/("""// console.log(mockData.length, mockData[0])
                //     let marker = new Array(mockData.length)
                // for(let i = 0; i < mockData.length; i++)"""),format.raw/*272.60*/("""{"""),format.raw/*272.61*/("""
                """),format.raw/*273.17*/("""//     marker[i] = L.marker([mockData[i].Lat, mockData[i].Long]).addTo(mymap)
                //     marker[i].bindPopup("<b>Offense Type:" + mockData[i].OFFENSE_CODE_GROUP
                //             + "</b><br>Occurred Date:" + mockData[i].OCCURRED_ON_DATE
                //             + "<br>Street:" + mockData[i].STREET).openPopup();
                // """),format.raw/*277.20*/("""}"""),format.raw/*277.21*/("""

        """),format.raw/*279.9*/("""</script>
      </body>
    </html>
  """)))}),format.raw/*282.4*/("""
""")))}),format.raw/*283.2*/("""


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
                  DATE: 2020-04-01T17:57:27.638
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/map.scala.html
                  HASH: 9f06f7e461030cb645429787152271b1a1811678
                  MATRIX: 739->1|863->30|892->51|921->73|950->85|979->117|1008->147|1037->160|1066->172|1095->211|1125->227|1155->259|1185->288|1215->325|1245->360|1275->390|1305->416|1335->443|1365->460|1395->489|1425->505|1455->532|1485->559|1515->574|1545->591|1575->602|1605->620|1635->633|1665->646|1694->649|1720->666|1760->668|1791->673|1839->712|1890->725|1923->731|2047->827|2076->828|2126->850|2617->1313|2646->1314|2683->1324|2768->1381|2797->1382|2847->1404|3316->1845|3345->1846|3391->1864|3435->1880|3464->1881|3514->1903|4119->2480|4148->2481|4194->2499|4243->2520|4272->2521|4322->2543|4456->2649|4485->2650|4533->2670|4580->2689|4609->2690|4659->2712|4762->2787|4791->2788|4837->2806|4889->2830|4918->2831|4968->2853|5103->2960|5132->2961|5178->2979|5317->3089|5347->3090|5397->3112|6011->3698|6040->3699|6087->3717|6137->3738|6167->3739|6218->3761|6318->3832|6348->3833|6395->3851|6444->3871|6474->3872|6525->3894|7020->4360|7050->4361|7097->4379|7147->4400|7177->4401|7228->4423|7622->4788|7652->4789|7699->4807|7755->4834|7785->4835|7836->4857|7909->4901|7939->4902|7977->4912|8621->5529|8651->5530|8702->5552|9035->5856|9065->5857|9114->5877|9159->5893|9189->5894|9240->5916|9304->5951|9334->5952|9374->5964|9813->6375|9852->6397|9893->6399|9940->6417|9991->6440|10024->6456|10065->6458|10114->6478|10147->6483|10170->6484|10226->6508|10273->6526|10327->6548|10370->6562|12393->8605|12424->8639|12455->8671|12496->8683|12856->9014|12886->9015|12935->9035|13159->9230|13189->9231|13338->9351|13368->9352|13398->9353|13438->9364|13468->9365|14362->10230|14392->10231|14423->10233|14453->10234|14489->10241|14519->10242|14549->10243|14579->10244|14609->10245|14639->10246|14669->10247|14699->10248|14729->10249|14759->10250|14789->10251|14819->10252|14862->10266|14893->10267|14934->10278|14965->10279|14998->10282|15029->10283|15080->10305|15564->10760|15594->10761|15689->10828|15728->10850|15769->10852|15816->10870|15954->10980|15985->10989|16071->11047|16102->11056|16177->11103|16208->11112|16274->11146|16323->11166|16521->11335|16551->11336|16598->11354|16994->11721|17024->11722|17064->11734|17137->11776|17171->11779
                  LINES: 21->1|26->1|27->2|28->3|29->4|30->5|31->6|32->7|33->8|34->9|35->10|36->11|37->12|38->13|39->14|40->15|41->16|42->17|43->18|44->19|45->20|46->21|47->22|48->23|49->24|50->25|51->26|52->27|53->28|54->29|54->29|54->29|55->30|55->30|55->30|57->32|60->35|60->35|61->36|67->42|67->42|68->43|70->45|70->45|71->46|81->56|81->56|82->57|82->57|82->57|83->58|95->70|95->70|96->71|96->71|96->71|97->72|100->75|100->75|102->77|102->77|102->77|103->78|105->80|105->80|106->81|106->81|106->81|107->82|110->85|110->85|111->86|111->86|111->86|112->87|124->99|124->99|125->100|125->100|125->100|126->101|128->103|128->103|129->104|129->104|129->104|130->105|136->111|136->111|137->112|137->112|137->112|138->113|146->121|146->121|147->122|147->122|147->122|148->123|149->124|149->124|150->125|164->139|164->139|165->140|171->146|171->146|173->148|173->148|173->148|174->149|175->150|175->150|177->152|190->165|190->165|190->165|191->166|192->167|192->167|192->167|193->168|193->168|193->168|194->169|195->170|196->171|197->172|244->219|245->220|246->221|247->222|252->227|252->227|253->228|257->232|257->232|260->235|260->235|260->235|260->235|260->235|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|279->254|280->255|284->259|284->259|288->263|288->263|288->263|289->264|290->265|290->265|291->266|291->266|292->267|292->267|293->268|295->270|297->272|297->272|298->273|302->277|302->277|304->279|307->282|308->283
                  -- GENERATED --
              */
          