package com.login.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.login.entity.AccountUser;
import com.login.repository.AccountRepo;

import jakarta.persistence.EntityNotFoundException;

@Service
public class AccountService {
    private final AccountRepo Repository;

    @Autowired
    public AccountService(AccountRepo accountRepository) {
        this.Repository = accountRepository;
    }

    public AccountUser getByAccountNumber(String accountNumber) {
        return Repository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new EntityNotFoundException("Account not found"));
    }
    
    public AccountUser saveAccount(AccountUser account) {
        return Repository.save(account);
    }
    
}