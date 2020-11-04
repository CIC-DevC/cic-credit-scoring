package com.cic.service;

import com.cic.dto.MsisdnDTO;

public interface HomeService {
	
	MsisdnDTO findInfoOfMsisdnByPhoneNum(String phoneNum);
	
}
