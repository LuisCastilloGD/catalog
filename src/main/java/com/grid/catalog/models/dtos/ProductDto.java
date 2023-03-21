package com.grid.catalog.models.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class ProductDto {
    @NotNull
    private Long id;

    @NonNull
    @NotNull
    @NotBlank
    private String uniq_id;

    private String sku;

    private String name_title;

    private String description;

    private BigDecimal list_price;

    private String sale_price;

    private String category;

    private String category_tree;

    private String average_product_rating;

    private String product_url;

    private String brand;
}
