package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.FormationDao;
import com.example.demo.entity.Formation;

@RestController
@RequestMapping("/formation")
public class FormationController {

	@Autowired
	FormationDao formationDao;
	
	@GetMapping
	public Iterable<Formation> list() {
		return formationDao.findAll(); 
	}
	@GetMapping("/{id}")
	public Optional<Formation> list(@PathVariable Long id) {
		return formationDao.findById(id);
	
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		formationDao.deleteById(id);
	}
	
	@PostMapping
	public void add(@RequestBody Formation formation) {
		formationDao.save(formation);
	}

}
