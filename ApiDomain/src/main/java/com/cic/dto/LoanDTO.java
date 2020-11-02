package com.cic.dto;

import java.time.Instant;

public class LoanDTO {
	private String msisdn;
	private Integer loanType;
	private Long amount;
	private Instant createdDate;
	private Instant modifiedDate;
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public Integer getLoanType() {
		return loanType;
	}
	public void setLoanType(Integer loanType) {
		this.loanType = loanType;
	}
	public Long getAmount() {
		return amount;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}
	public Instant getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}
	public Instant getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
