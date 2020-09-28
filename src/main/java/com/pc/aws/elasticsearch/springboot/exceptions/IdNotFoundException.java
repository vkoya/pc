package com.pc.aws.elasticsearch.springboot.exceptions;

public class IdNotFoundException extends Exception {
    public IdNotFoundException(String message) {
        super(message);
    }
}
