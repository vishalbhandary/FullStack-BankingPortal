package com.vishal.BankingPortal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishal.BankingPortal.entity.User;
import com.vishal.BankingPortal.entity.PasswordResetToken;

@Repository
public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Long> {
    Optional<PasswordResetToken> findByToken(String token);

    PasswordResetToken findByUser(User user);

    void deleteByToken(String token);
}
