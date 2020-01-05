package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.BacDao;
import com.example.demo.entity.Bac;

@Service
public class BacService {
	@Autowired
	BacDao bacDao;

	public Iterable<Bac> liste() {
		return bacDao.findAll();

	}

	public Optional<Bac> liste(Long cin) {
		return bacDao.findById(cin);

	}

	public void ajout(Bac bac) { // @requestBody = traduire mel format Json lel java
		Bac bacObject=new Bac((long) 111111,"aymen","aaa");
		bacDao.save(bac);
		bacDao.save(bacObject);
		
		
	}

}