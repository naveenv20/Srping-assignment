package com.learnspring.microservie.currencyconversionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@SpringBootApplication
@EnableFeignClients("com.learnspring.microservie.currencyconversionservice")
// this while calling the other micro service uri from this... we have to do lot of manual steps like 
//map path variables etc.. 
// feign does that for us

public class CurrencyConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConversionServiceApplication.class, args);
	}

}
