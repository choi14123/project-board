package com.example.projectboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article;
    private String content;

    private LocalDateTime cratedAt;
    private String createdBy;
    private LocalDateTime modifiedAt;
    private String modifiedBy;

}
