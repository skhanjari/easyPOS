package com.wayupit.EasyPOS.repository;

import com.wayupit.EasyPOS.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticleRepo extends JpaRepository<Article,Long> {

}
