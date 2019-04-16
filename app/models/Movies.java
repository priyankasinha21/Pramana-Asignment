package models;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import xyz.morphia.annotations.Entity;
import xyz.morphia.annotations.Id;
import xyz.morphia.annotations.Indexed;
import xyz.morphia.utils.IndexDirection;

@Entity(value="movies")
public class Movies {
	
	@Id
    private ObjectId _id;
	
	private String title;
	private String year;
	private String rated;
	private Date released;
	private List<String> genre;
	private String createdBy;
	private Date createdDateTime;
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public List<String> getGenre() {
		return genre;
	}
	public void setGenre(List<String> genre) {
		this.genre = genre;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getReleased() {
		return released;
	}
	public void setReleased(Date released) {
		this.released = released;
	}
	public Date getCreatedDateTime() {
		return createdDateTime;
	}
	public void setCreatedDateTime(Date createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	
	
	
	
}
