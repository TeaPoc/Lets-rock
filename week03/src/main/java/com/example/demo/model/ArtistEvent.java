package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="artist_event")
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(ArtistEventPKId.class)
public class ArtistEvent {

    @Id
    private Integer eventId;

    @Id
    @ManyToOne
    @JoinColumn(name="artist_id")
    private Artist artist;

    @Column(name="whenn")
    private LocalDateTime startTime;

    public void create(ArtistEvent artistEvent) {
    }
}
