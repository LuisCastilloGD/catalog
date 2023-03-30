package com.grid.catalog.converters;

import com.grid.catalog.models.Article;
import com.grid.catalog.models.Article.ArticleBuilder;
import com.grid.catalog.models.dtos.ArticleDto;
import com.grid.catalog.models.dtos.ArticleDto.ArticleDtoBuilder;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-28T15:48:58-0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Homebrew)"
)
@Component
public class ArticleMapperImpl implements ArticleMapper {

    @Override
    public ArticleDto modelToDto(Article article) {
        if ( article == null ) {
            return null;
        }

        ArticleDtoBuilder articleDto = ArticleDto.builder();

        articleDto.id( article.getId() );
        articleDto.uniqId( article.getUniqId() );
        articleDto.sku( article.getSku() );
        articleDto.name_title( article.getName_title() );
        articleDto.description( article.getDescription() );
        if ( article.getList_price() != null ) {
            articleDto.list_price( new BigDecimal( article.getList_price() ) );
        }
        articleDto.sale_price( article.getSale_price() );
        articleDto.category( article.getCategory() );
        articleDto.category_tree( article.getCategory_tree() );
        articleDto.average_product_rating( article.getAverage_product_rating() );
        articleDto.product_url( article.getProduct_url() );
        articleDto.brand( article.getBrand() );

        return articleDto.build();
    }

    @Override
    public Article dtoToModel(ArticleDto articleDto) {
        if ( articleDto == null ) {
            return null;
        }

        ArticleBuilder article = Article.builder();

        article.id( articleDto.getId() );
        article.uniqId( articleDto.getUniqId() );
        article.sku( articleDto.getSku() );
        article.name_title( articleDto.getName_title() );
        article.description( articleDto.getDescription() );
        if ( articleDto.getList_price() != null ) {
            article.list_price( articleDto.getList_price().toString() );
        }
        article.sale_price( articleDto.getSale_price() );
        article.category( articleDto.getCategory() );
        article.category_tree( articleDto.getCategory_tree() );
        article.average_product_rating( articleDto.getAverage_product_rating() );
        article.product_url( articleDto.getProduct_url() );
        article.brand( articleDto.getBrand() );

        return article.build();
    }
}
