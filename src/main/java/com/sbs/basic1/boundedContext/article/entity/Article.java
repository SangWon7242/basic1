package com.sbs.basic1.boundedContext.article.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@EntityListeners(AuditingEntityListener.class)
public class Article {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  @CreatedDate
  @Column(updatable = false)
  private LocalDateTime createDate;

  @LastModifiedDate
  private LocalDateTime modifiedDate;
  private String title;
  private String content;
}
