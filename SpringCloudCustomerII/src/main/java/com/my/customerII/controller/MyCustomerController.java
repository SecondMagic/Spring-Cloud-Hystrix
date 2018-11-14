package com.my.customerII.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.my.customerII.api.MyServiceIIService;
import com.my.customerII.api.MyServiceIService;

@Controller
@RequestMapping(value="/CApi")
public class MyCustomerController {
	
	@Autowired
	private MyServiceIService myServiceIService;
	@Autowired
	private MyServiceIIService myServiceIIService;
	
	@ResponseBody
	@RequestMapping(value="/CgetInfo")
	public String getInfo(@RequestParam String name) {
		String result="";
		
		result+=name+" | "+myServiceIService.getInfo()+" | "+myServiceIIService.getInfo();
		
		return result;
	}
	
	@ResponseBody
	@RequestMapping(value="/getServiceIData")
	public String getServiceIData(@RequestParam String name) {
		String result="";
		
		result+=name+myServiceIService.getInfo();
		
		return result;
	}
}
