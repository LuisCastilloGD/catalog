package com.grid.catalog.assemblers;

import com.grid.catalog.controllers.CatalogController;
import com.grid.catalog.models.dtos.ProductDto;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ProductAssembler implements RepresentationModelAssembler<ProductDto, EntityModel<ProductDto>> {

    @Override
    public EntityModel<ProductDto> toModel(final ProductDto entity) {
        return EntityModel.of(entity, linkTo(methodOn(CatalogController.class).getProductByUnique_Id(entity.getUniqId())).withSelfRel());
    }

}
