package com.bk.bloggest.repository;


import com.bk.bloggest.domain.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.elasticsearch.repository.ElasticsearchCrudRepository;

import java.awt.print.Pageable;
import java.util.Optional;

public interface ArticleRepository extends ElasticsearchCrudRepository<Article, String> {
    Optional<Article> findByLink(String link);
    Page<Article> findByTitleContainingAndBodyContaining(String title, String body, Pageable pageable);
}
