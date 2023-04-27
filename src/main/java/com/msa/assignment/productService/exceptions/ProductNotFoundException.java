package com.msa.assignment.productService.exceptions;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ProductNotFoundException extends ProductException {

    private static final long serialVersionUID = 334051992916748022L;

    public ProductNotFoundException(final String errorMessage) {
        super(errorMessage);
    }

}
