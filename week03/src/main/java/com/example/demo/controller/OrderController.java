package com.example.demo.controller;

import com.example.demo.model.Order;
import com.example.demo.model.Role;
import com.example.demo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public List<Order> getAllOrders(){
        return orderService.findAll();


    }

    @PostMapping("/order")
    public void createOrder(@RequestBody Order order){
        orderService.create(order);

    }

    @GetMapping("/order/{id}")
    public ResponseEntity<?>getOrder(@PathVariable Integer id){
        Optional<Order>order= orderService.getOrder(id);

        if(order.isEmpty()){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Order with id " + id + " not found");

        }
        return ResponseEntity.ok(order.get());
    }
}







