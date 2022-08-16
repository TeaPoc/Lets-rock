package com.example.demo.service;


import com.example.demo.model.City;
import com.example.demo.model.Genre;
import com.example.demo.respository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityService {

    @Autowired
    CityRepository repository;

    public List<City> findAll() {
        return repository.findAll();
    }

    public void create(City city) {
        repository.save(city);
    }

    public Optional<City> getCity(Integer id) {
        Optional<City> city= repository.findById(id);
        return city;
    }
}


