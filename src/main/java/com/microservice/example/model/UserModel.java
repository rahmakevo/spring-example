package com.microservice.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "user")
public class UserModel {
    @Id
    @NotNull
    private Integer id;

    private String username;
    private String password;
}
