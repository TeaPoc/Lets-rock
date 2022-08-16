package com.example.demo.controller;


import com.example.demo.model.Artist;
import com.example.demo.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ArtistController {

    @Autowired
    private ArtistService artistService;

    @GetMapping("/artists")
    public List<Artist>getAllArtist(){
        return artistService.findAll();
    }

    @PostMapping("/artist")
    public void createArtist(@RequestBody Artist artist){
        artistService.create(artist);

    }

    @GetMapping("/arstist/{id}")
    public ResponseEntity<?> getArtist(@PathVariable Integer id){
        Optional<Artist> artist= artistService.getArtist(id);

        if(artist.isEmpty()){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Artist with id " + id + " not found");
        }
        return  ResponseEntity.ok(artist.get());
    }



}
