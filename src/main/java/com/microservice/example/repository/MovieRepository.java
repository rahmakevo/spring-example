package com.microservice.example.repository;

import com.microservice.example.model.MovieModel;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<MovieModel, Integer> {
    MovieModel findByTitle(String title);
}
