package com.wayupit.EasyPOS.controller;

import com.wayupit.EasyPOS.entity.Article;
import com.wayupit.EasyPOS.service.ArticleService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v0/articles")
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @PostMapping("/addArticle")
    public ResponseEntity<Article> addArticle(@RequestBody Article article) {
        return articleService.save(article);
    }

    @GetMapping("/allArticles")
    public ResponseEntity<List<Article>> articlesList() {
        return articleService.findAll();
    }

    @GetMapping("/getArticleById/{idArticle}")
    public ResponseEntity<Article> getArticleById(@PathVariable("idArticle") long id) {
        return articleService.findById(id);
    }


    @PutMapping("/updateArticle/{idArticle}")
    public ResponseEntity<Article> updateArticle(@PathVariable("idArticle") long id,@RequestBody Article article) {
        return articleService.update(id, article);
    }




}
