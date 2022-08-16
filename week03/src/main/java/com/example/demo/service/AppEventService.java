package com.example.demo.service;

import com.example.demo.model.AppEvent;
import com.example.demo.model.Artist;
import com.example.demo.respository.AppEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppEventService {

    @Autowired
    AppEventRepository repository;

    public List<AppEvent> findAll() {
        return repository.findAll();
    }

    public void create(AppEvent appEvent) {
        repository.save(appEvent);
    }

    public Optional<AppEvent> getAppEvent(Integer id) {
        Optional<AppEvent>appEvent=repository.findById(id);
        return appEvent;
    }
}
