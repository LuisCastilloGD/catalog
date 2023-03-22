package com.grid.catalog.controllers;


import com.grid.catalog.assemblers.ProductAssembler;
import com.grid.catalog.converters.ProductMapper;
import com.grid.catalog.models.Product;
import com.grid.catalog.models.dtos.ProductDto;
import com.grid.catalog.services.CatalogService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.query.Param;
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

    private final ProductMapper productMapper;

    private final ProductAssembler productAssembler;

    @GetMapping("/get/unique_id/{unique_id}")
    public EntityModel<ProductDto> getProductByUnique_Id(@PathVariable String unique_id){
        return productAssembler.toModel(productMapper.modelToDto(catalogService.getProductByUnique_Id(unique_id)));
    }

    @GetMapping("/get/sku/{sku}")
    public List<ProductDto> getProductBySku(@PathVariable String sku){
        return catalogService.getProductsBySku(sku).stream().map(productMapper::modelToDto).toList();
    }

}
