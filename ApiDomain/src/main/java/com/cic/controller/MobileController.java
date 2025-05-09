package com.cic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cic.domain.Mobile;
import com.cic.dto.MobileDTO;
import com.cic.dto.MobileHistoryDTO;
import com.cic.service.MobileService;

@CrossOrigin(origins = {"http://localhost:8181", "http://localhost:6868"}, allowCredentials = "true")
@RestController
@RequestMapping
public class MobileController {
	
	MobileService mobileService;
	
	public MobileController(MobileService mobileService) {
		this.mobileService = mobileService;
	}

	
	@GetMapping(value= {"/check/{phoneNum}"})
	public ResponseEntity<MobileDTO> check(@PathVariable("phoneNum") String phoneNum) {
		Mobile mobileCheck = mobileService.check(phoneNum);
		MobileDTO dto = new MobileDTO();
		dto.setPhoneNum(phoneNum);
		dto.setScore(mobileCheck.getScore());
        return new ResponseEntity<MobileDTO>(dto, HttpStatus.OK);
    }
	
	@GetMapping(value= {"/check-history/{phoneNum}"})
	public ResponseEntity<MobileHistoryDTO> checkHistory(@PathVariable("phoneNum") String phoneNum) {
		MobileHistoryDTO mobileCheck = mobileService.checkHistory(phoneNum);
        return new ResponseEntity<MobileHistoryDTO>(mobileCheck, HttpStatus.OK);
    }
}
