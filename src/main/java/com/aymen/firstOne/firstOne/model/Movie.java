package com.aymen.firstOne.firstOne.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="MOVIE")
public class Movie {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="MOVIE_ID")
	private Long id;
	private String name;
	private String director;
	private String Description;
	@ManyToMany
	@JoinTable(name="ACTOR_MOVIE" , joinColumns = @JoinColumn(name ="MOVIE_ID"), inverseJoinColumns = @JoinColumn(name="ACTOR_ID"))
	private Set<Actor> actors;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(String name, String director) {
		super();
		this.name = name;
		this.director = director;
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
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Set<Actor> getActors() {
		return actors;
	}
	public void setActors(Set<Actor> actors) {
		this.actors = actors;
	}
	
	

}
