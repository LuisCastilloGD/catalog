package com.grid.catalog.converters;

import com.grid.catalog.models.Product;
import com.grid.catalog.models.dtos.ProductDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductMapper INSTANCE = Mappers.getMapper(ProductMapper.class);

    ProductDto modelToDto(Product product);

    Product dtoToModel(ProductDto productDto);

}
