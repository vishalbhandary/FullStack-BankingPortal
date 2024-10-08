package com.vishal.BankingPortal.exception;


public class OtpRetryLimitExceededException extends RuntimeException {

    public OtpRetryLimitExceededException(String message) {
        super(message);
    }
}
