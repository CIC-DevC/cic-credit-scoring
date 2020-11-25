package com.cic.service;

import com.cic.domain.Mobile;
import com.cic.dto.MobileHistoryDTO;

public interface MobileService {
	
	public Mobile check(String phoneNum);
	
	public MobileHistoryDTO checkHistory(String phoneNum);
}
