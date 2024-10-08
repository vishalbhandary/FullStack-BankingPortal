package com.vishal.BankingPortal.exception;


public class InsufficientBalanceException extends RuntimeException {

    public InsufficientBalanceException(String message) {
        super(message);
    }
}
