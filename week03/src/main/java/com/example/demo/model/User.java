package com.example.demo.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name= "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    private String oib;

    @ManyToOne
    @JoinColumn(name="role_id")
    private Role role;

    @ManyToOne
    @JoinColumn(name="city_id")
    private City city;

    private String password;

    public User() {
    }

    public User(String firstName, String lastName, String email, String mobile, String oib, Role role, City city, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.oib = oib;
        this.role = role;
        this.city = city;
        this.password = password;
    }
}
