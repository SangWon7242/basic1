package com.sbs.basic1.boundedContext.member.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Member {
  @Id
  @GeneratedValue(strategy = IDENTITY)
  private Long id;

  @CreatedDate
  @Column(updatable = false)
  private LocalDateTime createDate;

  @LastModifiedDate
  private LocalDateTime modifiedDate;

  @Column(unique = true, nullable = false) // nullable이란 null을 허용하는지 여부
  private String username;
  private String password;
}
