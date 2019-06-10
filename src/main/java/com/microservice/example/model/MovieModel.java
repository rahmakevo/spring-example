package com.microservice.example.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@Table(name = "movie")
public class MovieModel {
    @NotNull
    @Id
    private Integer id;

    private String title;
    private String description;
    private int rating;
    Boolean watched;

}
