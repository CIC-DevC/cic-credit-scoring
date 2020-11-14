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

import com.cic.domain.Loan;
import com.cic.service.LoanService;

@CrossOrigin(origins = "http://polar-hamlet-55744.herokuapp.com")
@RestController
@RequestMapping("/api")
public class LoanController {

	LoanService loanService;
	
	public LoanController(LoanService loanService) {
		this.loanService = loanService;
	}

	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 15, 2020 - 10:21:04 PM
	 * @param model
	 * @return
	 */
	@GetMapping("/loan")
	public ResponseEntity<List<Loan>> getAllArpu() {
        List<Loan> list = loanService.findAll();
        return new ResponseEntity<List<Loan>>(list, HttpStatus.OK);
    }
	
	/**
	 * 
	 * @author ntmduyen
	 * @datetime Oct 29, 2020 - 2:09:26 AM
	 * @param id
	 * @return
	 */
    @GetMapping("/loan/{phoneNum}")
    public ResponseEntity<List<Loan>> getLoanByPhoneNum(@PathVariable("phoneNum") String phoneNum){
    	List<Loan> list = loanService.findByPhoneNum(phoneNum);
        return new ResponseEntity<List<Loan>>(list, new HttpHeaders(), HttpStatus.OK);
    }
}
