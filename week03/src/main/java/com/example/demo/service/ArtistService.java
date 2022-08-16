package com.example.demo.service;

import com.example.demo.model.Artist;
import com.example.demo.model.City;
import com.example.demo.respository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistService {

    @Autowired
    ArtistRepository repository;


    public List<Artist> findAll() {
        return repository.findAll();
    }

    public void create(Artist artist) {

        repository.save(artist);
    }

    public Optional<Artist> getArtist(Integer id) {
        Optional<Artist> artist= repository.findById(id);
        return artist;
    }
}
