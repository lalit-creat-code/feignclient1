package com.lalit.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Component
public class Address {
/*	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)*/
	private Integer addId;
	private String city;
	private String state;
	//@ManyToOne(fetch=FetchType.LAZY)
//	@JoinColumn(name = "empId")
	//private Employee emp;
	
	
	public Integer getAddId() {
		return addId;
	}
	public void setAddId(Integer addId) {
		this.addId = addId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	}
	
	
	


