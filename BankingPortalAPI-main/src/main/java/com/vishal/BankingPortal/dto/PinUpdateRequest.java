package com.vishal.BankingPortal.dto;

public record PinUpdateRequest(String accountNumber, String oldPin, String newPin, String password) {
}
