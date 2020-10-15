package com.cic.dto;

public class ArpuDTO {

    private Long id;
	
	private String msisdn;
	
	private String areaCode;
	
	private String areaPlaceCode;
	
	private Integer birthYear;
	
	private String sex;

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

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAreaPlaceCode() {
		return areaPlaceCode;
	}

	public void setAreaPlaceCode(String areaPlaceCode) {
		this.areaPlaceCode = areaPlaceCode;
	}

	public Integer getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
