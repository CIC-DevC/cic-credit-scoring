package com.cic.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "arpu")
@Getter
@Setter
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

}
