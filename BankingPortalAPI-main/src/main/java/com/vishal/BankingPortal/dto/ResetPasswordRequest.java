package com.vishal.BankingPortal.dto;

public record ResetPasswordRequest(String identifier, String resetToken, String newPassword) {
}
