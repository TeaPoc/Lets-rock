package com.example.demo.respository;


import com.example.demo.model.AppEvent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppEventRepository extends JpaRepository<AppEvent,Integer> {
}
