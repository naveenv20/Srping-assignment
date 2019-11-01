package com.luv2code.springdemo.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.luv2code.springdemo.model.circle;

public class circleServiceImpl implements circleService {
	
	
	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public circleServiceImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	

	@Override
	public List<circle> getCircledata() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public circle getCircle(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCircle(int theId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveCircle(circle theCircle) {
		// TODO Auto-generated method stub

	}

}
