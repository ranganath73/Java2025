package com.example.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
			ApplicationContext context = new AnnotationConfigApplicationContext("com.example.setter");
			Student student = context.getBean("student", Student.class);
			System.out.println("student = " + student);
	}

}
