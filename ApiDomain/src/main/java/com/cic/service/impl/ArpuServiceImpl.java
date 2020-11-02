package com.cic.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cic.domain.Arpu;
import com.cic.dto.ArpuDTO;
import com.cic.mapper.ArpuMapper;
import com.cic.repository.ArpuRepository;
import com.cic.service.ArpuService;

@Service
public class ArpuServiceImpl implements ArpuService{

	ArpuRepository arpuRepository;
	ArpuMapper arpuMapper;
	
	ArpuServiceImpl(ArpuRepository arpuRepository, ArpuMapper arpuMapper){
		this.arpuRepository = arpuRepository;
		this.arpuMapper = arpuMapper;
	}
	
	@Override
	public List<ArpuDTO> findAll() {
		List<ArpuDTO> lstArpuDTO = new ArrayList<>();
		List<Arpu> lstArpu = arpuRepository.findAll();
		for(Arpu arpu : lstArpu) {
			lstArpuDTO.add(arpuMapper.toDto(arpu));
		}
		return lstArpuDTO;
	}

	@Override
	public ArpuDTO save(ArpuDTO arpuDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArpuDTO findOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArpuDTO delete(ArpuDTO arpuDto) {
		// TODO Auto-generated method stub
		return null;
	}

}
