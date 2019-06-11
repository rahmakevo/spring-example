package com.microservice.example.controllers;

import com.microservice.example.model.MovieModel;
import com.microservice.example.repository.MovieRepository;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MovieController {
    @Autowired
    MovieRepository repository;

    @PostMapping("/save")
    public MovieModel saveAll(@RequestBody MovieModel model) {
        return repository.save(model);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @RequestMapping(value ="/delete", method = RequestMethod.POST)
    public String deleteByName(@RequestBody String title) throws JSONException {
        MovieModel model = repository.findByTitle(title);
        JSONObject object = new JSONObject();
        object.put("message", title+" deleted successfully "+model.getId());
        object.put("status", "delete");
        return String.valueOf(repository.findByTitle(title));
    }

}
