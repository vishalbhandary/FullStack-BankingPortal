package com.vishal.BankingPortal.exception;

public class AccountDoesNotExistException extends RuntimeException {

    public AccountDoesNotExistException(String message) {
        super(message);
    }
}
