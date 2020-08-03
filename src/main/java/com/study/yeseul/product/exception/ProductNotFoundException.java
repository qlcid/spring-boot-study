package com.study.yeseul.product.exception;

import com.study.yeseul.error.exception.NotFoundException;

public class ProductNotFoundException extends NotFoundException {

    public ProductNotFoundException(Long id) { super(id + " is not found"); }
}
