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
	
	@Column(name = "phone_num")
	private String phoneNum;

	@Column(name = "msisdn")
	private String msisdn;
	
	@Column(name = "city_id")
	private String cityId;
	
	@Column(name = "area_id")
	private String areaId;
	
	@Column(name = "birthyear")
	private Integer birthyear;
	
	@Column(name = "sex")
	private String sex;
	
	@Column(name = "COL_17")
	private String COL17;
	
	@Column(name = "COL_18")
	private String COL18;
	
	@Column(name = "COL_19")
	private String COL19;
	
	@Column(name = "COL_20")
	private String COL20;
	
	@Column(name = "COL_21")
	private String COL21;
	
	@Column(name = "COL_22")
	private String COL22;
	
	@Column(name = "COL_27a")
	private String COL27a;
	
	@Column(name = "COL_27b")
	private String COL27b;
	
	@Column(name = "COL_27c")
	private String COL27c;
	
	@Column(name = "COL_27d")
	private String COL27d;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getCityId() {
		return cityId;
	}

	public void setCityId(String cityId) {
		this.cityId = cityId;
	}

	public String getAreaId() {
		return areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
	}

	public Integer getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(Integer birthyear) {
		this.birthyear = birthyear;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getCOL17() {
		return COL17;
	}

	public void setCOL17(String cOL17) {
		COL17 = cOL17;
	}

	public String getCOL18() {
		return COL18;
	}

	public void setCOL18(String cOL18) {
		COL18 = cOL18;
	}

	public String getCOL19() {
		return COL19;
	}

	public void setCOL19(String cOL19) {
		COL19 = cOL19;
	}

	public String getCOL20() {
		return COL20;
	}

	public void setCOL20(String cOL20) {
		COL20 = cOL20;
	}

	public String getCOL21() {
		return COL21;
	}

	public void setCOL21(String cOL21) {
		COL21 = cOL21;
	}

	public String getCOL22() {
		return COL22;
	}

	public void setCOL22(String cOL22) {
		COL22 = cOL22;
	}

	public String getCOL27a() {
		return COL27a;
	}

	public void setCOL27a(String cOL27a) {
		COL27a = cOL27a;
	}

	public String getCOL27b() {
		return COL27b;
	}

	public void setCOL27b(String cOL27b) {
		COL27b = cOL27b;
	}

	public String getCOL27c() {
		return COL27c;
	}

	public void setCOL27c(String cOL27c) {
		COL27c = cOL27c;
	}

	public String getCOL27d() {
		return COL27d;
	}

	public void setCOL27d(String cOL27d) {
		COL27d = cOL27d;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
}
