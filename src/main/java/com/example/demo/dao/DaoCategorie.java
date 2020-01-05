package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Categorie;
@Component

public interface DaoCategorie extends JpaRepository<Categorie, Long>{
	

}
