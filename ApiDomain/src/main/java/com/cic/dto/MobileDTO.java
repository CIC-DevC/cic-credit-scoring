package com.cic.dto;

import java.io.Serializable;

public class MobileDTO implements Serializable {

	private static final long serialVersionUID = 5890899298648620024L;

	private String phoneNum;

	private Double score;

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
