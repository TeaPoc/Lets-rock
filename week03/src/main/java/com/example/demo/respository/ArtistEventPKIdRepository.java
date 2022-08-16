package com.example.demo.respository;


import com.example.demo.model.ArtistEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistEventPKIdRepository extends JpaRepository<ArtistEvent,Integer> {
}
