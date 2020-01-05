package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idCategorie;
	private String nom;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "categorie",fetch=FetchType.LAZY)
	private List<Article> articles;

	public Long getIdCategorie() {
		return idCategorie;
	}   

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public Categorie() {
		super();
	}

	public Categorie(Long idCategorie, String nom, List<Article> articles) {
		super();
		this.idCategorie = idCategorie;
		this.nom = nom;
		this.articles = articles;
	}

}
