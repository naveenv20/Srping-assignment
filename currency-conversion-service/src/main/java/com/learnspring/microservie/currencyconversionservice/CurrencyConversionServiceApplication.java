package com.learnspring.microservie.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients("com.learnspring.microservie.currencyconversionservice")

// this while calling the other micro service uri from this... we have to do lot of manual steps like 
//map path variables etc.. 
// feign does that for us

@EnableDiscoveryClient

//registering this micro service with the naming server
//main job is service registry and service discoverry 

//when conversion service need to talk to exchaneg service , then its not direct 
//this will reach the naming server and ask for that ..
//just to remove the dependency of conversion service on exchange service

public class CurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

}
