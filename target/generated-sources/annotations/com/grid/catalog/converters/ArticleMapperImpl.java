package com.grid.catalog.converters;

import com.grid.catalog.models.Article;
import com.grid.catalog.models.dtos.ArticleDto;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-23T17:40:39-0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Homebrew)"
)
@Component
public class ArticleMapperImpl implements ArticleMapper {

    @Override
    public ArticleDto modelToDto(Article article) {
        if ( article == null ) {
            return null;
        }

        String uniqId = null;

        uniqId = article.getUniqId();

        ArticleDto articleDto = new ArticleDto( uniqId );

        articleDto.setId( article.getId() );
        articleDto.setSku( article.getSku() );
        articleDto.setName_title( article.getName_title() );
        articleDto.setDescription( article.getDescription() );
        if ( article.getList_price() != null ) {
            articleDto.setList_price( new BigDecimal( article.getList_price() ) );
        }
        articleDto.setSale_price( article.getSale_price() );
        articleDto.setCategory( article.getCategory() );
        articleDto.setCategory_tree( article.getCategory_tree() );
        articleDto.setAverage_product_rating( article.getAverage_product_rating() );
        articleDto.setProduct_url( article.getProduct_url() );
        articleDto.setBrand( article.getBrand() );

        return articleDto;
    }

    @Override
    public Article dtoToModel(ArticleDto articleDto) {
        if ( articleDto == null ) {
            return null;
        }

        Article article = new Article();

        article.setId( articleDto.getId() );
        article.setUniqId( articleDto.getUniqId() );
        article.setSku( articleDto.getSku() );
        article.setName_title( articleDto.getName_title() );
        article.setDescription( articleDto.getDescription() );
        if ( articleDto.getList_price() != null ) {
            article.setList_price( articleDto.getList_price().toString() );
        }
        article.setSale_price( articleDto.getSale_price() );
        article.setCategory( articleDto.getCategory() );
        article.setCategory_tree( articleDto.getCategory_tree() );
        article.setAverage_product_rating( articleDto.getAverage_product_rating() );
        article.setProduct_url( articleDto.getProduct_url() );
        article.setBrand( articleDto.getBrand() );

        return article;
    }
}
