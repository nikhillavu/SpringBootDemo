package com.example.demo.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.eneity.Student;

@RestController
public class DemoCoontoller {
	
	@PostMapping("/create")
	public Student get(@RequestBody Student s) {
		
		System.err.println("hiiii");
		return s;
	}
	@PostMapping("/dep")
	public Student sample(@RequestBody Student s)
	{
		return s;
	}

}
