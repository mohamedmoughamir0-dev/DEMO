package com.example.demo.service;

import com.example.demo.entite.Article;
import com.example.demo.repos.ArticleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleServiceImp implements ArticleService{
     ArticleRepository articleRepository;
    public ArticleServiceImp(ArticleRepository articleRepository)
    {this.articleRepository=articleRepository;}
    @Override
    public void createArticle(Article article){
        articleRepository.save(article);
    }

    @Override
    public Article AfficherArticleById(Integer id) {
        return articleRepository.findById(id).get();
    }

    @Override
    public List<Article> AffciherArticles() {
        return articleRepository.findAll();
    }
    public void deleteAtricleById(Integer id)
    {articleRepository.deleteById(id);
    }
    @Override
    public void modifierArticle(Integer id,Article article)
    {Article a=articleRepository.findById(id).get();
        a.setTitre(article.getTitre());
        a.setDescription(article.getDescription());
        articleRepository.save(a);

    }
}
