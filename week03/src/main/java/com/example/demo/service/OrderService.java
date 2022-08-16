package com.example.demo.service;

import com.example.demo.model.Order;
import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.respository.OrderRepository;
import com.example.demo.respository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public void create(Order order) {
        repository.save(order);
    }

    public Optional<Order> getOrder(Integer id) {
        Optional<Order> order=repository.findById(id);
        return order;
    }
}





