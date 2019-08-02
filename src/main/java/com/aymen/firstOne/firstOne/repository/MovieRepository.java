package com.aymen.firstOne.firstOne.repository;

import org.springframework.data.repository.CrudRepository;

import com.aymen.firstOne.firstOne.model.Movie;

public interface MovieRepository extends CrudRepository<Movie, Long> {

}
