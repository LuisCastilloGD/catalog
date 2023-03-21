package com.grid.catalog.exceptions.advisors;

import com.grid.catalog.exceptions.ProductNotFoundedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductNotFoundedAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProductNotFoundedException.class)
    public String productNotFoundHandler(final ProductNotFoundedException e) {
        return e.getMessage();
    }

}
