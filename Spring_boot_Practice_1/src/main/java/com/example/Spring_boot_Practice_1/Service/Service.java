package com.example.Spring_boot_Practice_1.Service;

@org.springframework.stereotype.Service
public class Service implements ServiceInterface{
	@Override
	public String getMessage() {
		return "Hi Mansoor, Welcome  to Message";
	}
	@Override
	public String getFeedback() {
		return "Hi Mansoor, welcome to feedback";
	}

}
