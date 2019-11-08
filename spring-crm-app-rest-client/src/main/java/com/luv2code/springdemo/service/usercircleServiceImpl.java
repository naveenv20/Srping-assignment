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
import com.luv2code.springdemo.model.user_circle;
import com.luv2code.springdemo.model.user_info;



@Service
public class usercircleServiceImpl implements usercircleService {


	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public usercircleServiceImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url2}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	
	
	@Override
	public List<user_circle> getcircleuserdata(int circleId) {
		
		logger.info("in getcircles(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<user_circle>> responseEntity = 
											restTemplate.exchange("http://localhost:8080/spring-crm-rest/api/usercircles/circle/"+circleId, HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<user_circle>>() {});

		// get the list of customers from response
		List<user_circle> circleusers = responseEntity.getBody();

		logger.info("in getcircleuserdata(): circleusers" + circleusers);
		
		return circleusers;
		
		
		
		
	}

	@Override
	public List<user_circle> getusercircledata(int userId) {
		
		logger.info("in getcircles(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<user_circle>> responseEntity = 
											restTemplate.exchange("http://localhost:8080/spring-crm-rest/api/usercircles/user/"+userId, HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<user_circle>>() {});

		// get the list of customers from response
		List<user_circle> usercircles = responseEntity.getBody();

		logger.info("in getusercircledata(): usercircles" + usercircles);
		
		return usercircles;
		
	}



	@Override
	public void saveUserCircle(user_circle theUserCircle) {
logger.info("in saveUserCircle(): Calling REST API " + crmRestUrl);
		
		int theUserCircleId = theUserCircle.getId();
		logger.info("in saveUserCircle() and theUserCircleId:"+theUserCircleId);	

		// make REST call
		if (theUserCircleId == 0) {
			// add employee
			restTemplate.postForEntity(crmRestUrl, theUserCircle, String.class);			
		
		} else {
			// update employee
			logger.info("in saveUserCircle() Calling with PUT");
			restTemplate.put(crmRestUrl, theUserCircle);
		}

		logger.info("in saveUserCircle(): success");	
		
	}



	@Override

	public circle getcircle(int circleId) {

		logger.info("in getcircle(): Calling REST API " + crmRestUrl);

		// make REST call
		circle theCircle = 
				restTemplate.getForObject("http://localhost:8080/spring-crm-rest/api/usercircles/"+ circleId, 
						circle.class);

		logger.info("in getcircle(): thecircle=" + theCircle);
		
		return theCircle;

	}



	@Override
	public void deleteCircleuser(int theId) {
		logger.info("in deleteCircleuser(): Calling REST API " + crmRestUrl);

		
		restTemplate.delete("http://localhost:8080/spring-crm-rest/api/usercircles/delete/"+ theId);

		logger.info("in deleteCircleuser(): deleted circleuser theId=" + theId);
		
		
		
		
	}



	@Override
	public user_circle getcircleUser(int theId) {
		
		
		logger.info("in getcircleUser(): Calling REST API " + crmRestUrl);

		// make REST call
		user_circle thecircleUser = 
				restTemplate.getForObject("http://localhost:8080/spring-crm-rest/api/usercircles/usercircle/"+ theId, 
						user_circle.class);

		logger.info("in getcircleUser(): thecircleuser=" + thecircleUser);
		
		return thecircleUser;
		
	}

}
