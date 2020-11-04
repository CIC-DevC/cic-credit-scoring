package com.cic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.domain.Recharge;
import com.cic.repository.RechargeRepository;
import com.cic.service.RechargeService;

@Service
public class RechargeServiceImpl implements RechargeService{
	@Autowired
	RechargeRepository rechargeRepository;
	
	public RechargeServiceImpl(RechargeRepository rechargeRepository){
		this.rechargeRepository = rechargeRepository;
	}
	
	@Override
	public List<Recharge> findAll() {
		List<Recharge> lstArpu = rechargeRepository.findAll();
		return lstArpu;
	}

	@Override
	public List<Recharge> findByPhoneNum(String phoneNum) {
		return rechargeRepository.findByPhoneNum(phoneNum);
	}

}
