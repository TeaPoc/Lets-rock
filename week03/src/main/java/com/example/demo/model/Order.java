package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="orders")
@Data

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @CreatedDate
    private LocalDateTime createdAt;


    private BigDecimal basePrice;


    private Integer orderCount;

    private BigDecimal discount;


    private BigDecimal fullPrice;

    @ManyToOne
    @JoinColumn(name="event_id")
    private AppEvent event;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

}

