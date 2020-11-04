package com.cic.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "recharge")
public class Recharge implements Serializable {

	private static final long serialVersionUID = 5890899298648620024L;

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "msisdn")
	private String msisdn;
	
	@Column(name = "created_date")
	private Instant createdDate;
	
	@Column(name = "c_or_v")
	private String cOrV;
	
	@Column(name = "fee_charge")
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
