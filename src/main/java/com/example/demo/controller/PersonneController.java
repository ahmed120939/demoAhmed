package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.PersonneDao;
import com.example.demo.entity.Personne;

@RestController 
public class PersonneController {
	@Autowired
	PersonneDao personneDao;
	
	@GetMapping("/eya")
	public List<Personne> list(){
		return personneDao.findAll();
	}
	
	@GetMapping("/personne/{id}")
	public Optional<Personne> findAll(@PathVariable Long id) {
	return personneDao.findById(id);
	}
	
	@DeleteMapping("/personne/{id}")
	public void delete(@PathVariable Long id)
	{
		personneDao.deleteById(id);
	}
	
	@PostMapping("/personne")
	public void save(@RequestBody Personne p) {
		personneDao.save(p);
	}
	

}
