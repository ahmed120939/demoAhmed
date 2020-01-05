package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Bac;

@Component
public interface BacDao extends JpaRepository<Bac, Long> {

}
