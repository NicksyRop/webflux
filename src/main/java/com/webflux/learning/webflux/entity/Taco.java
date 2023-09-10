package com.webflux.learning.webflux.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Data

public class Taco {

    @Id
    private Long id;

    private String name;

    private List<Ingredient> ingredients;

}
