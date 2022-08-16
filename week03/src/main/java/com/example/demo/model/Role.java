package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name= "roles")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Integer id;

    @Column(nullable = false)
    private String name;




}


