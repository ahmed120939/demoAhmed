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

import com.example.demo.entity.PersonneH;
import com.example.demo.service.PersonneHService;

@RestController
@RequestMapping("/personneH")
public class PersonneHController {
	@Autowired
	PersonneHService personneHService;

	@GetMapping()
	public List<PersonneH> getAllPersonneH() {
		return personneHService.getAllPersonne();
	}

	@GetMapping("/{id}")
	public Optional<PersonneH> getPersonneHId(@PathVariable Long id) {
		return personneHService.getPersonneId(id);
	}

	@PostMapping()
	public void ajoutPersonneH(@RequestBody PersonneH p) {
		personneHService.ajoutPersonneH(p);

	}
	
	@DeleteMapping("/{id}")
	public void suppPersonneH(@PathVariable Long id) {
		personneHService.suppPersonneH(id);
	}

}
