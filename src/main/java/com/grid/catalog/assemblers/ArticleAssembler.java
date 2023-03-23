package com.grid.catalog.assemblers;

import com.grid.catalog.controllers.CatalogController;
import com.grid.catalog.models.dtos.ArticleDto;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Component
public class ArticleAssembler implements RepresentationModelAssembler<ArticleDto, EntityModel<ArticleDto>> {

    @Override
    public EntityModel<ArticleDto> toModel(final ArticleDto entity) {
        return EntityModel.of(entity, linkTo(methodOn(CatalogController.class).getProductByUnique_Id(entity.getUniqId())).withSelfRel());
    }

}
