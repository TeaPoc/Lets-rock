package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ArtistEventPKId implements Serializable {

    private Integer eventId;

    private Artist artist;

}
