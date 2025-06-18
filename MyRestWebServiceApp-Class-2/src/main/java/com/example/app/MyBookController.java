package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class MyBookController {

	@GetMapping("/getbook/{id}")
	public String getBook(@PathVariable String id) {
		
		return "Book id is : " + id;
	}
}
