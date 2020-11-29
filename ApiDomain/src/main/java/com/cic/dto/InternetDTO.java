package com.cic.dto;

import java.time.Instant;

public class InternetDTO {
	
	private String msisdn;
	
	private Long serviceId;
	
	private Long usedData;
	
	private String createdDate;
	
	private Long uploadData;

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

	public Long getUsedData() {
		return usedData;
	}

	public void setUsedData(Long usedData) {
		this.usedData = usedData;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public Long getUploadData() {
		return uploadData;
	}

	public void setUploadData(Long uploadData) {
		this.uploadData = uploadData;
	}
	
}
