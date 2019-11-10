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

import com.luv2code.springdemo.model.user_circle;
import com.luv2code.springdemo.model.user_inbox;

@Service
public class userinboxServiceImpl implements userinboxService {
	
	
	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public userinboxServiceImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url3}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	
	

	@Override
	public List<user_inbox> getusermesages(int theId) {
		logger.info("in getusermesages(): Calling REST API " + crmRestUrl);

		// make REST call
				ResponseEntity<List<user_inbox>> responseEntity = 
													restTemplate.exchange("http://localhost:8080/spring-crm-rest/api/userinbox/user/"+theId, HttpMethod.GET, null, 
																		  new ParameterizedTypeReference<List<user_inbox>>() {});
		
				List<user_inbox> usermessages = responseEntity.getBody();

				logger.info("in getusermesages(): userinbox" + usermessages);
				
				return usermessages;
				
				
	
	}

}
