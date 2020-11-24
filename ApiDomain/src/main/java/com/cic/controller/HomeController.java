package com.cic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cic.dto.MsisdnDTO;
import com.cic.service.HomeService;

@CrossOrigin(origins = {"http://localhost:8181", "http://localhost:6868"}, allowCredentials = "true")
@RestController
@RequestMapping
public class HomeController {
	
	HomeService homeService;
	
	public HomeController(HomeService homeService) {
		this.homeService = homeService;
	}

	
	@GetMapping(value= {"api/search/{phoneNum}"})
	public ResponseEntity<MsisdnDTO> getAllArpu(@PathVariable("phoneNum") String phoneNum) {
		MsisdnDTO msisdnDTO = homeService.findInfoOfMsisdnByPhoneNum(phoneNum);
        return new ResponseEntity<MsisdnDTO>(msisdnDTO, HttpStatus.OK);
    }
}
