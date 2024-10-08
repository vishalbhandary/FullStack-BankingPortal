package com.vishal.BankingPortal.service;

import org.springframework.http.ResponseEntity;

import com.vishal.BankingPortal.entity.*;
import com.vishal.BankingPortal.dto.*;

public interface AuthService {
    public String generatePasswordResetToken(User user);

    public boolean verifyPasswordResetToken(String token, User user);

    public void deletePasswordResetToken(String token);

    public ResponseEntity<String> sendOtpForPasswordReset(OtpRequest otpRequest);

    public ResponseEntity<String> verifyOtpAndIssueResetToken(OtpVerificationRequest otpVerificationRequest);

    public ResponseEntity<String> resetPassword(ResetPasswordRequest resetPasswordRequest);

}
