package com.aymen.firstOne.firstOne.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.collections4.IteratorUtils;

import com.aymen.firstOne.firstOne.model.Actor;
import com.aymen.firstOne.firstOne.repository.ActorRepository;

@Service
public class ActorServiceImpl implements ActorService {

	ActorRepository actorRepository;

	@Autowired
	public ActorServiceImpl(ActorRepository actorRepository) {
		super();
		this.actorRepository = actorRepository;
	}

	@Override
	public Collection<Actor> getActors() {
		System.out.println("finding all at service impl");
		return IteratorUtils.toList(actorRepository.findAll().iterator());
	}

	@Override
	public Actor getActorByName(String name) {
		Actor theActor= new Actor();
		ArrayList<Actor> actors =  (ArrayList<Actor>) actorRepository.findAll();
		for(Actor actor:actors) {
			if(name.equalsIgnoreCase(String.valueOf(actor.getName()))) {
				theActor=actor;
				System.out.println();
				break;
			}
		}
		
		return theActor;
	}

	@Override
	public Collection<Actor> findActorsByRating(int rating) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Actor> findActorsByMovie(String movie) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Actor addActor(Actor actor) {
		actorRepository.save(actor);
		return actor;
	}

	@Override
	public void deleteActor(Actor actor) {
		actorRepository.delete(actor);

	}

}
