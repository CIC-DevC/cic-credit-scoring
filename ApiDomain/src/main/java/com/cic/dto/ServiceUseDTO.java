package com.cic.dto;

import java.time.Instant;

public class ServiceUseDTO {
	private Long id;

	private String msisdn;
	
	private Long serviceId;
	
	private Integer secondPerCall;
	
	private Long usedData;
	
	private String partnerMsisdn;
	
	private Instant createdDate;
	
	private Long uploadData;
	
	private Integer serviceType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public Long getUsedData() {
		return usedData;
	}

	public void setUsedData(Long usedData) {
		this.usedData = usedData;
	}

	public String getPartnerMsisdn() {
		return partnerMsisdn;
	}

	public void setPartnerMsisdn(String partnerMsisdn) {
		this.partnerMsisdn = partnerMsisdn;
	}

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public Long getUploadData() {
		return uploadData;
	}

	public void setUploadData(Long uploadData) {
		this.uploadData = uploadData;
	}

	public Integer getServiceType() {
		return serviceType;
	}

	public void setServiceType(Integer serviceType) {
		this.serviceType = serviceType;
	}
}
