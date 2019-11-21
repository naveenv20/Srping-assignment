package com.learnspring.microservie.currencyexchangeservice;

import java.math.BigDecimal;

public class ExchangeValue {
	
	private String from;
	private String to;
	private Long id;
	private BigDecimal conversionMultiple;
	private int port;
	
	
	
	public ExchangeValue() {
		
	}
	public ExchangeValue(Long id, String from, String to,  BigDecimal conversionMultiple) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionMultiple = conversionMultiple;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

}
