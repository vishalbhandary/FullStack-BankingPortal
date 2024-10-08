package com.vishal.BankingPortal.service;

import java.util.List;

import com.vishal.BankingPortal.dto.TransactionDTO;

public interface TransactionService {

	List<TransactionDTO> getAllTransactionsByAccountNumber(String accountNumber);

}
