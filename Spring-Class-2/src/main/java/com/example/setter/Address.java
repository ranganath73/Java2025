package com.example.setter;

import org.springframework.beans.factory.annotation.Value;

public class Address {
	
	private String info;
	private String city;
	private String state;
	public String getInfo() {
		return info;
	}
	
	@Value("21, Thambu chetty st")
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCity() {
		return city;
	}
	
	@Value("Chennai")
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	
	@Value("Tamil Nadu")
	public void setState(String state) {
		this.state = state;
	}
	
	

}
