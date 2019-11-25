package com.learnspring.microservie.netflixzuulapigatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class NetflixZuulApiGatewayServerApplication {

	
	
	/*
	 * To pass the request throgh Zuul then 
	 * http://localhost:8765/{application-name}/{uri}
	 * 	 * 
	 * http://localhost:8765/currency-exchange-service/currency-exchange/from/CAD/to/INR
	 * 
	 * 
	 * http://localhost:8000/currency-exchange/from/CAD/to/INR here we aare directly 
	 * calling the exchaneg service uri not through zuul . 
	 * 
	 */
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(NetflixZuulApiGatewayServerApplication.class, args);
	}

}
