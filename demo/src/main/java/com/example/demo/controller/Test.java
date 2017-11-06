package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	
	@RequestMapping(value = "/getdata", method = RequestMethod.GET, produces = "application/json")
	public String getdata(){
		
		System.out.println("Hello India");
		return "Hello India";
	}
}
