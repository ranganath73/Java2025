package com.example.setter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private String name;
	private Integer id;
	
	private Address address;

	public String getName() {
		return name;
	}

	@Value("Ravi Verma")
	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	@Value("1")
	public void setId(Integer id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", address=" + address + "]";
	}
	
}
