// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/paul.russavage/projects/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Thu Jun 06 13:30:56 MDT 2019


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
