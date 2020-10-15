package com.cic.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cic.dto.ArpuDTO;

@Service
public interface ArpuService {
	
	List<ArpuDTO> findAll();
	
	ArpuDTO save(ArpuDTO arpuDto);
	
	ArpuDTO findOne(Long id);
	
	ArpuDTO delete(ArpuDTO arpuDto);

}
