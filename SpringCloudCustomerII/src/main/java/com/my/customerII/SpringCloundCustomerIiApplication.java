package com.my.customerII;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloundCustomerIiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloundCustomerIiApplication.class, args);
	}
}
