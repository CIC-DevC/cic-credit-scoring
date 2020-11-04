package com.cic.dto;

import java.io.Serializable;
import java.util.List;

import com.cic.domain.Loan;
import com.cic.domain.Recharge;
import com.cic.domain.ServiceUse;

public class MsisdnDTO implements Serializable{
	
	private static final long serialVersionUID = 5890899298648620024L;

	private String msisdn;

	private String phoneNum;
	
	private String cityId;
	
	private String areaId;
	
	private Integer birthyear;
	
	private String sex;
	
	private String COL17;
	
	private String COL18;
	
	private String COL19;
	
	private String COL20;
	
	private String COL21;
	
	private String COL22;
	
	private String COL27a;
	
	private String COL27b;
	
	private String COL27c;
	
	private String COL27d;
	
	private Integer label;
	
	private List<Loan> lstLoan;
	
	private List<Recharge> lstRecharge;
	
	private List<ServiceUse> lstServiceUse;

	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
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

	public List<Loan> getLstLoan() {
		return lstLoan;
	}

	public void setLstLoan(List<Loan> lstLoan) {
		this.lstLoan = lstLoan;
	}

	public List<Recharge> getLstRecharge() {
		return lstRecharge;
	}

	public void setLstRecharge(List<Recharge> lstRecharge) {
		this.lstRecharge = lstRecharge;
	}

	public List<ServiceUse> getLstServiceUse() {
		return lstServiceUse;
	}

	public void setLstServiceUse(List<ServiceUse> lstServiceUse) {
		this.lstServiceUse = lstServiceUse;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getLabel() {
		return label;
	}

	public void setLabel(Integer label) {
		this.label = label;
	}
}
