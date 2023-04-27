package com.msa.assignment.productService.exceptions;

public class ProductException extends Exception {

    protected ProductException(final String message) {
        super(message);
    }

    // needed because Exceptions must be serializable
    private static final long serialVersionUID = 6013983962125460401L;
}
