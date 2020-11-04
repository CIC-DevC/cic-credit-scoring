package com.cic.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "submission")
public class Mobile implements Serializable {

	private static final long serialVersionUID = 5890899298648620024L;

	@Id
	@Column(name = "msisdn")
	private String msisdn;
	
	@Column(name = "score")
	private Double score;
	
	public String getMsisdn() {
		return msisdn;
	}

	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
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
