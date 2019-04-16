// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vikashsahay/Documents/Pramana/pramana-project/conf/routes
// @DATE:Tue Apr 16 15:50:15 EDT 2019

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:15
  class ReverseMovieController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def addMovies(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "movies/add")
    }
  
    // @LINE:15
    def getMovies(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movies/get")
    }
  
    // @LINE:24
    def filterByTitleAndGenre(title:String, genre:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movies/filterByTitleAndGenre/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("title", title)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("genre", genre)))
    }
  
    // @LINE:21
    def deleteMovies(id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "movies/delete/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("id", id)))
    }
  
  }

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
