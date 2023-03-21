package com.grid.catalog.exceptions;

public class ProductNotFoundedException extends RuntimeException{

    public ProductNotFoundedException() {
        super("Product not found");
    }
}
