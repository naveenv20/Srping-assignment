package com.learnspring.circle.step6messagemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.learnspring.circle.step6messagemicroservice")
@EnableDiscoveryClient
public class Step6MessageMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step6MessageMicroserviceApplication.class, args);
	}

}
