package com.example.demo.service;

import com.example.demo.model.Genre;
import com.example.demo.model.Order;
import com.example.demo.respository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {

    @Autowired
    GenreRepository repository;

    public List<Genre> findAll() {
        return repository.findAll();

    }
    public Optional<Genre> getGenre(Integer id) {
        Optional<Genre> genre=repository.findById(id);
        return genre;
    }

    public void create(Genre genre) {
        repository.save(genre);
    }
}




