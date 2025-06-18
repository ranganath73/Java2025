package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired   // Dependency Injection
	private Engine engine;
	
	@Autowired
	private Gear gear;
	
	@Autowired
	private Gps gps;
	
	public void start() {
		engine.start();
		gear.change();
		System.out.println("Car is running...");
		gps.switchOn();
	}

}
