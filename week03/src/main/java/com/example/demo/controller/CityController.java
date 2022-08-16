package com.example.demo.controller;


import com.example.demo.model.City;
import com.example.demo.model.Genre;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CityController {

    @Autowired
    private CityService cityService;

    @GetMapping("/cities")
    public List<City>getAllCity(){
        return cityService.findAll();
    }

    @PostMapping("/city")
    public void createCity(@RequestBody City city){
        cityService.create(city);
    }

    @GetMapping("/city/{id}")
    public ResponseEntity<?> getCity(@PathVariable Integer id){
        Optional<City> city = cityService.getCity(id);

        if(city.isEmpty()){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("City with id "+ id + " not found");
        }
        return ResponseEntity.ok(city.get());



    }
}






