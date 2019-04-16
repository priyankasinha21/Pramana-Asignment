// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vikashsahay/Documents/Pramana/pramana-project/conf/routes
// @DATE:Tue Apr 16 15:50:15 EDT 2019


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
