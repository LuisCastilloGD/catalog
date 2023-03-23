package com.grid.catalog.exceptions.advisors;

import com.grid.catalog.exceptions.ArticleNotFoundedException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ArticleNotFoundedAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ArticleNotFoundedException.class)
    public String articleNotFoundHandler(final ArticleNotFoundedException e) {
        return e.getMessage();
    }

}
