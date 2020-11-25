package com.cic.dto;

import java.io.Serializable;
import java.util.List;

import com.cic.domain.Loan;
import com.cic.domain.Recharge;
import com.cic.domain.ServiceUse;
import com.cic.domain.Submission;

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
	
	private Double score;
	
	private List<Submission> scoreHistoryLst;
	
	private List<CallDTO> lstCall;
	private List<InternetDTO> lstInternet;
	
	private Long sumLoan;
	private Long debit;
	private Long maxLoan;
	private Long minLoan;
	private Long numLoan;
	private Long numLoanLate;

	private Long sumRecharge;
	private Long maxRecharge;
	private Long minRecharge;
	private Long numRecharge;
	private Long numVRecharge;
	private Long numCRecharge;

	private Long numCall;
	private Long totalCallTime;
	private Long avgCallTime;
	private Long totalParnerCall;
	
	private Long numUsedInternet;
	private Long numUploadedInternet;
	private Long totalParnerInternet;
	private Double avgScoreOfPartner;
	
	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

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

	public List<Submission> getScoreHistoryLst() {
		return scoreHistoryLst;
	}

	public void setScoreHistoryLst(List<Submission> scoreHistoryLst) {
		this.scoreHistoryLst = scoreHistoryLst;
	}

	public Long getSumLoan() {
		return sumLoan;
	}

	public void setSumLoan(Long sumLoan) {
		this.sumLoan = sumLoan;
	}

	public Long getDebit() {
		return debit;
	}

	public void setDebit(Long debit) {
		this.debit = debit;
	}

	public Long getMaxLoan() {
		return maxLoan;
	}

	public void setMaxLoan(Long maxLoan) {
		this.maxLoan = maxLoan;
	}

	public Long getMinLoan() {
		return minLoan;
	}

	public void setMinLoan(Long minLoan) {
		this.minLoan = minLoan;
	}

	public Long getNumLoan() {
		return numLoan;
	}

	public void setNumLoan(Long numLoan) {
		this.numLoan = numLoan;
	}

	public Long getNumLoanLate() {
		return numLoanLate;
	}

	public void setNumLoanLate(Long long1) {
		this.numLoanLate = long1;
	}

	public Long getSumRecharge() {
		return sumRecharge;
	}

	public void setSumRecharge(Long sumRecharge) {
		this.sumRecharge = sumRecharge;
	}

	public Long getMaxRecharge() {
		return maxRecharge;
	}

	public void setMaxRecharge(Long maxRecharge) {
		this.maxRecharge = maxRecharge;
	}

	public Long getMinRecharge() {
		return minRecharge;
	}

	public void setMinRecharge(Long minRecharge) {
		this.minRecharge = minRecharge;
	}

	public Long getNumRecharge() {
		return numRecharge;
	}

	public void setNumRecharge(Long numRecharge) {
		this.numRecharge = numRecharge;
	}

	public Long getNumVRecharge() {
		return numVRecharge;
	}

	public void setNumVRecharge(Long numVRecharge) {
		this.numVRecharge = numVRecharge;
	}

	public Long getNumCRecharge() {
		return numCRecharge;
	}

	public void setNumCRecharge(Long numCRecharge) {
		this.numCRecharge = numCRecharge;
	}

	public List<CallDTO> getLstCall() {
		return lstCall;
	}

	public void setLstCall(List<CallDTO> lstCall) {
		this.lstCall = lstCall;
	}

	public List<InternetDTO> getLstInternet() {
		return lstInternet;
	}

	public void setLstInternet(List<InternetDTO> lstInternet) {
		this.lstInternet = lstInternet;
	}

	public Long getNumCall() {
		return numCall;
	}

	public void setNumCall(Long numCall) {
		this.numCall = numCall;
	}

	public Long getTotalCallTime() {
		return totalCallTime;
	}

	public void setTotalCallTime(Long totalCallTime) {
		this.totalCallTime = totalCallTime;
	}

	public Long getAvgCallTime() {
		return avgCallTime;
	}

	public void setAvgCallTime(Long avgCallTime) {
		this.avgCallTime = avgCallTime;
	}

	public Long getTotalParnerCall() {
		return totalParnerCall;
	}

	public void setTotalParnerCall(Long totalParnerCall) {
		this.totalParnerCall = totalParnerCall;
	}

	public Long getNumUsedInternet() {
		return numUsedInternet;
	}

	public void setNumUsedInternet(Long numUsedInternet) {
		this.numUsedInternet = numUsedInternet;
	}

	public Long getNumUploadedInternet() {
		return numUploadedInternet;
	}

	public void setNumUploadedInternet(Long numUploadedInternet) {
		this.numUploadedInternet = numUploadedInternet;
	}

	public Long getTotalParnerInternet() {
		return totalParnerInternet;
	}

	public void setTotalParnerInternet(Long totalParnerInternet) {
		this.totalParnerInternet = totalParnerInternet;
	}

	public Double getAvgScoreOfPartner() {
		return avgScoreOfPartner;
	}

	public void setAvgScoreOfPartner(Double avgScoreOfPartner) {
		this.avgScoreOfPartner = avgScoreOfPartner;
	}
}
