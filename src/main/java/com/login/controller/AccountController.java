package com.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.login.entity.AccountUser;
import com.login.service.AccountService;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {
	
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/{accountNumber}")
    public ResponseEntity<AccountUser> getAccountByAccountNumber(@PathVariable String accountNumber) {
        AccountUser account = accountService.getByAccountNumber(accountNumber);
        return ResponseEntity.ok(account);
    }
    
    @PostMapping("/save")
    public ResponseEntity<AccountUser> createAccount(@RequestBody AccountUser account) {
        AccountUser savedAccount = accountService.saveAccount(account);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedAccount);
    }
}