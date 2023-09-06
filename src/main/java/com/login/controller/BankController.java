//package com.login.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.login.entity.Bank;
//import com.login.service.BankService;
//@RestController
//@RequestMapping("/api/bank")
//public class BankController {
//	
//	 private final BankService bankService;
//
//	    @Autowired
//	    public BankController(BankService bankService) {
//	        this.bankService = bankService;
//	    }
//
//	    @GetMapping("/{baccountNo}")
//	    public ResponseEntity<Bank> getAccountByAccountNumber(@PathVariable String baccountNo) {
//	        Bank bank = bankService.getByAccountNumber(baccountNo);
//	        return ResponseEntity.ok(bank);
//	    }
//	    
//	    @PostMapping("/post")
//	    public ResponseEntity<Bank> createAccount(@RequestBody Bank bank) {
//	        Bank bank2 = bankService.saveBankDetails(bank);
//	        return ResponseEntity.status(HttpStatus.CREATED).body(bank2);
//	    }
//
//}
