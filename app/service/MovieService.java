package service;

import com.google.inject.ImplementedBy;

@ImplementedBy(MovieServiceImpl.class)
public interface MovieService {
	
	//Get all movies in descending order of created date
	public String getAllMovies() throws Exception;
	
	//Add new movie 
	public String addMovie(String movieToAdd) throws Exception;    
	
	//Delete movie by id
	public String deleteMovie(String id) throws Exception;
	
	//Filter movie list by title and genre
	public String filterMoviesByTitleAndGenre(String title, String genre) throws Exception;
	
}
