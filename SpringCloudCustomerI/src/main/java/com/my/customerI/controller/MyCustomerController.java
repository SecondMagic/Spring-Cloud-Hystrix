package com.my.customerI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller
@RequestMapping(value="/CApi")
public class MyCustomerController {
	@Autowired
	private RestTemplate restTemplate;
	
	@ResponseBody
	@RequestMapping(value="/CgetInfo")
	public String getCINfo() {
		return getServiceI()+"\n"+getServiceII();
	}
	
	@ResponseBody
	@RequestMapping(value="/CgetServiceIData")
	@HystrixCommand(fallbackMethod = "fallbackInfo")
	public String getServiceIData() {
		return getServiceI();
	}
	
	String fallbackInfo() {
		return "The service is down!";
	}
	
	private String getServiceI() {
        String info = restTemplate.getForObject("http://myServiceI/myServiceI/Api/getInfo", String.class);
        return info;
    }
	
	private String getServiceII() {
        String info = restTemplate.getForObject("http://myServiceII/myServiceII/Api/getInfo", String.class);
        return info;
    }
}
