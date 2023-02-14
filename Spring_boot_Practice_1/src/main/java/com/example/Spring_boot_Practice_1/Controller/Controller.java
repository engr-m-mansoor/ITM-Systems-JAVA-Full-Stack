package com.example.Spring_boot_Practice_1.Controller;

import com.example.Spring_boot_Practice_1.Service.ServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@Autowired
	ServiceInterface obj1;
	@GetMapping(path="/message")
	public String getMessage() {
		return obj1.getMessage();
	}
	@GetMapping(path="/feedback")
	public String getFeedback() {
		return obj1.getFeedback();
	}

}
