package com.cic.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "service_use")
public class ServiceUse implements Serializable {

	private static final long serialVersionUID = 5890899298648620024L;

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;

	@Column(name = "msisdn")
	private String msisdn;
	
	@Column(name = "service_id")
	private Long serviceId;
	
	@Column(name = "second_per_call")
	private Integer secondPerCall;
	
	@Column(name = "used_data")
	private Long usedData;
	
	@Column(name = "partner_msisdn")
	private String partnerMsisdn;
	
	@Column(name = "created_date")
	private Instant createdDate;
	
	@Column(name = "upload_data")
	private Long uploadData;
	
	@Column(name = "service_type")
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
