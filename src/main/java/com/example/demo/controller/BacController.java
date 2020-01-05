package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BacDao;
import com.example.demo.entity.Bac;
import com.example.demo.service.BacService;

@RestController // @restcontroller = @controller + @responsebody
@RequestMapping("/bac")
public class BacController {
	
	
	@Autowired
	BacService bacService;

	@GetMapping()
	public Iterable<Bac> liste() {
		return bacService.liste();

	}

	@GetMapping("/{cin}")
	public Optional<Bac> liste(@PathVariable Long cin) {
		return bacService.liste(cin);

	}

	@PostMapping
	public void ajout(@RequestBody Bac bac) { // @requestBody = traduire mel format Json lel java
		bacService.ajout(bac);
	}

}