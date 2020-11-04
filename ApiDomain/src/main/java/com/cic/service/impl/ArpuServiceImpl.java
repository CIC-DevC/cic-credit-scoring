package com.cic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.domain.Arpu;
import com.cic.repository.ArpuRepository;
import com.cic.service.ArpuService;


@Service
public class ArpuServiceImpl implements ArpuService{
	@Autowired
	ArpuRepository arpuRepository;
	
	public ArpuServiceImpl(ArpuRepository arpuRepository){
		this.arpuRepository = arpuRepository;
	}
	
	@Override
	public List<Arpu> findAll() {
		List<Arpu> lstArpu = arpuRepository.findAll();
		return lstArpu;
	}

	@Override
	public Arpu findByPhoneNum(String phoneNum) {
		return arpuRepository.findByPhoneNum(phoneNum);
	}

}
