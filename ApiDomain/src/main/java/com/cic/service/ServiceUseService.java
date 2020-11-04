package com.cic.service;

import java.util.List;

import com.cic.domain.ServiceUse;

public interface ServiceUseService {
	
	List<ServiceUse> findAll();
	
	List<ServiceUse> findByPhoneNum(String phoneNum);
}
