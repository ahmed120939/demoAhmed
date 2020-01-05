package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bac implements Serializable { // serializable = just bch tsahal creation fel base donne
	@Id
	private Long Cin;
	private String nom;
	private String filiere;

	public Long getCin() {
		return Cin;
	}

	public void setCin(Long cin) {
		Cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public Bac() {
		super();
	}

	public Bac(Long cin, String nom, String filiere) {
		super();
		Cin = cin;
		this.nom = nom;
		this.filiere = filiere;
	}
}
