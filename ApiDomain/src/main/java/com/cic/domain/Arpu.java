package com.cic.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "arpu")
public class Arpu implements Serializable{
	
	private static final long serialVersionUID = 5890899298648620024L;

	@Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
	
	@Column(name = "msisdn")
	private String msisdn;
	
	@Column(name = "areaCode")
	private String areaCode;
	
	@Column(name = "areaPlaceCode")
	private String areaPlaceCode;
	
	@Column(name = "birthYear")
	private Integer birthYear;
	
	@Column(name = "sex")
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
