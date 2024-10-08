package com.vishal.BankingPortal.dto;

public record FundTransferRequest(String sourceAccountNumber, String targetAccountNumber, double amount, String pin) {
}
