// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/vikashsahay/Documents/Pramana/pramana-project/conf/routes
// @DATE:Tue Apr 16 15:50:15 EDT 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_3: controllers.HomeController,
  // @LINE:9
  Assets_1: controllers.Assets,
  // @LINE:15
  MovieController_0: javax.inject.Provider[controllers.MovieController],
  // @LINE:18
  MovieController_2: controllers.MovieController,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_3: controllers.HomeController,
    // @LINE:9
    Assets_1: controllers.Assets,
    // @LINE:15
    MovieController_0: javax.inject.Provider[controllers.MovieController],
    // @LINE:18
    MovieController_2: controllers.MovieController
  ) = this(errorHandler, HomeController_3, Assets_1, MovieController_0, MovieController_2, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_3, Assets_1, MovieController_0, MovieController_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/get""", """@controllers.MovieController@.getMovies()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/add""", """controllers.MovieController.addMovies(request:Request)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/delete/""" + "$" + """id<[^/]+>""", """controllers.MovieController.deleteMovies(id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """movies/filterByTitleAndGenre/""" + "$" + """title<[^/]+>/""" + "$" + """genre<[^/]+>""", """controllers.MovieController.filterByTitleAndGenre(title:String, genre:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_3.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_MovieController_getMovies2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/get")))
  )
  private[this] lazy val controllers_MovieController_getMovies2_invoker = createInvoker(
    MovieController_0.get.getMovies(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "getMovies",
      Nil,
      "GET",
      this.prefix + """movies/get""",
      """Get movie list""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MovieController_addMovies3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/add")))
  )
  private[this] lazy val controllers_MovieController_addMovies3_invoker = createInvoker(
    
    (req:play.mvc.Http.Request) =>
      MovieController_2.addMovies(fakeValue[play.mvc.Http.Request]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "addMovies",
      Seq(classOf[play.mvc.Http.Request]),
      "POST",
      this.prefix + """movies/add""",
      """Add new movie""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_MovieController_deleteMovies4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/delete/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MovieController_deleteMovies4_invoker = createInvoker(
    MovieController_2.deleteMovies(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "deleteMovies",
      Seq(classOf[String]),
      "GET",
      this.prefix + """movies/delete/""" + "$" + """id<[^/]+>""",
      """Delete movies by id""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_MovieController_filterByTitleAndGenre5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("movies/filterByTitleAndGenre/"), DynamicPart("title", """[^/]+""",true), StaticPart("/"), DynamicPart("genre", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MovieController_filterByTitleAndGenre5_invoker = createInvoker(
    MovieController_2.filterByTitleAndGenre(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MovieController",
      "filterByTitleAndGenre",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """movies/filterByTitleAndGenre/""" + "$" + """title<[^/]+>/""" + "$" + """genre<[^/]+>""",
      """Filter movie list by title and genre""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_3.index)
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:15
    case controllers_MovieController_getMovies2_route(params@_) =>
      call { 
        controllers_MovieController_getMovies2_invoker.call(MovieController_0.get.getMovies())
      }
  
    // @LINE:18
    case controllers_MovieController_addMovies3_route(params@_) =>
      call { 
        controllers_MovieController_addMovies3_invoker.call(
          req => MovieController_2.addMovies(req))
      }
  
    // @LINE:21
    case controllers_MovieController_deleteMovies4_route(params@_) =>
      call(params.fromPath[String]("id", None)) { (id) =>
        controllers_MovieController_deleteMovies4_invoker.call(MovieController_2.deleteMovies(id))
      }
  
    // @LINE:24
    case controllers_MovieController_filterByTitleAndGenre5_route(params@_) =>
      call(params.fromPath[String]("title", None), params.fromPath[String]("genre", None)) { (title, genre) =>
        controllers_MovieController_filterByTitleAndGenre5_invoker.call(MovieController_2.filterByTitleAndGenre(title, genre))
      }
  }
}
