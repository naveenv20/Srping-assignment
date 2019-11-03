package com.luv2code.springdemo.service;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.luv2code.springdemo.model.circle;

@Service
public class circleServiceImpl implements circleService {
	
	
	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public circleServiceImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url1}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	

	@Override
	public List<circle> getCircledata() {
		logger.info("in getcircles(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<circle>> responseEntity = 
											restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<circle>>() {});

		// get the list of customers from response
		List<circle> circles = responseEntity.getBody();

		logger.info("in getcircles(): circles" + circles);
		
		return circles;
	}

	@Override
	public circle getCircle(int theId) {
		logger.info("in getcircle(): Calling REST API " + crmRestUrl);

		// make REST call
		circle theCircle = 
				restTemplate.getForObject(crmRestUrl + "/" + theId, 
						circle.class);

		logger.info("in savecircle(): thecircle=" + theCircle);
		
		return theCircle;
	}

	@Override
	public void deleteCircle(int theId) {
		logger.info("in deletecircle(): Calling REST API " + crmRestUrl);

		// make REST call
		restTemplate.delete(crmRestUrl + "/" + theId);

		logger.info("in circleUser(): deleted circle theId=" + theId);

	}

	@Override
	public void saveCircle(circle theCircle) {
logger.info("in saveCircle(): Calling REST API " + crmRestUrl);
		
		int circleId = theCircle.getId();

		// make REST call
		if (circleId == 0) {
			// add employee
			restTemplate.postForEntity(crmRestUrl, theCircle, String.class);			
		
		} else {
			// update employee
			restTemplate.put(crmRestUrl, theCircle);
		}

		logger.info("in saveCircle(): success");	

	}

}
