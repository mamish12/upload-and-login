package com.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
//	private String Date;
	
	private String accountNo;
	private String bankName;
	
	private String naration;
	
	private String valuedate;
	
	private String debitamount;
	
//	private String creditamount;
	
	private String cheque;
	
//	private String closingbalance;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String naration, String valuedate, String debitamount,
			String cheque) {
		super();

//		Date = date;
		this.naration = naration;
		this.valuedate = valuedate;
		this.debitamount = debitamount;
//		this.creditamount = creditamount;
		this.cheque = cheque;
//		this.closingbalance = closingbalance;
	}

//	public String getDate() {
//		return Date;
//	}
//
//	public void setDate(String date) {
//		Date = date;
//	}

	public String getNaration() {
		return naration;
	}

	public void setNaration(String naration) {
		this.naration = naration;
	}

	public String getValuedate() {
		return valuedate;
	}

	public void setValuedate(String valuedate) {
		this.valuedate = valuedate;
	}

	public String getDebitamount() {
		return debitamount;
	}

	public void setDebitamount(String debitamount) {
		this.debitamount = debitamount;
	}

//	public String getCreditamount() {
//		return creditamount;
//	}
//
//	public void setCreditamount(String creditamount) {
//		this.creditamount = creditamount;
//	}

	public String getCheque() {
		return cheque;
	}

	public void setCheque(String cheque) {
		this.cheque = cheque;
	}

//	public String getClosingbalance() {
//		return closingbalance;
//	}
//
//	public void setClosingbalance(String closingbalance) {
//		this.closingbalance = closingbalance;
//	}

	
	
	

	
}
	
	

