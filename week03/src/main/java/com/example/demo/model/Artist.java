package com.example.demo.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="artists")
@Data

public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name="genre_id")
    private Genre genre;
}
