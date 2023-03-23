package com.grid.catalog.services.implementations;

import com.grid.catalog.exceptions.ArticleNotFoundedException;
import com.grid.catalog.models.Article;
import com.grid.catalog.repositories.ArticleRepository;
import com.grid.catalog.services.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CatalogServiceImpl implements CatalogService {

    private final ArticleRepository articleRepository;

    @Override
    public Article getArticleByUnique_Id(final String unique_id) {
        return articleRepository.findByUniqId(unique_id)
                             .orElseThrow(ArticleNotFoundedException::new);
    }

    @Override
    public List<Article> getArticlesBySku(final String sku) {
        return articleRepository.findBySku(sku)
                                .stream()
                                .toList();

    }
}
