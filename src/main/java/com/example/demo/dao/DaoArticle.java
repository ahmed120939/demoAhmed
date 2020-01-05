package com.example.demo.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Article;

@Component
public interface DaoArticle extends JpaRepository<Article, Long> {
	// @Query(value="SELECT * FROM ARTICLE",nativeQuery=true)
	
	@Query(value = "SELECT designation FROM ARTICLE art WHERE art.prix<100", nativeQuery = true)

	
	Collection<String> findAlldesignation();

	// SELECT `designation` FROM `article`art WHERE art.`prix`>100

}
