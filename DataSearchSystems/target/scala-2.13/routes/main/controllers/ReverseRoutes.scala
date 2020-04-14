// @GENERATOR:play-routes-compiler
// @SOURCE:D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri Apr 10 19:14:54 EDT 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def downloadResult(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "downloadResult")
    }
  
    // @LINE:10
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:12
    def dashboard(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "dashboard")
    }
  
    // @LINE:8
    def demo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "demo")
    }
  
    // @LINE:16
    def simpleFormPost2(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "simpleForm2")
    }
  
    // @LINE:15
    def simpleFormPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "simpleForm")
    }
  
    // @LINE:9
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:13
    def cssmap(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cssmap")
    }
  
    // @LINE:18
    def downloadCsv(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "datadownload")
    }
  
    // @LINE:17
    def datasearch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "datasearch")
    }
  
    // @LINE:11
    def map(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "map")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:14
    def nlpSearch(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "datasearchnlp")
    }
  
  }

  // @LINE:21
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
