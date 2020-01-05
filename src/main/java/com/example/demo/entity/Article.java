package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Article implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idArticle;
	private String designation;
	private int quantite;
	private Long prix;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "idcategorie")
	private Categorie categorie;

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public Long getPrix() {
		return prix;
	}

	public void setPrix(Long prix) {
		this.prix = prix;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Article() {
		super();
	}

	public Article(Long idArticle, String designation, int quantite, Long prix, Categorie categorie) {
		super();
		this.idArticle = idArticle;
		this.designation = designation;
		this.quantite = quantite;
		this.prix = prix;
		this.categorie = categorie;
	}

}
