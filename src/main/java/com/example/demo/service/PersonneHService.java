package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.PersonneDao;
import com.example.demo.dao.PersonneHDao;
import com.example.demo.entity.Personne;
import com.example.demo.entity.PersonneH;

@Service
public class PersonneHService {
	@Autowired
	PersonneHDao personneHDao;

	public List<PersonneH> getAllPersonne() {
		return personneHDao.findAll();

	}

	public Optional<PersonneH> getPersonneId(Long id) {
		return personneHDao.findById(id);

	}

	public void ajoutPersonneH(PersonneH p) {

		personneHDao.saveAndFlush(p);

	}

	public void suppPersonneH(Long id) {
		personneHDao.deleteById(id);
	}

}
