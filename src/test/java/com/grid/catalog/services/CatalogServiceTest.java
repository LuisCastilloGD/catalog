package com.grid.catalog.services;

import com.grid.catalog.exceptions.ArticleNotFoundedException;
import com.grid.catalog.models.Article;
import com.grid.catalog.repositories.ArticleRepository;
import com.grid.catalog.services.implementations.CatalogServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CatalogServiceTest {
    @InjectMocks
    private CatalogServiceImpl catalogService;
    @Mock
    private ArticleRepository articleRepository;

    private Article article1;
    private Article article2;
    private List<Article> articleList;
    @BeforeEach
    public void setUp() {
        article1 = Article.builder()
                .id(1L)
                .uniqId("abc1")
                .sku("group1")
                .name_title("shoes")
                .category("clothes")
                .category_tree("clothes")
                .list_price("35.5")
                .sale_price("40")
                .description("Fully cool shoes")
                .product_url("https://urltoshoes.com")
                          .brand("niky")
                          .build();
        article2 =  Article.builder()
                           .id(2L)
                           .uniqId("abc2")
                           .sku("group1")
                           .name_title("shoes with laces")
                           .category("clothes")
                           .category_tree("clothes")
                           .list_price("35.5")
                           .sale_price("45")
                           .description("Fully cool shoes")
                           .product_url("https://urltoshoes.com")
                           .brand("puma")
                           .build();
        articleList = Arrays.asList(article1, article2);
    }

    @Test
    @DisplayName(" should get product")
    public void testGetArticleByUniqueId() {
        String uniqueId = article1.getUniqId();
        when(articleRepository.findByUniqId(uniqueId)).thenReturn(Optional.ofNullable(article1));
        assertEquals(article1, catalogService.getArticleByUniqueId(uniqueId));
    }

    @Test
    @DisplayName(" should throw not founded product ")
    public void testNotFoundGetArticleByUniqueId() {
        String uniqueId = "";
        when(articleRepository.findByUniqId(uniqueId)).thenReturn(Optional.empty());
        assertThrows(ArticleNotFoundedException.class, () -> catalogService.getArticleByUniqueId(uniqueId));
    }


    @Test
    @DisplayName(" should get products with same sku ")
    public void testGetArticleBySku() {
        String sku = article1.getSku();
        when(articleRepository.findBySku(sku)).thenReturn(List.of(article1,article2));
        assertEquals(articleList, catalogService.getArticlesBySku(sku));
    }


}
