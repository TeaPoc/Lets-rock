package com.example.demo.service;

import com.example.demo.model.Artist;
import com.example.demo.model.ArtistEvent;
import com.example.demo.model.City;
import com.example.demo.respository.ArtistEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArtistEventService {

    @Autowired
    ArtistEventRepository repository;


    public List<ArtistEvent> findAll() {
        return repository.findAll();
    }

    public Optional<ArtistEvent> getArtistEvent(Integer id) {
        Optional<ArtistEvent> artistEvent= repository.findById(id);
        return artistEvent;

    }
    public  void create(ArtistEvent artistEvent){
        repository.save(artistEvent);
    }
}



