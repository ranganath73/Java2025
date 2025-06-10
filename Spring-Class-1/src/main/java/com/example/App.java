package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		
//		Car car = new Car();
//		car.start();
		
		ApplicationContext context = new AnnotationConfigApplicationContext("com.example");
		Car car = context.getBean("car", Car.class);
		car.start();
	}

}
