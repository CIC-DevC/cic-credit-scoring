package com.cic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.domain.Mobile;
import com.cic.repository.MobileRepository;
import com.cic.service.MobileService;


@Service
public class MobileServiceImpl implements MobileService{
	@Autowired
	MobileRepository mobileRepository;
	
	public MobileServiceImpl(MobileRepository mobileRepository){
		this.mobileRepository = mobileRepository;
	}
	
	@Override
	public Mobile check(String phoneNum) {
		Mobile score = mobileRepository.check(phoneNum);
		return score;
	}

	

}
