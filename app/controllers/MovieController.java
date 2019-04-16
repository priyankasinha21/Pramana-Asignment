package controllers;

import javax.inject.Inject;

import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;
import service.MovieService;

public class MovieController extends Controller {
	
	@Inject
    private MovieService movieService;
	
	//Get movies list sorted by create date time
	public Result getMovies() {
    	String movies = "";
		try {
			movies = movieService.getAllMovies();
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return ok(movies);
    }
    
	/*Add a new movie
	 * Request is in form of json
	 * sample json string is 
	 * {
	 * 		"title" : "test-movie", 
	 * 		"year" : "2018", 
	 * 		"rated" : "PG", 
	 * 		"released" : "06/11/2011", 
	 * 		"createdBy" : "Priyanka Sinha", 
	 * 		"genre": ["Drama", "Thriller"]
	 * }
	 * */
    public Result addMovies(Http.Request request) { 
    	String movie = request.body().asJson().toString();
    	String result = "";
		try {
			result = movieService.addMovie(movie);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return ok(result);
    }
    
    //Remove movies by id
    public Result deleteMovies(String id) {
    	String movies = "";
		try {
			movies = movieService.deleteMovie(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return ok(movies);
    }
    
    //Filter movies list by title an genre
    public Result filterByTitleAndGenre(String title, String genre) {
    	String movies = "";
		try {
			movies = movieService.filterMoviesByTitleAndGenre(title, genre);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return ok(movies);
    }
}
