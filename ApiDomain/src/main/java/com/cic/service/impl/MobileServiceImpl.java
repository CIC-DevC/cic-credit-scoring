package com.cic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.domain.Mobile;
import com.cic.domain.Submission;
import com.cic.dto.MobileHistoryDTO;
import com.cic.repository.MobileRepository;
import com.cic.service.MobileService;


@Service
public class MobileServiceImpl implements MobileService{
	@Autowired
	MobileRepository mobileRepository;
	
	public MobileServiceImpl(MobileRepository mobileRepository){
		this.mobileRepository = mobileRepository;
	}
	
	@Override
	public Mobile check(String phoneNum) {
		Mobile score = mobileRepository.check(phoneNum);
		return score;
	}

	@Override
	public MobileHistoryDTO checkHistory(String phoneNum) {
		MobileHistoryDTO scoreHistory = new MobileHistoryDTO();
		List<Submission> lstSubmission = mobileRepository.checkHistory(phoneNum);
		scoreHistory.setPhoneNum(phoneNum);
		scoreHistory.setScore(lstSubmission);
		return scoreHistory;
	}
	

}
