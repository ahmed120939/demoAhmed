package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Personne;

@Repository
public interface PersonneDao extends JpaRepository<Personne, Long> {

}
