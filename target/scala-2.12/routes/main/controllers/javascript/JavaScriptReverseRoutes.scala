// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vikashsahay/Documents/Pramana/pramana-project/conf/routes
// @DATE:Tue Apr 16 15:50:15 EDT 2019

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:15
  class ReverseMovieController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def addMovies: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.addMovies",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/add"})
        }
      """
    )
  
    // @LINE:15
    def getMovies: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.getMovies",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/get"})
        }
      """
    )
  
    // @LINE:24
    def filterByTitleAndGenre: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.filterByTitleAndGenre",
      """
        function(title0,genre1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/filterByTitleAndGenre/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("title", title0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("genre", genre1))})
        }
      """
    )
  
    // @LINE:21
    def deleteMovies: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MovieController.deleteMovies",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "movies/delete/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
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
