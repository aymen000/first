package com.aymen.firstOne.firstOne.service;

import java.util.Collection;

import com.aymen.firstOne.firstOne.model.Actor;

public interface ActorService {
	
	Collection<Actor> getActors();
	Actor getActorByName(String name);
	Collection<Actor> findActorsByRating(int rating);
	Collection<Actor> findActorsByMovie(String movie);
	Actor addActor(Actor actor);
	void deleteActor(Actor actor);
	

}
