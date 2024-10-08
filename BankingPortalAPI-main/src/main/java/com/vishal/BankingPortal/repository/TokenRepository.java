package com.vishal.BankingPortal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishal.BankingPortal.entity.Account;
import com.vishal.BankingPortal.entity.Token;

@Repository
public interface TokenRepository extends JpaRepository<Token, Long> {

    Token findByToken(String token);

    Token[] findAllByAccount(Account account);

    void deleteByToken(String token);
}
