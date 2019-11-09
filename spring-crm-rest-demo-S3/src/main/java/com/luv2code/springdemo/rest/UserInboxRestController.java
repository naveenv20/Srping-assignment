package com.luv2code.springdemo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.luv2code.springdemo.entity.user_inbox;
import com.luv2code.springdemo.service.userinboxService;

@RestController
@RequestMapping("/api")
public class UserInboxRestController {
	
	@Autowired
	private userinboxService userInboxService;
	
	
@RequestMapping("/userinbox/user/{receiverId}")
	
	public List<user_inbox> getcirclesusers(Model theModel,@PathVariable int receiverId){
		
		return userInboxService.getinboxdata(receiverId);
		
	}

}
