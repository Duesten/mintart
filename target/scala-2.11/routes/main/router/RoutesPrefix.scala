
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/Mo Lester/Desktop/mintart/conf/routes
// @DATE:Sun Oct 16 17:48:46 CEST 2016


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
