package com.my.customerII.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient("myServiceII")
public interface MyServiceIIService {
	@ResponseBody
	@RequestMapping(value="/myServiceII/Api/getInfo")
	public String getInfo();
}
