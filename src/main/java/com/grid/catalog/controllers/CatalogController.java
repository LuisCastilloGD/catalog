package com.grid.catalog.controllers;


import com.grid.catalog.assemblers.ArticleAssembler;
import com.grid.catalog.converters.ArticleMapper;
import com.grid.catalog.models.dtos.ArticleDto;
import com.grid.catalog.services.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.hateoas.EntityModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    private final ArticleMapper articleMapper;

    private final ArticleAssembler articleAssembler;

    @GetMapping("/get/uniqueId/{uniqueId}")
    public EntityModel<ArticleDto> getProductByUniqueId(@PathVariable String uniqueId){
        return articleAssembler.toModel(articleMapper.modelToDto(catalogService.getArticleByUniqueId(uniqueId)));
    }

    @GetMapping("/get/sku/{sku}")
    public List<EntityModel<ArticleDto>> getProductBySku(@PathVariable String sku){
        return catalogService.getArticlesBySku(sku).stream().map(articleMapper::modelToDto).map(articleAssembler::toModel).toList();
    }

}
