// @GENERATOR:play-routes-compiler
// @SOURCE:D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri Apr 10 19:14:54 EDT 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def downloadResult: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.downloadResult",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "downloadResult"})
        }
      """
    )
  
    // @LINE:10
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:12
    def dashboard: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.dashboard",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "dashboard"})
        }
      """
    )
  
    // @LINE:8
    def demo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.demo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "demo"})
        }
      """
    )
  
    // @LINE:16
    def simpleFormPost2: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.simpleFormPost2",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "simpleForm2"})
        }
      """
    )
  
    // @LINE:15
    def simpleFormPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.simpleFormPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "simpleForm"})
        }
      """
    )
  
    // @LINE:9
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
    // @LINE:13
    def cssmap: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.cssmap",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cssmap"})
        }
      """
    )
  
    // @LINE:18
    def downloadCsv: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.downloadCsv",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datadownload"})
        }
      """
    )
  
    // @LINE:17
    def datasearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.datasearch",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasearch"})
        }
      """
    )
  
    // @LINE:11
    def map: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.map",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "map"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:14
    def nlpSearch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.nlpSearch",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "datasearchnlp"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
