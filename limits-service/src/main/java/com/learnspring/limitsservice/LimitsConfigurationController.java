package com.learnspring.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspring.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	//values coming from the properties file .. we have class created with annotation @ConfigurationProperties("limits-service") so 
	//spring boot uses this for reading the prorties .. in  pro file we have used the project name . values kind which was given as argument in the @ConfigurationProperties 
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsfromconfigrations() {
		
				
		//return new LimitConfiguration(1000,1);
		
		return new LimitConfiguration(configuration.getMaximum(),configuration.getMinimum());
	}

}
