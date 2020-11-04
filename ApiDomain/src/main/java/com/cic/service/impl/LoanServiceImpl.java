package com.cic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.domain.Loan;
import com.cic.repository.LoanRepository;
import com.cic.service.LoanService;


@Service
public class LoanServiceImpl implements LoanService{
	@Autowired
	LoanRepository loanRepository;
	
	public LoanServiceImpl(LoanRepository loanRepository){
		this.loanRepository = loanRepository;
	}
	
	@Override
	public List<Loan> findAll() {
		List<Loan> lstArpu = loanRepository.findAll();
		return lstArpu;
	}

	@Override
	public List<Loan> findByPhoneNum(String phoneNum) {
		return loanRepository.findByPhoneNum(phoneNum);
	}

	@Override
	public Integer countLoanTypeOneOfMsisdn(String phoneNum) {
		return loanRepository.countLoanTypeOneOfMsisdn(phoneNum);
	}

	@Override
	public Integer countLoanTypeZeroOfMsisdn(String phoneNum) {
		return loanRepository.countLoanTypeZeroOfMsisdn(phoneNum);
	}

	@Override
	public Integer sumOfLoanOfMsisdn(String phoneNum) {
		return loanRepository.sumOfLoanOfMsisdn(phoneNum);
	}

}
