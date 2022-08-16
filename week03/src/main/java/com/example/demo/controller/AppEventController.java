package com.example.demo.controller;

import com.example.demo.model.AppEvent;
import com.example.demo.service.AppEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AppEventController {

    @Autowired
    private AppEventService appEventService;

    @GetMapping("/appEvents")
    public List<AppEvent>getAllAppEvent(){
        return appEventService.findAll();
    }
    @PostMapping("/appEvent")
    public void createAppEvent(@RequestBody AppEvent appEvent){
        appEventService.create(appEvent);
    }
    @GetMapping("/appEvent/{id}")
    public ResponseEntity<?> getAppEvent(@PathVariable Integer id){
        Optional<AppEvent>appEvent=appEventService.getAppEvent(id);

        if(appEvent.isEmpty()){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("AppEvent with id " + id+ " not found" );

        }
        return ResponseEntity.ok(appEvent.get());
    }



}
