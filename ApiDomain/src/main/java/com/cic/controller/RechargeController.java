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

import com.cic.domain.Recharge;
import com.cic.service.RechargeService;

@CrossOrigin(origins = "http://polar-hamlet-55744.herokuapp.com")
@RestController
@RequestMapping("/api")
public class RechargeController {

	RechargeService rechargeService;
	
	public RechargeController(RechargeService rechargeService) {
		this.rechargeService = rechargeService;
	}

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 15, 2020 - 10:21:04 PM
	 * @param model
	 * @return
	 */
	@GetMapping("/recharge")
	public ResponseEntity<List<Recharge>> getAllArpu() {
        List<Recharge> list = rechargeService.findAll();
        return new ResponseEntity<List<Recharge>>(list, HttpStatus.OK);
    }
	
	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 29, 2020 - 2:09:26 AM
	 * @param id
	 * @return
	 */
    @GetMapping("/recharge/{phoneNum}")
    public ResponseEntity<List<Recharge>> getRechargeByPhoneNum(@PathVariable("phoneNum") String phoneNum){
    	List<Recharge> list = rechargeService.findByPhoneNum(phoneNum);
        return new ResponseEntity<List<Recharge>>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
