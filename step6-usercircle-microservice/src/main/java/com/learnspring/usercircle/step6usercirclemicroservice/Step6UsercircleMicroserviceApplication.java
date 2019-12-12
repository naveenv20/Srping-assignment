package com.learnspring.usercircle.step6usercirclemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.learnspring.usercircle.step6usercirclemicroservice")
@EnableDiscoveryClient
public class Step6UsercircleMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step6UsercircleMicroserviceApplication.class, args);
	}

}
