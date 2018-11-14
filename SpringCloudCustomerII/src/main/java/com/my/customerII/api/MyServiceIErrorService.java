package com.my.customerII.api;

import org.springframework.stereotype.Component;

@Component
public class MyServiceIErrorService implements MyServiceIService{
	public String getInfo() {
		return "The Service is down!";
	}
}
