package com.vishal.BankingPortal.service;

import org.springframework.stereotype.Service;

import com.vishal.BankingPortal.dto.AccountResponse;
import com.vishal.BankingPortal.dto.UserResponse;
import com.vishal.BankingPortal.exception.NotFoundException;
import com.vishal.BankingPortal.repository.AccountRepository;
import com.vishal.BankingPortal.repository.UserRepository;
import com.vishal.BankingPortal.util.ApiMessages;

import lombok.RequiredArgsConstructor;
import lombok.val;

@Service
@RequiredArgsConstructor
public class DashboardServiceImpl implements DashboardService {

    private final UserRepository userRepository;
    private final AccountRepository accountRepository;

    @Override
    public UserResponse getUserDetails(String accountNumber) {
        val user = userRepository.findByAccountAccountNumber(accountNumber)
                .orElseThrow(() -> new NotFoundException(
                        String.format(ApiMessages.USER_NOT_FOUND_BY_ACCOUNT.getMessage(), accountNumber)));

        return new UserResponse(user);
    }

    @Override
    public AccountResponse getAccountDetails(String accountNumber) {
        val account = accountRepository.findByAccountNumber(accountNumber);
        if (account == null) {
            throw new NotFoundException(String.format(ApiMessages.USER_NOT_FOUND_BY_ACCOUNT.getMessage(), accountNumber));
        }

        return new AccountResponse(account);
    }

}
