package com.java.learning.exceptionHandling;

public class InsufficientBalanceException extends RuntimeException {

    InsufficientBalanceException(String message) {
        super(message);
    }
}
