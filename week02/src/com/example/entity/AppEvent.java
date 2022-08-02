package com.example.entity;

import java.math.BigDecimal;
import java.util.List;

public class AppEvent {

    private Integer id;

    private String title;

    private String description;

    private BigDecimal dateStart;

    private Integer totalCapacity;

    private BigDecimal fullPrice;

    private AppEvent event;

    private List<Artist> artists;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getDateStart() {
        return dateStart;
    }

    public void setDateStart(BigDecimal dateStart) {
        this.dateStart = dateStart;
    }

    public Integer getTotalCapacity() {
        return totalCapacity;
    }

    public void setTotalCapacity(Integer totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public BigDecimal getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(BigDecimal fullPrice) {
        this.fullPrice = fullPrice;
    }

    public AppEvent getEvent() {
        return event;
    }

    public void setEvent(AppEvent event) {
        this.event = event;
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void setArtists(List<Artist> artists) {
        this.artists = artists;
    }
}
