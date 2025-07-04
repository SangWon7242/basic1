package com.sbs.basic1.boundedContext.article.repository;

import com.sbs.basic1.boundedContext.article.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
