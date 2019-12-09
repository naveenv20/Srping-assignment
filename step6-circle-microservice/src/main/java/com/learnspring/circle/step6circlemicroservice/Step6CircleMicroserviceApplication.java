package com.learnspring.circle.step6circlemicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

@SpringBootApplication
@EnableFeignClients("com.learnspring.circle.step6circlemicroservice")
@EnableDiscoveryClient
public class Step6CircleMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Step6CircleMicroserviceApplication.class, args);
	}
	
	
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}

}
