package com.example.demo.service;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.respository.RoleRepository;
import com.example.demo.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    RoleRepository repository;

    public List<Role> findAll() {
        return repository.findAll();
    }

    public void create(Role role) {
        repository.save(role);
    }

    public Optional<Role> getRole(Integer id) {
        Optional<Role> role= repository.findById((id));
        return role;
    }
}




