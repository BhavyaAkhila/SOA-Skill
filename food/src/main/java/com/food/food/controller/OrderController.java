package com.food.food.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.food.food.model.Order;

@RestController
public class OrderController {

    @PostMapping("/orders")
    public String placeOrder(@RequestBody Order order) {
        return "Order Placed Successfully";
    }
}