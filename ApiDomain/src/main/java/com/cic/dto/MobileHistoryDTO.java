package com.cic.dto;

import java.util.List;

import com.cic.domain.Submission;

public class MobileHistoryDTO {
	private static final long serialVersionUID = 5890899298648620024L;

	private String phoneNum;

	private List<Submission> score;

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public List<Submission> getScore() {
		return score;
	}

	public void setScore(List<Submission> score) {
		this.score = score;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
