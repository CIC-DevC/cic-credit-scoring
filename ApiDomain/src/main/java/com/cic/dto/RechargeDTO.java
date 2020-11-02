package com.cic.dto;

import java.time.Instant;

public class RechargeDTO {
	private String msisdn;
	private Instant createdDate;
	private String cOrV;
	private Long feeCharge;
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
	public Long getFeeCharge() {
		return feeCharge;
	}
	public void setFeeCharge(Long feeCharge) {
		this.feeCharge = feeCharge;
	}
}
