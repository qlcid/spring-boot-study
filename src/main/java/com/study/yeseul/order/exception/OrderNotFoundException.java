package com.study.yeseul.order.exception;

import com.study.yeseul.error.exception.NotFoundException;

public class OrderNotFoundException extends NotFoundException {

    public OrderNotFoundException(Long id) {
        super(id + " is not found");
    }
}
