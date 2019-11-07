package com.luv2code.springdemo.rest;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.user_info;

import com.luv2code.springdemo.service.Testtbservice;
import com.luv2code.springdemo.service.circleService;

@RestController
@RequestMapping("/api")
public class CircleRestController {
	
	//autowire customer service
	@Autowired
	private circleService circleservice;
	
	//add mappinh for GET /customers
	
	
	@InitBinder     
	public void initBinder(WebDataBinder binder){
	     binder.registerCustomEditor(Date.class,     
	                         new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));   
	}
	
	
	@RequestMapping("/circles")
	public List<circle> getcustomers(Model theModel){
			
		
		// get users from the service
				List<circle> thecircles = circleservice.getCircledata();
						
				// add the customers to the model
				theModel.addAttribute("circlelist", thecircles);
				
				//return "list-users";
		
		
		return circleservice.getCircledata();
		
	}
	
	//add mapping get customer --with customer id
	@RequestMapping("/circles/{circleId}")
	public circle getcustomer(@PathVariable int circleId ){
			
		circle thecircle=circleservice.getCircle(circleId);
		
		
		
		return thecircle;
		
	}
	
	
	
	//add mapping for POST /customers     adding a new customer
	
	@PostMapping("/circles")
	public circle addUser(@RequestBody circle theCircle){
		
		
		//also just in the case the pass the id in JSON ...set id to 0
		//this is force a save of new item .. instead of doing update 
		circleservice.saveCircle(theCircle);
		
		
		return theCircle;
		
	}
	
	
	// add mapping for PUT /customers for updating the customers
	
	@PutMapping("/circles")
	public circle updateCustomer(@RequestBody circle theCircle){
		
		
		//also just in the case the pass the id in JSON ...set id to the value u want delete
		//
		circleservice.saveCircle(theCircle);
		
		
		return theCircle;
		
	}
	
	
	// add mapping for DELETE /customers for deleting the customer
	
	@DeleteMapping("/circles/{circleId}")
	public String deleteuser(@PathVariable int circleId) {

		circle thecircle = circleservice.getCircle(circleId);
		
		
		
		
		
		//also just in the case the pass the id in JSON ...set id to the value u want delete
	
		circleservice.deleteCircle(circleId);
		
		
		return "Delete Customer id :  "+circleId;
		
	}
	
	
}
