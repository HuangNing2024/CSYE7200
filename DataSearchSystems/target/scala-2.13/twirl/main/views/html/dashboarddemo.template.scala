
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

object dashboarddemo extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Hello World")/*3.21*/ {_display_(Seq[Any](format.raw/*3.23*/("""
	"""),_display_(/*4.3*/defining(play.core.PlayVersion.current)/*4.42*/ { version =>_display_(Seq[Any](format.raw/*4.55*/("""
"""),format.raw/*5.1*/("""<!doctype html>
<html class="fixed">
	<head>

		<!-- Basic -->
		<meta charset="UTF-8">

		<title>Dashboard | JSOFT Themes | JSOFT-Admin</title>
		<meta name="keywords" content="HTML5 Admin Template" />
		<meta name="description" content="JSOFT Admin - Responsive HTML5 Template">
		

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
		<link rel="stylesheet" href="assets/vendor/jquery-ui/css/ui-lightness/jquery-ui-1.10.4.custom.css" />
		<link rel="stylesheet" href="assets/vendor/bootstrap-multiselect/bootstrap-multiselect.css" />
		<link rel="stylesheet" href="assets/vendor/morris/morris.css" />

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
			<header>"""),_display_(/*51.13*/cusCommonSidebar()),format.raw/*51.31*/("""</header>
			<!-- end: header -->

			<div class="inner-wrapper">
				<!-- start: sidebar -->
				"""),_display_(/*56.6*/commonSidebar()),format.raw/*56.21*/("""
				"""),format.raw/*57.5*/("""<!-- end: sidebar -->

				<section role="main" class="content-body">
					<header class="page-header">
						<h2>Dashboard</h2>
					
						<div class="right-wrapper pull-right">
							<ol class="breadcrumbs">
								<li>
									<a href="index.html">
										<i class="fa fa-home"></i>
									</a>
								</li>
								<li><span>Dashboard</span></li>
							</ol>
					
							<a class="sidebar-right-toggle" data-open="sidebar-right"><i class="fa fa-chevron-left"></i></a>
						</div>
					</header>

						<div class="row">
						<div class="col-md-6">
							<section class="panel">
								<header class="panel-heading">
									<div class="panel-actions">
										<a href="#" class="fa fa-caret-down"></a>
										<a href="#" class="fa fa-times"></a>
									</div>

									<h2 class="panel-title">Best Seller</h2>
									<p class="panel-subtitle">Customize the graphs as much as you want, there are so many options and features to display information using JSOFT Admin Template.</p>
								</header>
								<div class="panel-body">

									<!-- Flot: Basic -->
									<div class="chart chart-md" id="flotDashBasic"></div>
									<script>

										var flotDashBasicData = ["""),format.raw/*95.36*/("""{"""),format.raw/*95.37*/("""
											"""),format.raw/*96.12*/("""data: [
												[0, 170],
												[1, 169],
												[2, 173],
												[3, 188],
												[4, 147],
												[5, 113],
												[6, 128],
												[7, 169],
												[8, 173],
												[9, 128],
												[10, 128]
											],
											label: "Series 1",
											color: "#0088cc"
										"""),format.raw/*111.11*/("""}"""),format.raw/*111.12*/(""", """),format.raw/*111.14*/("""{"""),format.raw/*111.15*/("""
											"""),format.raw/*112.12*/("""data: [
												[0, 115],
												[1, 124],
												[2, 114],
												[3, 121],
												[4, 115],
												[5, 83],
												[6, 102],
												[7, 148],
												[8, 147],
												[9, 103],
												[10, 113]
											],
											label: "Series 2",
											color: "#2baab1"
										"""),format.raw/*127.11*/("""}"""),format.raw/*127.12*/(""", """),format.raw/*127.14*/("""{"""),format.raw/*127.15*/("""
											"""),format.raw/*128.12*/("""data: [
												[0, 70],
												[1, 69],
												[2, 73],
												[3, 88],
												[4, 47],
												[5, 13],
												[6, 28],
												[7, 69],
												[8, 73],
												[9, 28],
												[10, 28]
											],
											label: "Series 3",
											color: "#734ba9"
										"""),format.raw/*143.11*/("""}"""),format.raw/*143.12*/("""];

										// See: assets/javascripts/dashboard/examples.dashboard.js for more settings.

									</script>

								</div>
							</section>
						</div>
						<div class="col-md-6">
							<section class="panel">
								<header class="panel-heading">
									<div class="panel-actions">
										<a href="#" class="fa fa-caret-down"></a>
										<a href="#" class="fa fa-times"></a>
									</div>
									<h2 class="panel-title">Server Usage</h2>
									<p class="panel-subtitle">It's easy to create custom graphs on JSOFT Admin Template, there are several graph types that you can use, such as lines, bars, pie charts, etc...</p>
								</header>
								<div class="panel-body">

									<!-- Flot: Curves -->
									<div class="chart chart-md" id="flotDashRealTime"></div>

								</div>
							</section>
						</div>
					</div>

					<!-- start: page -->
					<div class="row">
						<div class="col-md-6 col-lg-12 col-xl-6">
							<section class="panel">
								<div class="panel-body">
									<div class="row">
										<div class="col-lg-8">
											<div class="chart-data-selector" id="salesSelectorWrapper">
												<h2>
													Sales:
													<strong>
														<select class="form-control" id="salesSelector">
															<option value="JSOFT Admin" selected>JSOFT Admin</option>
															<option value="JSOFT Drupal" >JSOFT Drupal</option>
															<option value="JSOFT Wordpress" >JSOFT Wordpress</option>
														</select>
													</strong>
												</h2>

												<div id="salesSelectorItems" class="chart-data-selector-items mt-sm">
													<!-- Flot: Sales JSOFT Admin -->
													<div class="chart chart-sm" data-sales-rel="JSOFT Admin" id="flotDashSales1" class="chart-active"></div>
													<script>

														var flotDashSales1Data = ["""),format.raw/*196.41*/("""{"""),format.raw/*196.42*/("""
														    """),format.raw/*197.19*/("""data: [
														        ["Jan", 140],
														        ["Feb", 240],
														        ["Mar", 190],
														        ["Apr", 140],
														        ["May", 180],
														        ["Jun", 320],
														        ["Jul", 270],
														        ["Aug", 180]
														    ],
														    color: "#0088cc"
														"""),format.raw/*208.15*/("""}"""),format.raw/*208.16*/("""];

														// See: assets/javascripts/dashboard/examples.dashboard.js for more settings.

													</script>

													<!-- Flot: Sales JSOFT Drupal -->
													<div class="chart chart-sm" data-sales-rel="JSOFT Drupal" id="flotDashSales2" class="chart-hidden"></div>
													<script>

														var flotDashSales2Data = ["""),format.raw/*218.41*/("""{"""),format.raw/*218.42*/("""
														    """),format.raw/*219.19*/("""data: [
														        ["Jan", 240],
														        ["Feb", 240],
														        ["Mar", 290],
														        ["Apr", 540],
														        ["May", 480],
														        ["Jun", 220],
														        ["Jul", 170],
														        ["Aug", 190]
														    ],
														    color: "#2baab1"
														"""),format.raw/*230.15*/("""}"""),format.raw/*230.16*/("""];

														// See: assets/javascripts/dashboard/examples.dashboard.js for more settings.

													</script>

													<!-- Flot: Sales JSOFT Wordpress -->
													<div class="chart chart-sm" data-sales-rel="JSOFT Wordpress" id="flotDashSales3" class="chart-hidden"></div>
													<script>

														var flotDashSales3Data = ["""),format.raw/*240.41*/("""{"""),format.raw/*240.42*/("""
														    """),format.raw/*241.19*/("""data: [
														        ["Jan", 840],
														        ["Feb", 740],
														        ["Mar", 690],
														        ["Apr", 940],
														        ["May", 1180],
														        ["Jun", 820],
														        ["Jul", 570],
														        ["Aug", 780]
														    ],
														    color: "#734ba9"
														"""),format.raw/*252.15*/("""}"""),format.raw/*252.16*/("""];

														// See: assets/javascripts/dashboard/examples.dashboard.js for more settings.

													</script>
												</div>

											</div>
										</div>
										<div class="col-lg-4 text-center">
											<h2 class="panel-title mt-md">Sales Goal</h2>
											<div class="liquid-meter-wrapper liquid-meter-sm mt-lg">
												<div class="liquid-meter">
													<meter min="0" max="100" value="35" id="meterSales"></meter>
												</div>
												<div class="liquid-meter-selector" id="meterSalesSel">
													<a href="#" data-val="35" class="active">Monthly Goal</a>
													<a href="#" data-val="28">Annual Goal</a>
												</div>
											</div>
										</div>
									</div>
								</div>
							</section>
						</div>
						<div class="col-md-6 col-lg-12 col-xl-6">

						</div>
					</div>



					<div class="row">
						<div class="col-xl-3 col-lg-6">

						</div>
						<div class="col-xl-3 col-lg-6">
							<section class="panel panel-transparent">
								<header class="panel-heading">
									<div class="panel-actions">
										<a href="#" class="fa fa-caret-down"></a>
										<a href="#" class="fa fa-times"></a>
									</div>

									<h2 class="panel-title">My Stats</h2>
								</header>
								<div class="panel-body">
									<section class="panel">
										<div class="panel-body">
											<div class="small-chart pull-right" id="sparklineBarDash"></div>
											<script type="text/javascript">
												var sparklineBarDashData = [5, 6, 7, 2, 0, 4 , 2, 4, 2, 0, 4 , 2, 4, 2, 0, 4];
											</script>
											<div class="h4 text-bold mb-none">488</div>
											<p class="text-xs text-muted mb-none">Average Profile Visits</p>
										</div>
									</section>
									<section class="panel">
										<div class="panel-body">
											<div class="circular-bar circular-bar-xs m-none mt-xs mr-md pull-right">
												<div class="circular-bar-chart" data-percent="45" data-plugin-options='"""),format.raw/*312.84*/("""{"""),format.raw/*312.85*/(""" """),format.raw/*312.86*/(""""barColor": "#2baab1", "delay": 300, "size": 50, "lineWidth": 4 """),format.raw/*312.150*/("""}"""),format.raw/*312.151*/("""'>
													<strong>Average</strong>
													<label><span class="percent">45</span>%</label>
												</div>
											</div>
											<div class="h4 text-bold mb-none">12</div>
											<p class="text-xs text-muted mb-none">Working Projects</p>
										</div>
									</section>
									<section class="panel">
										<div class="panel-body">
											<div class="small-chart pull-right" id="sparklineLineDash"></div>
											<script type="text/javascript">
												var sparklineLineDashData = [15, 16, 17, 19, 10, 15, 13, 12, 12, 14, 16, 17];
											</script>
											<div class="h4 text-bold mb-none">89</div>
											<p class="text-xs text-muted mb-none">Pending Tasks</p>
										</div>
									</section>
								</div>
							</section>

						</div>

					</div>
					<div class="row">
						<div class="col-lg-6 col-md-12">
							<section class="panel panel-transparent">
								<header class="panel-heading">
									<div class="panel-actions">
										<a href="#" class="fa fa-caret-down"></a>
										<a href="#" class="fa fa-times"></a>
									</div>

									<h2 class="panel-title">Global Stats</h2>
								</header>
								<div class="panel-body">
									<div id="vectorMapWorld" style="height: 350px; width: 100%;"></div>
								</div>
							</section>
						</div>
						<div class="col-lg-6 col-md-12">
							<section class="panel">
								<header class="panel-heading panel-heading-transparent">
									<div class="panel-actions">
										<a href="#" class="fa fa-caret-down"></a>
										<a href="#" class="fa fa-times"></a>
									</div>

									<h2 class="panel-title">Projects Stats</h2>
								</header>
								<div class="panel-body">
									<div class="table-responsive">
										<table class="table table-striped mb-none">
											<thead>
												<tr>
													<th>#</th>
													<th>Project</th>
													<th>Status</th>
													<th>Progress</th>
												</tr>
											</thead>
											<tbody>
												<tr>
													<td>1</td>
													<td>JSOFT - Responsive HTML5 Template</td>
													<td><span class="label label-success">Success</span></td>
													<td>
														<div class="progress progress-sm progress-half-rounded m-none mt-xs light">
															<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;">
																100%
															</div>
														</div>
													</td>
												</tr>
												<tr>
													<td>2</td>
													<td>JSOFT - Responsive Drupal 7 Theme</td>
													<td><span class="label label-success">Success</span></td>
													<td>
														<div class="progress progress-sm progress-half-rounded m-none mt-xs light">
															<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 100%;">
																100%
															</div>
														</div>
													</td>
												</tr>
												<tr>
													<td>3</td>
													<td>Tucson - Responsive HTML5 Template</td>
													<td><span class="label label-warning">Warning</span></td>
													<td>
														<div class="progress progress-sm progress-half-rounded m-none mt-xs light">
															<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 60%;">
																60%
															</div>
														</div>
													</td>
												</tr>
												<tr>
													<td>4</td>
													<td>Tucson - Responsive Business WordPress Theme</td>
													<td><span class="label label-success">Success</span></td>
													<td>
														<div class="progress progress-sm progress-half-rounded m-none mt-xs light">
															<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 90%;">
																90%
															</div>
														</div>
													</td>
												</tr>
												<tr>
													<td>5</td>
													<td>JSOFT - Responsive Admin HTML5 Template</td>
													<td><span class="label label-warning">Warning</span></td>
													<td>
														<div class="progress progress-sm progress-half-rounded m-none mt-xs light">
															<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 45%;">
																45%
															</div>
														</div>
													</td>
												</tr>
												<tr>
													<td>6</td>
													<td>JSOFT - Responsive HTML5 Template</td>
													<td><span class="label label-danger">Danger</span></td>
													<td>
														<div class="progress progress-sm progress-half-rounded m-none mt-xs light">
															<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 40%;">
																40%
															</div>
														</div>
													</td>
												</tr>
												<tr>
													<td>7</td>
													<td>JSOFT - Responsive Drupal 7 Theme</td>
													<td><span class="label label-success">Success</span></td>
													<td>
														<div class="progress progress-sm progress-half-rounded mt-xs light">
															<div class="progress-bar progress-bar-primary" role="progressbar" aria-valuenow="60" aria-valuemin="0" aria-valuemax="100" style="width: 95%;">
																95%
															</div>
														</div>
													</td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>
							</section>
						</div>
					</div>More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
					<!-- end: page -->
				</section>
			</div>

			<aside id="sidebar-right" class="sidebar-right">
				<div class="nano">
					<div class="nano-content">
						<a href="#" class="mobile-close visible-xs">
							Collapse <i class="fa fa-chevron-right"></i>
						</a>
			
						<div class="sidebar-right-wrapper">
			
							<div class="sidebar-widget widget-calendar">
								<h6>Upcoming Tasks</h6>
								<div data-plugin-datepicker data-plugin-skin="dark" ></div>
			
								<ul>
									<li>
										<time datetime="2014-04-19T00:00+00:00">04/19/2014</time>
										<span>Company Meeting</span>
									</li>
								</ul>
							</div>
			
							<div class="sidebar-widget widget-friends">
								<h6>Friends</h6>
								<ul>
									<li class="status-online">
										<figure class="profile-picture">
											<img src="assets/images/!sample-user.jpg" alt="Joseph Doe" class="img-circle">
										</figure>
										<div class="profile-info">
											<span class="name">Joseph Doe Junior</span>
											<span class="title">Hey, how are you?</span>
										</div>
									</li>
									<li class="status-online">
										<figure class="profile-picture">
											<img src="assets/images/!sample-user.jpg" alt="Joseph Doe" class="img-circle">
										</figure>
										<div class="profile-info">
											<span class="name">Joseph Doe Junior</span>
											<span class="title">Hey, how are you?</span>
										</div>
									</li>
									<li class="status-offline">
										<figure class="profile-picture">
											<img src="assets/images/!sample-user.jpg" alt="Joseph Doe" class="img-circle">
										</figure>
										<div class="profile-info">
											<span class="name">Joseph Doe Junior</span>
											<span class="title">Hey, how are you?</span>
										</div>
									</li>
									<li class="status-offline">
										<figure class="profile-picture">
											<img src="assets/images/!sample-user.jpg" alt="Joseph Doe" class="img-circle">
										</figure>
										<div class="profile-info">
											<span class="name">Joseph Doe Junior</span>
											<span class="title">Hey, how are you?</span>
										</div>
									</li>
								</ul>
							</div>
			
						</div>
					</div>
				</div>
			</aside>
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
		<script src="assets/vendor/jquery-ui/js/jquery-ui-1.10.4.custom.js"></script>
		<script src="assets/vendor/jquery-ui-touch-punch/jquery.ui.touch-punch.js"></script>
		<script src="assets/vendor/jquery-appear/jquery.appear.js"></script>
		<script src="assets/vendor/bootstrap-multiselect/bootstrap-multiselect.js"></script>
		<script src="assets/vendor/jquery-easypiechart/jquery.easypiechart.js"></script>
		<script src="assets/vendor/flot/jquery.flot.js"></script>
		<script src="assets/vendor/flot-tooltip/jquery.flot.tooltip.js"></script>
		<script src="assets/vendor/flot/jquery.flot.pie.js"></script>
		<script src="assets/vendor/flot/jquery.flot.categories.js"></script>
		<script src="assets/vendor/flot/jquery.flot.resize.js"></script>
		<script src="assets/vendor/jquery-sparkline/jquery.sparkline.js"></script>
		<script src="assets/vendor/raphael/raphael.js"></script>
		<script src="assets/vendor/morris/morris.js"></script>
		<script src="assets/vendor/gauge/gauge.js"></script>
		<script src="assets/vendor/snap-svg/snap.svg.js"></script>
		<script src="assets/vendor/liquid-meter/liquid.meter.js"></script>
		<script src="assets/vendor/jqvmap/jquery.vmap.js"></script>
		<script src="assets/vendor/jqvmap/data/jquery.vmap.sampledata.js"></script>
		<script src="assets/vendor/jqvmap/maps/jquery.vmap.world.js"></script>
		<script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.africa.js"></script>
		<script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.asia.js"></script>
		<script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.australia.js"></script>
		<script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.europe.js"></script>
		<script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.north-america.js"></script>
		<script src="assets/vendor/jqvmap/maps/continents/jquery.vmap.south-america.js"></script>
		
		<!-- Theme Base, Components and Settings -->
		<script src="assets/javascripts/theme.js"></script>
		
		<!-- Theme Custom -->
		<script src="assets/javascripts/theme.custom.js"></script>
		
		<!-- Theme Initialization Files -->
		<script src="assets/javascripts/theme.init.js"></script>


		<!-- Examples -->
		<script src="assets/javascripts/dashboard/examples.dashboard.js"></script>
	</body>
