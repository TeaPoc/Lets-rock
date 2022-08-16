package com.example.demo.model;


import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name="app_events")
@Data
public class AppEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;

    private String description;

    @CreatedDate
    private LocalDateTime dateStart;

    @CreatedDate
    private LocalDateTime dateFinish;

    private Integer totalCapacity;

    private BigDecimal fullPrice;

    @OneToMany//(mappedBy = "AppEvent")
    private List<ArtistEvent> artists;


}

