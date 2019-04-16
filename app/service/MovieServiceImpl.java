package service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.google.gson.Gson;

import dto.MovieDTO;
import models.Movies;
import repositories.MovieRepository;

public class MovieServiceImpl implements MovieService {
	
	@Inject
    private MovieRepository movie;
	
	//Get all movies in descending order of created date
	public String getAllMovies() throws Exception {
		List<Movies> moviesList = movie.findAll();
		Gson gson = new Gson();
		String result = "";
		for (Movies movie : moviesList) {
			MovieDTO mDto = getMoviesDtoFromMovie(movie);			
			result += gson.toJson(mDto);
		}
		
        return result;
	}
	
	//Add new movie 
	public String addMovie(String movieToAdd) throws Exception {
		MovieDTO mDto = new Gson().fromJson(movieToAdd, MovieDTO.class);
		String result = "";
		if(mDto != null) {
			Movies movies = getMoviesFromDto(mDto);			
			result = movie.addMovie(movies);
		}
		
		return result;
    }
	
	//Delete movie by id
	public String deleteMovie(String id) throws Exception {
		String result = movie.deleteMovie(id);
		return result;
	}
	 
	//Filter movie list by title and genre
	public String filterMoviesByTitleAndGenre(String title, String genre) throws Exception {
		List<Movies> moviesList = movie.filterByTitleAndGenre(title, genre);
		Gson gson = new Gson();
		String result = "";
		for (Movies movie : moviesList) {
			MovieDTO mDto = getMoviesDtoFromMovie(movie);			
			result += gson.toJson(mDto);
		}
		
        return result;
	}
	
	public Movies getMoviesFromDto(MovieDTO mDto) throws Exception {
		Movies movies = new Movies();
		movies.setTitle(mDto.getTitle());
		movies.setYear(mDto.getYear());
		movies.setRated(mDto.getRated());
		movies.setGenre(mDto.getGenre());
		movies.setCreatedBy(mDto.getCreatedBy());
		movies.setCreatedDateTime(new Date());
		
		SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
		movies.setReleased(fmt1.parse(mDto.getReleased()));
		
		return movies;
	}
	
	public MovieDTO getMoviesDtoFromMovie(Movies movie) throws Exception {
		MovieDTO mDto = new MovieDTO();
		if(movie.get_id().toString() != null)
			mDto.setId(movie.get_id().toString());
		
		if(movie.getTitle() != null)
			mDto.setTitle(movie.getTitle());
		
		if(movie.getYear() != null)
			mDto.setYear(movie.getYear());
		
		if(movie.getRated() != null)
			mDto.setRated(movie.getRated());
		
		if(movie.getReleased() != null)
			mDto.setReleased(movie.getReleased().toString());
		
		if(movie.getCreatedBy() != null)
			mDto.setCreatedBy(movie.getCreatedBy());
		
		if(movie.getGenre() != null)
			mDto.setGenre(movie.getGenre());
		
		if(movie.getCreatedDateTime() != null)
			mDto.setCreatedTime(movie.getCreatedDateTime().toString());
		
		return mDto;
	}
}
