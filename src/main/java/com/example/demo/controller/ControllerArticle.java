package com.example.demo.controller;

import java.util.Collection;
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

import com.example.demo.dao.DaoArticle;
import com.example.demo.entity.Article;
import com.example.demo.entity.Formation;
import com.example.demo.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ControllerArticle {
	@Autowired
	ArticleService articleService;
	

	@GetMapping
	public List<Article> list() {
		return articleService.list();
	}
	
	@GetMapping("/all")
	public List<Article> listAllArtcile() {
		return articleService.listAllArticle();
	}

	@GetMapping("/findAlldesignation")
	public Collection<String>listdesignation(){
		return articleService.listdesign();
		}
	
	
	@GetMapping("/{idArticle}")
	public Optional<Article> list(@PathVariable Long idArticle) {
		return articleService.list(idArticle);
	}

	@PostMapping
	public void add(@RequestBody Article article) {
		articleService.add(article);
	}

	@DeleteMapping("/{idArticle}")
	public void delete(@PathVariable Long idArticle) {
		articleService.delete(idArticle);
	}
	
	
	/*
	 * methode de modifier avec @putMapping
	 *  public void updatePersonne(Personne p,Long id) {
	Personne updatePersonne=new Personne();
	updatePersonne.setId(id);
	updatePersonne.setAge(p.getAge());
	updatePersonne.setNom(p.getNom());
	personneDao.saveAndFlush(updatePersonne);
}

*/


}
