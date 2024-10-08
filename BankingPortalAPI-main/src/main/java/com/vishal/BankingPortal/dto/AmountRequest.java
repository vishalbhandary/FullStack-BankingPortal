package com.vishal.BankingPortal.dto;

public record AmountRequest(String accountNumber, String pin, double amount) {
}
