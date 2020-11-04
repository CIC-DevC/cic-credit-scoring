package com.cic.service;

import java.util.List;

import com.cic.domain.Recharge;

public interface RechargeService {
	
	List<Recharge> findAll();
	
	List<Recharge> findByPhoneNum(String phoneNum);
	
}
