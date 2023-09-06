//package com.login.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.login.entity.Bank;
//import com.login.repository.BankRepo;
//
//import jakarta.persistence.EntityNotFoundException;
//
//@Service
//public class BankService {
//	
//	private final BankRepo bankRepo;
//
//    @Autowired
//    public BankService(BankRepo repo) {
//        this.bankRepo = repo;
//    }
//
//    public Bank getByAccountNumber(String baccountNo) {
//        return bankRepo.findBybaccountNo(baccountNo)
//                .orElseThrow(() -> new EntityNotFoundException("Account not found"));
//    }
//    
//    public Bank saveBankDetails(Bank bank) {
//        return bankRepo.save(bank);
//    }
//    
//	
//
//}
