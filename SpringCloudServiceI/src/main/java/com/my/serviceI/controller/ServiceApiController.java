package com.my.serviceI.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RefreshScope
@RequestMapping(value="/Api")
public class ServiceApiController {
	@Value("${name}")
	private String name;
	
	@ResponseBody
	@RequestMapping(value="/getInfo")
	public String getInfo() {

        try {
            Thread.sleep(3000);//hystrix熔断默认超时时间为2秒,这里模拟超时
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
		return "serviceI+"+name;
	}
}
