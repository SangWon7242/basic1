package com.sbs.basic1.boundedContext.article.controller;

import com.sbs.basic1.boundedContext.article.entity.Article;
import com.sbs.basic1.boundedContext.article.service.ArticleService;
import com.sbs.basic1.boundedContext.base.rsData.RsData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/article")
@RequiredArgsConstructor
public class ArticleController {
  private final ArticleService articleService;

  @GetMapping("/write")
  @ResponseBody
  public RsData write(String title, String content) {
    if(title == null || title.trim().isBlank()) {
      return RsData.of("F-1", "제목을 입력해주세요.");
    }

    if(content == null || content.trim().isBlank()) {
      return RsData.of("F-2", "내용을 입력해주세요.");
    }

    Article article = articleService.write(title, content);

    return RsData.of("S-1", "%d번 게시물이 작성되었습니다.".formatted(article.getId()), article);
  }
}
