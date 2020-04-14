// @GENERATOR:play-routes-compiler
// @SOURCE:D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri Apr 10 19:14:54 EDT 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_1: controllers.HomeController,
  // @LINE:21
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_1: controllers.HomeController,
    // @LINE:21
    Assets_0: controllers.Assets
  ) = this(errorHandler, HomeController_1, Assets_0, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """demo""", """controllers.HomeController.demo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """map""", """controllers.HomeController.map"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """dashboard""", """controllers.HomeController.dashboard"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cssmap""", """controllers.HomeController.cssmap"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasearchnlp""", """controllers.HomeController.nlpSearch"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """simpleForm""", """controllers.HomeController.simpleFormPost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """simpleForm2""", """controllers.HomeController.simpleFormPost2"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datasearch""", """controllers.HomeController.datasearch"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """datadownload""", """controllers.HomeController.downloadCsv"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """downloadResult""", """controllers.HomeController.downloadResult"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_demo1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("demo")))
  )
  private[this] lazy val controllers_HomeController_demo1_invoker = createInvoker(
    HomeController_1.demo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "demo",
      Nil,
      "GET",
      this.prefix + """demo""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_explore2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore2_invoker = createInvoker(
    HomeController_1.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_tutorial3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial3_invoker = createInvoker(
    HomeController_1.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_map4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("map")))
  )
  private[this] lazy val controllers_HomeController_map4_invoker = createInvoker(
    HomeController_1.map,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "map",
      Nil,
      "GET",
      this.prefix + """map""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_dashboard5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("dashboard")))
  )
  private[this] lazy val controllers_HomeController_dashboard5_invoker = createInvoker(
    HomeController_1.dashboard,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "dashboard",
      Nil,
      "GET",
      this.prefix + """dashboard""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_cssmap6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cssmap")))
  )
  private[this] lazy val controllers_HomeController_cssmap6_invoker = createInvoker(
    HomeController_1.cssmap,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "cssmap",
      Nil,
      "GET",
      this.prefix + """cssmap""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_nlpSearch7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasearchnlp")))
  )
  private[this] lazy val controllers_HomeController_nlpSearch7_invoker = createInvoker(
    HomeController_1.nlpSearch,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "nlpSearch",
      Nil,
      "GET",
      this.prefix + """datasearchnlp""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_simpleFormPost8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("simpleForm")))
  )
  private[this] lazy val controllers_HomeController_simpleFormPost8_invoker = createInvoker(
    HomeController_1.simpleFormPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "simpleFormPost",
      Nil,
      "POST",
      this.prefix + """simpleForm""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_HomeController_simpleFormPost29_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("simpleForm2")))
  )
  private[this] lazy val controllers_HomeController_simpleFormPost29_invoker = createInvoker(
    HomeController_1.simpleFormPost2,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "simpleFormPost2",
      Nil,
      "POST",
      this.prefix + """simpleForm2""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_datasearch10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datasearch")))
  )
  private[this] lazy val controllers_HomeController_datasearch10_invoker = createInvoker(
    HomeController_1.datasearch,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "datasearch",
      Nil,
      "GET",
      this.prefix + """datasearch""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_downloadCsv11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("datadownload")))
  )
  private[this] lazy val controllers_HomeController_downloadCsv11_invoker = createInvoker(
    HomeController_1.downloadCsv,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "downloadCsv",
      Nil,
      "GET",
      this.prefix + """datadownload""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_downloadResult12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("downloadResult")))
  )
  private[this] lazy val controllers_HomeController_downloadResult12_invoker = createInvoker(
    HomeController_1.downloadResult,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "downloadResult",
      Nil,
      "GET",
      this.prefix + """downloadResult""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:8
    case controllers_HomeController_demo1_route(params@_) =>
      call { 
        controllers_HomeController_demo1_invoker.call(HomeController_1.demo)
      }
  
    // @LINE:9
    case controllers_HomeController_explore2_route(params@_) =>
      call { 
        controllers_HomeController_explore2_invoker.call(HomeController_1.explore)
      }
  
    // @LINE:10
    case controllers_HomeController_tutorial3_route(params@_) =>
      call { 
        controllers_HomeController_tutorial3_invoker.call(HomeController_1.tutorial)
      }
  
    // @LINE:11
    case controllers_HomeController_map4_route(params@_) =>
      call { 
        controllers_HomeController_map4_invoker.call(HomeController_1.map)
      }
  
    // @LINE:12
    case controllers_HomeController_dashboard5_route(params@_) =>
      call { 
        controllers_HomeController_dashboard5_invoker.call(HomeController_1.dashboard)
      }
  
    // @LINE:13
    case controllers_HomeController_cssmap6_route(params@_) =>
      call { 
        controllers_HomeController_cssmap6_invoker.call(HomeController_1.cssmap)
      }
  
    // @LINE:14
    case controllers_HomeController_nlpSearch7_route(params@_) =>
      call { 
        controllers_HomeController_nlpSearch7_invoker.call(HomeController_1.nlpSearch)
      }
  
    // @LINE:15
    case controllers_HomeController_simpleFormPost8_route(params@_) =>
      call { 
        controllers_HomeController_simpleFormPost8_invoker.call(HomeController_1.simpleFormPost)
      }
  
    // @LINE:16
    case controllers_HomeController_simpleFormPost29_route(params@_) =>
      call { 
        controllers_HomeController_simpleFormPost29_invoker.call(HomeController_1.simpleFormPost2)
      }
  
    // @LINE:17
    case controllers_HomeController_datasearch10_route(params@_) =>
      call { 
        controllers_HomeController_datasearch10_invoker.call(HomeController_1.datasearch)
      }
  
    // @LINE:18
    case controllers_HomeController_downloadCsv11_route(params@_) =>
      call { 
        controllers_HomeController_downloadCsv11_invoker.call(HomeController_1.downloadCsv)
      }
  
    // @LINE:19
    case controllers_HomeController_downloadResult12_route(params@_) =>
      call { 
        controllers_HomeController_downloadResult12_invoker.call(HomeController_1.downloadResult)
      }
  
    // @LINE:21
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_0.versioned(path, file))
      }
  }
}
