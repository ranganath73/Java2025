package com.example.app;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class MyRestController {

	@GetMapping("/hello")
	public String sayHello() {
		
		return "Hello...";
	}
	
	@PostMapping("/hellopost")
	public String sayHelloPost() {
		
		return "Hello from Post";
	}
	
	@PutMapping("/helloput")
	public String sayHelloPut() {
		
		return "Hello from Put";
	}
	
	@PatchMapping("/hellopatch")
	public String sayHelloPatch() {
		
		return "Hello from Patch";
	}
	
	@DeleteMapping("/hellodelete")
	public String sayHelloDelete() {
		
		return "Hello from Delete";
	}
	
}
