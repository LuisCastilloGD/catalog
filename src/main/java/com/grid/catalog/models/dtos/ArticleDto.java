package com.grid.catalog.models.dtos;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.NonNull;

import java.math.BigDecimal;

@Data
public class ArticleDto {
    @NotNull
    private Long id;

    @NonNull
    @NotNull
    @NotBlank
    private String uniqId;

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
