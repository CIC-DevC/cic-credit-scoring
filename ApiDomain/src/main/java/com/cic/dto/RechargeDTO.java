package com.cic.dto;

import java.time.Instant;

public class RechargeDTO {
	private Long id;

	private String msisdn;
	
	private Instant createdDate;
	
	private String cOrV;
	
	private Integer feeCharge;

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

	public Instant getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}

	public String getcOrV() {
		return cOrV;
	}

	public void setcOrV(String cOrV) {
		this.cOrV = cOrV;
	}

	public Integer getFeeCharge() {
		return feeCharge;
	}

	public void setFeeCharge(Integer feeCharge) {
		this.feeCharge = feeCharge;
	}
}
