
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/OnlineShopProject/conf/routes
// @DATE:Wed Mar 29 18:07:36 IST 2017


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
