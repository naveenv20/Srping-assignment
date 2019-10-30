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


import com.luv2code.springdemo.model.user_info;

@Service
public class UserServiceRestClientImpl implements UserService {

	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public UserServiceRestClientImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	@Override
	public List<user_info> getUsers() {
		
		logger.info("in getCustomers(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<user_info>> responseEntity = 
											restTemplate.exchange(crmRestUrl, HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<user_info>>() {});

		// get the list of customers from response
		List<user_info> users = responseEntity.getBody();

		logger.info("in getusers(): users" + users);
		
		return users;
	}

	@Override
	public user_info getUser(int theId) {

		logger.info("in getCustomer(): Calling REST API " + crmRestUrl);

		// make REST call
		user_info theUser = 
				restTemplate.getForObject(crmRestUrl + "/" + theId, 
						user_info.class);

		logger.info("in saveCustomer(): theCustomer=" + theUser);
		
		return theUser;
	}

	@Override
	public void saveUser(user_info theUser) {

		logger.info("in saveCustomer(): Calling REST API " + crmRestUrl);
		
		int userId = theUser.getId();

		// make REST call
		if (userId == 0) {
			// add employee
			restTemplate.postForEntity(crmRestUrl, theUser, String.class);			
		
		} else {
			// update employee
			restTemplate.put(crmRestUrl, theUser);
		}

		logger.info("in saveUser(): success");	
	}

	@Override
	public void deleteUser(int theId) {

		logger.info("in deleteUser(): Calling REST API " + crmRestUrl);

		// make REST call
		restTemplate.delete(crmRestUrl + "/" + theId);

		logger.info("in deleteUser(): deleted user theId=" + theId);
	}

}
