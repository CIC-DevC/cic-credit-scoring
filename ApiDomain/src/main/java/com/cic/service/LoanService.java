package com.cic.service;

import java.util.List;

import com.cic.domain.Loan;

public interface LoanService {
	
	List<Loan> findAll();
	
	List<Loan> findByPhoneNum(String phoneNum);
	
	Integer countLoanTypeOneOfMsisdn(String phoneNum);
	
	Integer countLoanTypeZeroOfMsisdn(String phoneNum);
	
	Integer sumOfLoanOfMsisdn(String phoneNum);
	
}
