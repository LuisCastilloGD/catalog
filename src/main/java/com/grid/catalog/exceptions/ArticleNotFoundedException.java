package com.grid.catalog.exceptions;

public class ArticleNotFoundedException extends RuntimeException{

    public ArticleNotFoundedException() {
        super("Product not found");
    }
}
