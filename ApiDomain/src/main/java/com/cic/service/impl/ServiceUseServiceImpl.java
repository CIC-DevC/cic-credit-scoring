package com.cic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.domain.ServiceUse;
import com.cic.repository.ServiceUseRepository;
import com.cic.service.ServiceUseService;

@Service
public class ServiceUseServiceImpl implements ServiceUseService{
	@Autowired
	ServiceUseRepository serviceUseRepository;
	
	public ServiceUseServiceImpl(ServiceUseRepository serviceUseRepository){
		this.serviceUseRepository = serviceUseRepository;
	}
	
	@Override
	public List<ServiceUse> findAll() {
		List<ServiceUse> lstArpu = serviceUseRepository.findAll();
		return lstArpu;
	}

	@Override
	public List<ServiceUse> findByPhoneNum(String phoneNum) {
		return serviceUseRepository.findByPhoneNum(phoneNum);
	}
}
