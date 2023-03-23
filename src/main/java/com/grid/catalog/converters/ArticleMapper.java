package com.grid.catalog.converters;

import com.grid.catalog.models.Article;
import com.grid.catalog.models.dtos.ArticleDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ArticleMapper {
    ArticleMapper INSTANCE = Mappers.getMapper(ArticleMapper.class);

    ArticleDto modelToDto(Article article);

    Article dtoToModel(ArticleDto articleDto);

}
