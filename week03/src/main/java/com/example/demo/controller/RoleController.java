package com.example.demo.controller;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import com.example.demo.service.RoleService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;
import java.util.Optional;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/roles")
    public List<Role> getAllRoles(){
        return roleService.findAll();

    }

    @PostMapping("/role")
    public void createRole(@RequestBody Role role){
        roleService.create(role);
    }
    @GetMapping("/role/{id}")
    public ResponseEntity<?>getRole(@PathVariable Integer id){

        Optional<Role> role= roleService.getRole(id);

        if (role.isEmpty()){
            return  ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Role with id " + id +" not found");
        }
        return ResponseEntity.ok(role.get());
    }


}







