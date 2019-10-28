package com.luv2code.springdemo.rest;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.luv2code.springdemo.entity.user_info;
import com.luv2code.springdemo.service.Testtbservice;



@RestController
@RequestMapping("/api")
public class UserRestController {
	
	//autowire customer service
	@Autowired
	private Testtbservice testtbService;
	
	//add mappinh for GET /customers
	
	@RequestMapping("/users")
	public List<user_info> getcustomers(){
			
		return testtbService.getUserdata();
		
	}
	
	//add mapping get customer --with customer id
	@RequestMapping("/users/{userId}")
	public user_info getcustomer(@PathVariable int userId ){
			
		user_info theuser=testtbService.getuser(userId);
		
		
		
		return theuser;
		
	}
	
	
	
	//add mapping for POST /customers     adding a new customer
	
	@PostMapping("/users")
	public user_info addUser(@RequestBody user_info theUser){
		
		
		//also just in the case the pass the id in JSON ...set id to 0
		//this is force a save of new item .. instead of doing update 
		testtbService.saveUser(theUser);
		
		
		return theUser;
		
	}
	
	
	// add mapping for PUT /customers for updating the customers
	
	@PutMapping("/users")
	public user_info updateCustomer(@RequestBody user_info theUser){
		
		
		//also just in the case the pass the id in JSON ...set id to the value u want delete
		//
		testtbService.saveUser(theUser);
		
		
		return theUser;
		
	}
	
	
	// add mapping for DELETE /customers for deleting the customer
	
	@DeleteMapping("/users/{userId}")
	public String deleteuser(@PathVariable int userId) {

		user_info theuser = testtbService.getuser(userId);
		
		
		
		
		
		//also just in the case the pass the id in JSON ...set id to the value u want delete
	
		testtbService.deleteUser(userId);
		
		
		return "Delete Customer id :  "+userId;
		
	}
	
	
}
