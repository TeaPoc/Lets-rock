package com.example.demo.controller;

import com.example.demo.model.Genre;
import com.example.demo.model.Order;
import com.example.demo.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GenreController {

    @Autowired
    private GenreService genreService;

    @GetMapping("/genres")
    public List<Genre> getAllGenre() {
        return genreService.findAll();

    }

    @PostMapping("/genre")
    public void createGenre(@RequestBody Genre genre) {
        genreService.create(genre);
    }

    @GetMapping("/genre/{id}")
    public ResponseEntity<?> getOrder(@PathVariable Integer id) {
        Optional<Genre> genre = genreService.getGenre(id);

        if (genre.isEmpty()) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Genre with id" + id + " not found");
        }
        return ResponseEntity.ok(genre.get());

    }

}



