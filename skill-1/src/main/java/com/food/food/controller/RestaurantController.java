package com.food.food.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.food.model.Restaurant;

@RestController
public class RestaurantController {

    @GetMapping("/restaurants")
    public List<Restaurant> getRestaurants() {

        List<Restaurant> restaurants = new ArrayList<>();

        restaurants.add(new Restaurant(101, "Domino's", "Hyderabad"));
        restaurants.add(new Restaurant(102, "KFC", "Vijayawada"));

        return restaurants;
    }
}