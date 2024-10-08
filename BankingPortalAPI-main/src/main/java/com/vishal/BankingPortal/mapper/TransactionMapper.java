package com.vishal.BankingPortal.mapper;

import org.springframework.stereotype.Component;

import com.vishal.BankingPortal.dto.TransactionDTO;
import com.vishal.BankingPortal.entity.Transaction;

@Component
public class TransactionMapper {

    public TransactionDTO toDto(Transaction transaction) {
        return new TransactionDTO(transaction);
    }

}
