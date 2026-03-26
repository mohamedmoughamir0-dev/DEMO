package com.example.demo.controller;

import com.example.demo.entite.Article;
import com.example.demo.service.ArticleService;
import com.example.demo.service.ArticleServiceImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ArticleController {
    private ArticleServiceImp articleService;
    public ArticleController(ArticleServiceImp articleService)
    {
        this.articleService=articleService;
    }
    @GetMapping("/article/{id}")
    public Article getArticle(@PathVariable Integer id)
    {
        return articleService.AfficherArticleById(id);
    }
    @PostMapping("/article/create")
    public void ajouterArticle(@RequestBody Article article)
    {
        articleService.createArticle(article);
    }
    @GetMapping("/article")
    public List<Article> getAllArticles()
    {
        return articleService.AffciherArticles();
    }
}
