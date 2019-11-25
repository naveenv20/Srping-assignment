package com.learnspring.microservie.currencyexchangeservice;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private ExchangeValueRepositry exchangeValueRepositry;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from,@PathVariable String to) {
		
		ExchangeValue exchangeValue = 
				//new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
				exchangeValueRepositry.findByFromAndTo(from, to);
		
		// exchangeValue.setPort(8000); hard coding the port
		exchangeValue.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		logger.info("{}",exchangeValue);
		return exchangeValue;
	}

}
