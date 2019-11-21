package com.learnspring.microservie.currencyexchangeservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ExchangeValueRepositry extends JpaRepository<ExchangeValue, Long>{
	
	
	public ExchangeValue findByFromAndTo(String from, String to);	

}
