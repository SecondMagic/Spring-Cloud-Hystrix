package com.my.customerII.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient(value="myServiceI",fallback=MyServiceIErrorService.class)
public interface MyServiceIService {
	@ResponseBody
	@RequestMapping(value="/myServiceI/Api/getInfo")
	public String getInfo();
}
