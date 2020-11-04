package com.cic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.domain.Arpu;
import com.cic.domain.Loan;
import com.cic.repository.ArpuRepository;
import com.cic.repository.LoanRepository;
import com.cic.service.ArpuService;
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

}
