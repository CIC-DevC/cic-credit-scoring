package com.cic.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cic.domain.Arpu;
import com.cic.domain.Loan;
import com.cic.domain.Recharge;
import com.cic.domain.ServiceUse;
import com.cic.dto.MsisdnDTO;
import com.cic.repository.ArpuRepository;
import com.cic.repository.LoanRepository;
import com.cic.repository.RechargeRepository;
import com.cic.repository.ServiceUseRepository;
import com.cic.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService {

	@Autowired
	LoanRepository loanRepository;
	@Autowired
	ArpuRepository arpuRepository;
	@Autowired
	RechargeRepository rechargeRepository;
	@Autowired
	ServiceUseRepository serviceUseRepository;

	@Override
	public MsisdnDTO findInfoOfMsisdnByPhoneNum(String phoneNum) {
		Arpu arpu = arpuRepository.findByPhoneNum(phoneNum);
		MsisdnDTO msisdn = parseArpuToMsisdn(arpu);
		
		List<Loan> lstLoan = loanRepository.findByPhoneNum(phoneNum);
		if(lstLoan != null && lstLoan.size() > 0) {
			msisdn.setLstLoan(lstLoan);
		}
		
		List<Recharge> lstRecharge = rechargeRepository.findByPhoneNum(phoneNum);
		if(lstRecharge != null && lstRecharge.size() > 0) {
			msisdn.setLstRecharge(lstRecharge);
		}
		
		List<ServiceUse> lstServiceUse = serviceUseRepository.findByPhoneNum(phoneNum);
		if(lstServiceUse != null && lstServiceUse.size() > 0) {
			msisdn.setLstServiceUse(lstServiceUse);
		}

		return msisdn;
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
