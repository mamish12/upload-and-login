package com.login.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.entity.AccountUser;

public interface AccountRepo extends JpaRepository<AccountUser, Long>{
	
	  Optional<AccountUser> findByAccountNumber(String accountNumber);

}
