package com.cic.service;

import java.util.List;

import com.cic.dto.MsisdnDTO;

public interface HomeService {
	
	MsisdnDTO findInfoOfMsisdnByPhoneNum(String phoneNum);
	
	List<MsisdnDTO> findArpuByKeyword(String keyword);
	
}
