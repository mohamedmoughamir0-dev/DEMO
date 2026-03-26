package com.example.demo.service;

import com.example.demo.entite.Article;

import java.util.List;
import java.util.Optional;

public interface ArticleService {
    public void createArticle(Article article);
    public Article AfficherArticleById(Integer id);
    public List<Article> AffciherArticles();
    public void deleteAtricleById(Integer id);
    public void modifierArticle(Integer id,Article article);
}
