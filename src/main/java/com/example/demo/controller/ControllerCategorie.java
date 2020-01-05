package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.DaoCategorie;
import com.example.demo.entity.Categorie;

@RestController
@RequestMapping("/categorie")
public class ControllerCategorie {
	@Autowired
	DaoCategorie categorieDao;

	@GetMapping
	public List<Categorie> list() {
		return categorieDao.findAll();
	}

	@GetMapping("/{idCategorie}")
	public Optional<Categorie> list(@PathVariable Long idcategorie) {
		return categorieDao.findById(idcategorie);
	}

	@PostMapping
	public void add(@RequestBody Categorie categorie) {
		categorieDao.save(categorie);
	}

	@DeleteMapping("/{idcategorie}")
	public void delete(@PathVariable Long idcategorie) {
		categorieDao.deleteById(idcategorie);
	}

}
