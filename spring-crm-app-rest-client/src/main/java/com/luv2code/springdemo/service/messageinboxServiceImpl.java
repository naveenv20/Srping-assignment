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
import com.luv2code.springdemo.model.message_info;
import com.luv2code.springdemo.model.user_info;



@Service
public class messageinboxServiceImpl implements messageinboxService {
	

	
	private RestTemplate restTemplate;

	private String crmRestUrl;
		
	private Logger logger = Logger.getLogger(getClass().getName());
	
	@Autowired
	public messageinboxServiceImpl(RestTemplate theRestTemplate, 
										@Value("${crm.rest.url4}") String theUrl) {
		restTemplate = theRestTemplate;
		crmRestUrl = theUrl;
				
		logger.info("Loaded property:  crm.rest.url=" + crmRestUrl);
	}
	

	@Override

	public List<message_info> getmessagedata() {
		logger.info("in getmessagedata(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<message_info>> responseEntity = 
											restTemplate.exchange("http://localhost:8080/spring-crm-rest/api/messageinfo", HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<message_info>>() {});

		// get the list of customers from response
		List<message_info> messages = responseEntity.getBody();

		logger.info("in getmessagedata(): getmessagedata" + messages);
		
		return messages;
	
	}


	@Override
	public List<user_info> getsenders() {
		logger.info("in getsenders(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<user_info>>	responseEntity=	restTemplate.exchange("http://localhost:8080/spring-crm-rest/api/messageinfo/senders", HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<user_info>>() {});

		// get the list of customers from response
		List<user_info> senders = responseEntity.getBody();

		logger.info("in getsenders(): " + senders);
		
		return senders;
	}


	@Override
	public List<user_info> getreceivers() {
		logger.info("in getreceivers(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<user_info>>	responseEntity=	restTemplate.exchange("http://localhost:8080/spring-crm-rest/api/messageinfo/receivers", HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<user_info>>() {});

		// get the list of customers from response
		List<user_info> receivers = responseEntity.getBody();

		logger.info("in getreceivers(): " + receivers);
		
		return receivers;
	}


	@Override
	public List<circle> getcircles() {
		logger.info("in getcircles(): Calling REST API " + crmRestUrl);

		// make REST call
		ResponseEntity<List<circle>>	responseEntity=	restTemplate.exchange("http://localhost:8080/spring-crm-rest/api/messageinfo/circles", HttpMethod.GET, null, 
																  new ParameterizedTypeReference<List<circle>>() {});

		// get the list of customers from response
		List<circle> circles = responseEntity.getBody();

		logger.info("in getcircles(): " + circles);
		
		return circles;
	}


	@Override
	public void savemessage(message_info themessage_info) {
logger.info("in savemessage(): Calling REST API " + crmRestUrl);
		
		int messageId = themessage_info.getId();

		// make REST call
		if (messageId == 0) {
			// add employee
			restTemplate.postForEntity("http://localhost:8080/spring-crm-rest/api/messageinfo", themessage_info, String.class);			
		
		} else {
			// update employee
			restTemplate.put(crmRestUrl, themessage_info);
		}

		logger.info("in savemessage(): success");	

	}

		
	


	@Override
	public message_info getmessageinfo(int theId) {
		logger.info("in getmessageinfo(): Calling REST API " + crmRestUrl);

		// make REST call
		message_info themessage_info = 
				restTemplate.getForObject("http://localhost:8080/spring-crm-rest/api/messageinfo" + "/" + theId, 
						message_info.class);

		logger.info("in getmessageinfo():  " + themessage_info);
		
		return themessage_info;
		
	}

}
