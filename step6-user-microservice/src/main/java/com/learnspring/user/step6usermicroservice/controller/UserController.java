package com.learnspring.user.step6usermicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspring.user.step6usermicroservice.entity.user_info;
import com.learnspring.user.step6usermicroservice.service.UserService;




@RestController
@RequestMapping("/api")
public class UserController {
	
	 private UserService userService;
	 
	 @Autowired
	 public UserController(UserService theUserService){
		 userService=theUserService;
	 }
	 
	 
	@RequestMapping("/users")
	public List<user_info> getcustomers(Model theModel){
		
		// get users from the service
				List<user_info> theusers = userService.findAll();
						
				// add the customers to the model
				theModel.addAttribute("userslist", theusers);
				
				//return "list-users";
		
		
		return theusers;
		
	}
	
	//add mapping get customer --with customer id
	@RequestMapping("/users/{userId}")
	public user_info getcustomer(@PathVariable int userId ){
			
		user_info theuser=userService.findById(userId);
		
		
		
		return theuser;
		
	}
	
	
	//add mapping get customer --with customer id
		@RequestMapping("/users/u/{userName}")
		public user_info getcustomer(@PathVariable("userName") String userName){
				
			user_info theuser=userService.findByUserid(userName);
			
			return theuser;
			
		}
	
	
	//add mapping for POST /customers     adding a new customer
	
	@PostMapping("/users")
	public user_info addUser(@RequestBody user_info theUser){
		
		
		//also just in the case the pass the id in JSON ...set id to 0
		//this is force a save of new item .. instead of doing update 
		userService.save(theUser);
		
		
		return theUser;
		
	}
	
	
	// add mapping for PUT /customers for updating the customers
	
	@PutMapping("/users")
	public user_info updateCustomer(@RequestBody user_info theUser){
		
		
		//also just in the case the pass the id in JSON ...set id to the value u want delete
		//
		userService.save(theUser);
		
		
		return theUser;
		
	}
	
	
	// add mapping for DELETE /customers for deleting the customer
	
	@DeleteMapping("/users/{userId}")
	public String deleteuser(@PathVariable("userId") int userId) {

		user_info theuser = userService.findById(userId);
		
		
		
		
		
		//also just in the case the pass the id in JSON ...set id to the value u want delete
	
		userService.deleteById(userId);
		
		
		return "Delete Customer id :  "+userId;
		
	}

}
