package com.wayupit.EasyPOS.serviceImpl;

import com.wayupit.EasyPOS.entity.Article;
import com.wayupit.EasyPOS.repository.ArticleRepo;
import com.wayupit.EasyPOS.service.ArticleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    private final ArticleRepo articleRepo;

    public ArticleServiceImpl(ArticleRepo articleRepo) {
        this.articleRepo = articleRepo;
    }

    @Override
    public ResponseEntity<Article> save(Article article) {
        return new ResponseEntity<>(articleRepo.save(article), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Article>> findAll() {
        return new ResponseEntity<>(articleRepo.findAll(),HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Article> findById(long id) {
        return new ResponseEntity<>(articleRepo.findById(id).get(),HttpStatus.ACCEPTED);
    }

    @Override
    public ResponseEntity<Article> update(long id, Article article) {
        if (articleRepo.existsById(id) ){
            return new ResponseEntity<>(articleRepo.save(article), HttpStatus.CREATED);
        }
        return null;
    }
}
