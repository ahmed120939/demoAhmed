package com.example.demo.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.DaoArticle;
import com.example.demo.entity.Article;

@Service
public class ArticleService {
	@Autowired
	DaoArticle articleDao;

	public List<Article> list() {
		List<Article> listArticle = articleDao.findAll();
		List<Article> res = new ArrayList<>();
		for (Article article : listArticle) {
			System.out.println("+++");
			if (article.getQuantite() > 20) {
				System.out.println("****");
				res.add(article);
			}
		}
		System.out.println(res);
		return res;

	}

	public Collection<String> listdesign() {
		return articleDao.findAlldesignation();
	}

	public List<Article> listAllArticle() {
		return articleDao.findAll();
	}

	public Optional<Article> list(Long idArticle) {
		return articleDao.findById(idArticle);
	}

	public void add(Article article) {
		articleDao.save(article);
	}

	public void delete(Long idArticle) {
		articleDao.deleteById(idArticle);
	}
	


}
