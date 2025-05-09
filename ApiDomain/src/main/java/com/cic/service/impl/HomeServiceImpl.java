package com.cic.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.domain.Arpu;
import com.cic.domain.Loan;
import com.cic.domain.Recharge;
import com.cic.domain.ServiceUse;
import com.cic.dto.CallDTO;
import com.cic.dto.InternetDTO;
import com.cic.dto.MsisdnDTO;
import com.cic.repository.HomeRepository;
import com.cic.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	HomeRepository homeRepository;

	@Override
	public MsisdnDTO findInfoOfMsisdnByPhoneNum(String phoneNum) {
		Arpu arpu = homeRepository.findArpuByPhoneNum(phoneNum);
		MsisdnDTO msisdn = parseArpuToMsisdn(arpu);
		msisdn.setScore(homeRepository.findScoreByPhoneNum(phoneNum));
		
		List<Loan> lstLoan = homeRepository.findLoanByPhoneNum(phoneNum);
		if(lstLoan != null && lstLoan.size() > 0) {
			msisdn.setLstLoan(lstLoan);
		}
		
		List<Recharge> lstRecharge = homeRepository.findRechargeByPhoneNum(phoneNum);
		if(lstRecharge != null && lstRecharge.size() > 0) {
			msisdn.setLstRecharge(lstRecharge);
		}
		
		List<ServiceUse> lstServiceUse = homeRepository.findServiceByPhoneNum(phoneNum);
		if(lstServiceUse != null && lstServiceUse.size() > 0) {
			msisdn.setLstServiceUse(lstServiceUse);
		}
		
		List<CallDTO> lstCall = new ArrayList<>();
		List<InternetDTO> lstInternet = new ArrayList<>();
		
		for (ServiceUse serviceUse : lstServiceUse) {
			if( serviceUse.getServiceType() != 7) {
				CallDTO call = new CallDTO();
				call.setMsisdn(serviceUse.getMsisdn());
				call.setPartnerMsisdn(serviceUse.getPartnerMsisdn());
				call.setSecondPerCall(serviceUse.getSecondPerCall());
				call.setServiceId(serviceUse.getServiceId());
				call.setServiceType(serviceUse.getServiceType());
				call.setCreatedDate(serviceUse.getCreatedDate());
				call.setPhoneNum(phoneNum);
				call.setPartnerPhoneNum(homeRepository.findPhoneNumByMsisdn(serviceUse.getPartnerMsisdn()));
				lstCall.add(call);
			} else {
				InternetDTO internet = new InternetDTO();
				internet.setMsisdn(serviceUse.getMsisdn());
				internet.setServiceId(serviceUse.getServiceId());
				internet.setCreatedDate(serviceUse.getCreatedDate());
				internet.setUsedData(serviceUse.getUsedData());
				internet.setUploadData(serviceUse.getUploadData());
				lstInternet.add(internet);
			}
		}
		msisdn.setLstCall(lstCall);
		msisdn.setLstInternet(lstInternet);
		msisdn.setScoreHistoryLst(homeRepository.findScoreHistoryByPhoneNum(phoneNum));
		msisdn.setSumLoan(homeRepository.findSumLoan(phoneNum));
		msisdn.setMaxLoan(homeRepository.findMaxLoan(phoneNum));
		msisdn.setMinLoan(homeRepository.findMinLoan(phoneNum));
		msisdn.setNumLoan(homeRepository.findMaxLoan(phoneNum));
		msisdn.setNumLoanLate(homeRepository.findNumLoanLate(phoneNum));
		
		msisdn.setSumRecharge(homeRepository.findSumRecharge(phoneNum));
		msisdn.setMaxRecharge(homeRepository.findMaxRecharge(phoneNum));
		msisdn.setMinRecharge(homeRepository.findMinRecharge(phoneNum));
		msisdn.setNumRecharge(homeRepository.findMaxRecharge(phoneNum));
		msisdn.setNumVRecharge(homeRepository.findNumVRecharge(phoneNum));
		msisdn.setNumCRecharge(homeRepository.findNumCRecharge(phoneNum));

		Long numCall = homeRepository.findNumCall(phoneNum);
		Long totalCallTime = homeRepository.findTotalCallTime(phoneNum);
		msisdn.setNumCall(numCall);
		msisdn.setTotalCallTime(totalCallTime);
		msisdn.setAvgCallTime(numCall/totalCallTime);
//		msisdn.setTotalParnerCall(homeRepository.findTotalParnerCall(phoneNum));
		msisdn.setNumUsedInternet(homeRepository.findNumUsedInternet(phoneNum));
		msisdn.setNumUploadedInternet(homeRepository.findNumUploadedInternet(phoneNum));
		return msisdn;
	}

	@Override
	public List<MsisdnDTO> findArpuByKeyword(String keyword) {
		List<Arpu> arpus = homeRepository.findArpuByKeyword(keyword);
		List<MsisdnDTO> lstMsisdn = new ArrayList<>();
		for(Arpu arpu : arpus) {
			MsisdnDTO msisdn = parseArpuToMsisdn(arpu);
			msisdn.setScore(homeRepository.findScoreByPhoneNum(msisdn.getPhoneNum()));
			lstMsisdn.add(msisdn);
		}
		return lstMsisdn;
	}
	
	/**
	 * 
	 * @author ntmduyen
	 * @datetime Nov 5, 2020 - 2:01:08 AM
	 * @param arpu
	 * @return
	 */
	private MsisdnDTO parseArpuToMsisdn(Arpu arpu) {
		MsisdnDTO msisdn = new MsisdnDTO();
		if (arpu.getMsisdn() != null) {
			msisdn.setMsisdn(arpu.getMsisdn());
		}

		if (arpu.getCityId() != null) {
			msisdn.setCityId(arpu.getCityId());
		}
		
		if (arpu.getAreaId() != null) {
			msisdn.setAreaId(arpu.getAreaId());
		}
		
		if (arpu.getBirthyear() != null) {
			msisdn.setBirthyear(arpu.getBirthyear());
		}
		
		if(arpu.getSex() != null) {
			msisdn.setSex(arpu.getSex());
		}
		
		if(arpu.getCOL17() != null) {
			msisdn.setCOL17(arpu.getCOL17());
		}
		
		if(arpu.getCOL18() != null) {
			msisdn.setCOL18(arpu.getCOL18());
		}
		
		if(arpu.getCOL19() != null) {
			msisdn.setCOL19(arpu.getCOL19());
		}
		
		if(arpu.getCOL20() != null) {
			msisdn.setCOL20(arpu.getCOL17());
		}
		
		if(arpu.getCOL21() != null) {
			msisdn.setCOL21(arpu.getCOL21());
		}
		
		if(arpu.getCOL22() != null) {
			msisdn.setCOL22(arpu.getCOL22());
		}
		
		if(arpu.getCOL27a() != null) {
			msisdn.setCOL27a(arpu.getCOL27a());
		}
		
		if(arpu.getCOL27b() != null) {
			msisdn.setCOL27b(arpu.getCOL27b());
		}

		if(arpu.getCOL27c() != null) {
			msisdn.setCOL27c(arpu.getCOL27c());
		}
		
		if(arpu.getCOL27d() != null) {
			msisdn.setCOL27d(arpu.getCOL27d());
		}
		
		if(arpu.getLabel() != null) {
			msisdn.setLabel(arpu.getLabel());
		}
		
		if(arpu.getPhoneNum() != null) {
			msisdn.setPhoneNum(arpu.getPhoneNum());
		}

		return msisdn;
	}

	

}
