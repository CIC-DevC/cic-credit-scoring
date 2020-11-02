package com.cic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cic.dto.ArpuDTO;
import com.cic.service.ArpuService;
@RestController
@RequestMapping("/api")
public class ArpuController {

	
	@Autowired
	ArpuService arpuService;
	

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 15, 2020 - 10:21:04 PM
	 * @param model
	 * @return
	 */
	@GetMapping("/arpu")
	public ResponseEntity<List<ArpuDTO>> getAllArpu() {
        List<ArpuDTO> list = arpuService.findAll();
        return new ResponseEntity<List<ArpuDTO>>(list, HttpStatus.OK);
    }
	

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 29, 2020 - 2:09:26 AM
	 * @param id
	 * @return
	 */
    @GetMapping("/arpu/{id}")
    public ResponseEntity<ArpuDTO> getEmployeeById(@PathVariable("id") Long id){
    	ArpuDTO entity = arpuService.findOne(id);
        return new ResponseEntity<ArpuDTO>(entity, new HttpHeaders(), HttpStatus.OK);
    }
    
    @PostMapping("/arpu/{id}")
    public ResponseEntity<ArpuDTO> createOrUpdateEmployee(ArpuDTO employee){
    	ArpuDTO updated = arpuService.save(employee);
        return new ResponseEntity<ArpuDTO>(updated, new HttpHeaders(), HttpStatus.OK);
    }
}
