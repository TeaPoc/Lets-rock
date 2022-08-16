package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.respository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{

    @Autowired
    UserRepository repository;

    public List<User> findAll(){
       // List<User> user =
         return repository.findAll();
       // return user;
    }

    public void create(User user){
        repository.save(user);
    }

    public Optional<User> getUser(Integer id){
        Optional<User> user = repository.findById(id);

        return user;
    }

    public boolean delete(Integer id) {

        try {
            repository.deleteById(id);
        } catch (Exception e){

            return false;
        }

        return true;

    }

    public User update(Integer id, User userForUpdate) {

        Optional<User> oldUserOptional = repository.findById(id);

        if (oldUserOptional.isEmpty()) {
            return null;
        }

        User oldUser = oldUserOptional.get();

        oldUser.setFirstName(userForUpdate.getFirstName());


        repository.save(oldUser);

        return oldUser;

    }
}


