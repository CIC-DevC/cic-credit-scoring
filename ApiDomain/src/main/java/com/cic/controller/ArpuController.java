package com.cic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cic.dto.ArpuDTO;
import com.cic.repository.ArpuRepository;
import com.cic.service.ArpuService;

@RestController
@RequestMapping("/api/arpu")
public class ArpuController {

	@Autowired
	ArpuRepository repository;
	
	@Autowired
	ArpuService arpuService;
	
	public ArpuController(ArpuRepository repository, ArpuService arpuService) {
		super();
		this.repository = repository;
		this.arpuService = arpuService;
	}

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 15, 2020 - 10:21:04 PM
	 * @param model
	 * @return
	 */
	@RequestMapping(value = { "/", "/list" })
	public List<ArpuDTO> listArpu() {
		List<ArpuDTO> lstArpuDTO = arpuService.findAll();
		return lstArpuDTO;
	}
}
