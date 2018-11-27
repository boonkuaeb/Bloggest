package com.bk.bloggest.service;

import com.bk.bloggest.model.Article;
import com.bk.bloggest.repository.ArticleRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleService {

    ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public Page<Article> getAll(Pageable pageable) {
        return articleRepository.findByTitleContainingAndBodyContaining("", "", pageable);
    }

    public Page<Article> search(String q, Pageable pageable) {
        return articleRepository.findByTitleContainingAndBodyContaining(q, q, pageable);
    }

    public Optional<Article> getByLink(String link)
    {
        return articleRepository.findByLink(link);
    }

    public Optional<Article> getById(String id)
    {
        return articleRepository.findById(id);
    }

    public void save(Article article){
        articleRepository.save(article);
    }
    public void deleteAll() {
        articleRepository.deleteAll();
    }

    public void deleteById(String id)
    {
        articleRepository.deleteById(id);
    }

}
