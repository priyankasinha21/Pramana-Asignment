package repositories;

import it.unifi.cerm.playmorphia.PlayMorphia;
import models.Movies;
import xyz.morphia.Key;
import xyz.morphia.query.Criteria;
import xyz.morphia.query.Query;

import java.util.List;

import javax.inject.Inject;

import org.bson.types.ObjectId;

public class MovieRepository {
	
	private final PlayMorphia morphia;

    @Inject
    public MovieRepository(PlayMorphia morphia) {
        this.morphia = morphia;
    }

    public List<Movies> findAll() {
    	List<Movies> movies = morphia.datastore().createQuery(Movies.class).order("-createdDateTime")
    				.project("_id", true)
    				.project("title", true)
    				.project("year", true)
    				.project("rated", true)
    				.project("released", true)
    				.project("genre", true)
    				.project("createdDateTime", true)
    				.asList();
    	return movies;
    }
    
    public String addMovie(Movies movie) {
    	morphia.datastore().ensureIndexes();
        String movieAdded = morphia.datastore().save(movie).getId().toString(); 
        if(movieAdded != null)
        	return "success";
        return "error";
    }
    
    public String deleteMovie(String id) {
    	Query <Movies> query = morphia.datastore().createQuery(Movies.class).field("_id").equal(new ObjectId(id));
    	Movies movieTODelete = morphia.datastore().createQuery(Movies.class).field("_id").equal(new ObjectId(id)).get();
    	if(movieTODelete != null) {
    		morphia.datastore().delete(query);
    		return "success";
    	}
        return "no data found";
    }
    
    public List<Movies> filterByTitleAndGenre(String title, String genre) {
    	Query<Movies> query = morphia.datastore().createQuery(Movies.class);
    	query.criteria("title").equal(title).criteria("genre").equal(genre);
    	List<Movies> movies =  query.order("-createdDateTime").asList();    	
    	return movies;
    }
}
