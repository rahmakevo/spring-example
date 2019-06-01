package com.microservice.example.repository;

import com.microservice.example.model.UserModel;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<UserModel, Integer> {

}
