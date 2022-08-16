package com.example.demo.controller;


import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.findAll();
    }

    @PostMapping("/user")
    public void createUser(@RequestBody User user){

        userService.create(user);

    }

    @GetMapping("/user/{id}")
    public ResponseEntity<?> getUser(@PathVariable Integer id){

        Optional<User> user = userService.getUser(id);

        if(user.isEmpty()){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("User with id " + id+ " not found");
        }
        return ResponseEntity.ok(user.get());

    }
    @PutMapping("/users/{id}")
    public ResponseEntity<?>update(@PathVariable Integer id,@RequestBody User userForUpdate){
        User updateUser= this.userService.update(id,userForUpdate);
        if(updateUser==null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("User with id " + id + " not found");
        }
        return ResponseEntity.ok(updateUser);

    }
    @DeleteMapping("/users/{id}")
    public ResponseEntity<?>delete(@PathVariable Integer id){
        boolean success = this.userService.delete(id);
        if(!success){
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("User with id " + id + " not found");

        }
        return ResponseEntity.ok(true);
    }
}


