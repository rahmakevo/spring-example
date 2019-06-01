package com.microservice.example.repository;

import com.microservice.example.model.UserModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface UserRepository extends CrudRepository<UserModel, Integer> {
    List<UserModel> findByUsername(String username);
}
