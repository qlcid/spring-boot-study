package com.study.yeseul.error.exception;

public class NotFoundException extends BusinessException {

    public NotFoundException(String message) {
        super(message, ErrorCode.ENTITY_NOT_FOUND);
    }
}