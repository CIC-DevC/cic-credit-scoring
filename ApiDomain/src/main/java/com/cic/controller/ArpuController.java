package com.cic.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cic.domain.Arpu;
import com.cic.service.ArpuService;


@RestController
@RequestMapping("/api")
public class ArpuController {

	ArpuService arpuService;
	
	public ArpuController(ArpuService arpuService) {
		this.arpuService = arpuService;
	}

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 15, 2020 - 10:21:04 PM
	 * @param model
	 * @return
	 */
	@GetMapping("/arpu")
	public ResponseEntity<List<Arpu>> getAllArpu() {
        List<Arpu> list = arpuService.findAll();
        return new ResponseEntity<List<Arpu>>(list, HttpStatus.OK);
    }
	
	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 29, 2020 - 2:09:26 AM
	 * @param id
	 * @return
	 */
    @GetMapping("/arpu/{phoneNum}")
    public ResponseEntity<Arpu> getArpuByPhoneNum(@PathVariable("phoneNum") String phoneNum){
    	Arpu entity = arpuService.findByPhoneNum(phoneNum);
        return new ResponseEntity<Arpu>(entity, new HttpHeaders(), HttpStatus.OK);
    }
}
