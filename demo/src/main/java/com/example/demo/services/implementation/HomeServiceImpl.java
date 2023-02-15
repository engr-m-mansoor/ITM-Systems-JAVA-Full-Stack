package com.example.demo.services.implementation;

import org.springframework.stereotype.Service;

@Service
public class HomeServiceImpl implements HomeService {
	
	@Override
	public String getMessage() {
		return "Welcome Service";
	}

}
