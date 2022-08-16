package com.example.demo.controller;


import com.example.demo.model.ArtistEvent;
import com.example.demo.model.City;
import com.example.demo.service.ArtistEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ArtistEventController {

    @Autowired
    private ArtistEventService artistEventService;

    @GetMapping("/artistEvent")
    public List<ArtistEvent> getAllArtistEvent() {
        return artistEventService.findAll();
    }

    @PostMapping("/artistEvent")
    public void createArtistEvent(@RequestBody ArtistEvent artistEvent) {
        artistEvent.create(artistEvent);
    }

    @GetMapping("/artistEvent/{id}")
    public ResponseEntity<?> getArtistEvent(@PathVariable Integer id) {

        Optional<ArtistEvent> artistEvent = artistEventService.getArtistEvent(id);

        if (artistEvent.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("ArtistEvent with id " + id + " not found");
        }
        return ResponseEntity.ok(artistEvent.get());


    }
}
