package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IoCMain {

	public static void main(String[] args) {
		// Normal order of a class execution
//		Employee employee = new Employee();
//		
//		employee.setName("Raja");
//		employee.setEmployeeId(1);
//		employee.setSalary(100000);
//		
//		System.out.println(employee.getName());
//		System.out.println(employee.getEmployeeId());
//		System.out.println(employee.getSalary());
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.example.ioc");
		Employee employee = context.getBean("employee", Employee.class);
		System.out.println(employee.getName());
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getSalary());
	}

}
