package com.learnspring.microservie.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




// what micro service we want connect .. get that from app.proper spring.application.name
//and the url for that 
//@FeignClient(name="currency-exchange-service",url="localhost:8000")
//@FeignClient(name="currency-exchange-service")
// here we are connecting to currency exchange service directly 

// now use the zuul 

@FeignClient(name="netflix-zuul-api-gateway-server")
//for conversion of microservice ..we are just usng port 8000 above if we have mutiple instances then ?
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeServiceProxy {
	
	
	//@GetMapping("/currency-exchange/from/{from}/to/{to}")
	//after impleneting zuul
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	
	public CurrencyConversionBean retrieveExchangeValue
	(@PathVariable("from") String from,@PathVariable("to") String to) ;
		

}
	