</html>
	""")))}),format.raw/*589.3*/("""
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
                  DATE: 2020-04-10T19:38:14.452
                  SOURCE: D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/app/views/dashboarddemo.scala.html
                  HASH: 6d81d95d377915aa6a52a4acddbde161bb0d8178
                  MATRIX: 730->1|826->3|856->8|883->27|922->29|951->33|998->72|1048->85|1076->87|2835->1819|2874->1837|3004->1941|3040->1956|3073->1962|4348->3209|4377->3210|4418->3223|4794->3570|4824->3571|4855->3573|4885->3574|4927->3587|5302->3933|5332->3934|5363->3936|5393->3937|5435->3950|5800->4286|5830->4287|7770->6198|7800->6199|7849->6219|8254->6595|8284->6596|8673->6956|8703->6957|8752->6977|9157->7353|9187->7354|9582->7720|9612->7721|9661->7741|10067->8118|10097->8119|12203->10196|12233->10197|12263->10198|12357->10262|12388->10263|23945->21789
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|29->4|29->4|30->5|76->51|76->51|81->56|81->56|82->57|120->95|120->95|121->96|136->111|136->111|136->111|136->111|137->112|152->127|152->127|152->127|152->127|153->128|168->143|168->143|221->196|221->196|222->197|233->208|233->208|243->218|243->218|244->219|255->230|255->230|265->240|265->240|266->241|277->252|277->252|337->312|337->312|337->312|337->312|337->312|614->589
                  -- GENERATED --
              */
          