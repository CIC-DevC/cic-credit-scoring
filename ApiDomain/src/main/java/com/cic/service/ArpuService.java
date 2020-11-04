package com.cic.service;

import java.util.List;

import com.cic.domain.Arpu;

public interface ArpuService {
	
	List<Arpu> findAll();
	
	Arpu findByPhoneNum(String phoneNum);
	
}
