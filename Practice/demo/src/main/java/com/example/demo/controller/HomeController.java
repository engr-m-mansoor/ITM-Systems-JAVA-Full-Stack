package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.implementation.HomeService;

@RestController
public class HomeController {
	
	@Autowired
	HomeService homeservice;
	@GetMapping(path="/message")
	public String getMessage() {
		return homeservice.getMessage();
	}
	@GetMapping(path="/feedback")
	public String getFeedback() {
		return "Feedback";
	}

}
