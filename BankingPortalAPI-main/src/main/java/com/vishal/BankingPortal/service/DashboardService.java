package com.vishal.BankingPortal.service;

import com.vishal.BankingPortal.dto.AccountResponse;
import com.vishal.BankingPortal.dto.UserResponse;

public interface DashboardService {
    UserResponse getUserDetails(String accountNumber);
    AccountResponse getAccountDetails(String accountNumber);
}