package com.cic.dto;

import java.time.Instant;

public class CallDTO {

	private String msisdn;
	
	private String phoneNum;
	private String partnerPhoneNum;
	private Long serviceId;
	
	private Integer secondPerCall;
	
	private String partnerMsisdn;
	
	
	
	private String createdDate;
	
	private Integer serviceType;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public Long getServiceId() {
		return serviceId;
	}

	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}

	public Integer getSecondPerCall() {
		return secondPerCall;
	}

	public void setSecondPerCall(Integer secondPerCall) {
		this.secondPerCall = secondPerCall;
	}

	public String getPartnerMsisdn() {
		return partnerMsisdn;
	}

	public void setPartnerMsisdn(String partnerMsisdn) {
		this.partnerMsisdn = partnerMsisdn;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPartnerPhoneNum() {
		return partnerPhoneNum;
	}

	public void setPartnerPhoneNum(String partnerPhoneNum) {
		this.partnerPhoneNum = partnerPhoneNum;
	}
}
