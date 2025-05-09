package com.wayupit.EasyPOS.service;

import com.wayupit.EasyPOS.entity.Article;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ArticleService {
    ResponseEntity<Article> save(Article article);
    ResponseEntity<List<Article>> findAll();
    ResponseEntity<Article> findById(long id);
    ResponseEntity<Article> update(long id, Article article);
}
