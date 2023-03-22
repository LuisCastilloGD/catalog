package com.grid.catalog.converters;

import com.grid.catalog.models.Product;
import com.grid.catalog.models.dtos.ProductDto;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-03-22T13:03:19-0600",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Homebrew)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDto modelToDto(Product product) {
        if ( product == null ) {
            return null;
        }

        String uniqId = null;

        uniqId = product.getUniqId();

        ProductDto productDto = new ProductDto( uniqId );

        productDto.setId( product.getId() );
        productDto.setSku( product.getSku() );
        productDto.setName_title( product.getName_title() );
        productDto.setDescription( product.getDescription() );
        if ( product.getList_price() != null ) {
            productDto.setList_price( new BigDecimal( product.getList_price() ) );
        }
        productDto.setSale_price( product.getSale_price() );
        productDto.setCategory( product.getCategory() );
        productDto.setCategory_tree( product.getCategory_tree() );
        productDto.setAverage_product_rating( product.getAverage_product_rating() );
        productDto.setProduct_url( product.getProduct_url() );
        productDto.setBrand( product.getBrand() );

        return productDto;
    }

    @Override
    public Product dtoToModel(ProductDto productDto) {
        if ( productDto == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productDto.getId() );
        product.setUniqId( productDto.getUniqId() );
        product.setSku( productDto.getSku() );
        product.setName_title( productDto.getName_title() );
        product.setDescription( productDto.getDescription() );
        if ( productDto.getList_price() != null ) {
            product.setList_price( productDto.getList_price().toString() );
        }
        product.setSale_price( productDto.getSale_price() );
        product.setCategory( productDto.getCategory() );
        product.setCategory_tree( productDto.getCategory_tree() );
        product.setAverage_product_rating( productDto.getAverage_product_rating() );
        product.setProduct_url( productDto.getProduct_url() );
        product.setBrand( productDto.getBrand() );

        return product;
    }
}
