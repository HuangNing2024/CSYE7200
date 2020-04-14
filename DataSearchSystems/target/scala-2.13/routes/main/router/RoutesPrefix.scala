// @GENERATOR:play-routes-compiler
// @SOURCE:D:/NingHuang/Spring2020/csye7200/FinalProject/HNTest/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri Apr 10 19:14:54 EDT 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
