package com.cic.controller;

import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cic.domain.ServiceUse;
import com.cic.service.ServiceUseService;

@CrossOrigin(origins = "http://polar-hamlet-55744.herokuapp.com")
@RestController
@RequestMapping("/api")
public class ServiceUseController {

	ServiceUseService serviceUseService;
	
	public ServiceUseController(ServiceUseService serviceUseService) {
		this.serviceUseService = serviceUseService;
	}

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 15, 2020 - 10:21:04 PM
	 * @param model
	 * @return
	 */
	@GetMapping("/service-use")
	public ResponseEntity<List<ServiceUse>> getAllArpu() {
        List<ServiceUse> list = serviceUseService.findAll();
        return new ResponseEntity<List<ServiceUse>>(list, HttpStatus.OK);
    }
	
	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 29, 2020 - 2:09:26 AM
	 * @param id
	 * @return
	 */
    @GetMapping("/service-use/{phoneNum}")
    public ResponseEntity<List<ServiceUse>> getServiceUseByPhoneNum(@PathVariable("phoneNum") String phoneNum){
    	List<ServiceUse> list = serviceUseService.findByPhoneNum(phoneNum);
        return new ResponseEntity<List<ServiceUse>>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
