package com.sbs.basic1.boundedContext.article.service;

import com.sbs.basic1.boundedContext.article.entity.Article;
import com.sbs.basic1.boundedContext.article.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleService {
  private final ArticleRepository articleRepository;

  public Article save(String title, String content) {
    Article article = Article.builder()
      .title(title)
      .content(content)
      .build();

    articleRepository.save(article);

    return article;
  }
}
