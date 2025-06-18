package com.example.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private String name;
	private Integer employeeId;
	private double salary;
	public String getName() {
		return name;
	}
	
	@Value("Ram Kumar")
	public void setName(String name) {
		this.name = name;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	@Value("2")
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	
	@Value("200000")
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
