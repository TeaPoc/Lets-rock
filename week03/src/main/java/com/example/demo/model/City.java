package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="cities")
@Data
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String zip;


}
