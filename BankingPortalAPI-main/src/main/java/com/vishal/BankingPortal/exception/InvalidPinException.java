package com.vishal.BankingPortal.exception;


public class InvalidPinException extends RuntimeException {

    public InvalidPinException(String message) {
        super(message);
    }
}
