package com.aymen.firstOne.firstOne.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ACTOR")
public class Actor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	@Column(name="ACTOR_ID")
	private Long id;
	private String name;
	private String rating;
	@ManyToMany(cascade=CascadeType.DETACH)
	@JoinTable(name="ACTOR_MOVIE" , joinColumns = @JoinColumn(name ="ACTOR_ID"), inverseJoinColumns = @JoinColumn(name="MOVIE_ID"))
	private Set<Movie> movies;
	public Actor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Actor(String name, String rating) {
		super();
		this.name = name;
		this.rating = rating;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Set<Movie> getMovies() {
		return movies;
	}
	public void setMovies(Set<Movie> movies) {
		this.movies = movies;
	}
	
	

}
