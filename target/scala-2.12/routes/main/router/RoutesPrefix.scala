// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/paul.russavage/projects/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri Jun 07 11:22:48 MDT 2019


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
