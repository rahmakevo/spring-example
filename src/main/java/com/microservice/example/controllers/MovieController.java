package com.microservice.example.controllers;

import com.microservice.example.model.MovieModel;
import com.microservice.example.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {
    @Autowired
    MovieRepository repository;

    @PostMapping("/save")
    public MovieModel saveAll(@RequestBody MovieModel model) {
        return repository.save(model);
    }

    @GetMapping("/delete")
    public void deleteMovie(@RequestBody String title) {
        MovieModel model = repository.findByTitle(title);
        repository.deleteById(model.getId());
    }

}
