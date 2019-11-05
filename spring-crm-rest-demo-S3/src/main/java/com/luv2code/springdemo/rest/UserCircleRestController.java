package com.luv2code.springdemo.rest;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.user_circle;
import com.luv2code.springdemo.entity.user_info;

import com.luv2code.springdemo.service.Testtbservice;
import com.luv2code.springdemo.service.usercircleService;

@RestController
@RequestMapping("/api")
public class UserCircleRestController {
	
	//autowire customer service
	@Autowired
	private usercircleService UsercircleService;
	
	//add mappinh for GET /customers
	
	@RequestMapping("/usercircles/circle/{circleId}")
	@Transactional
	public List<user_circle> getcustomers(Model theModel,@PathVariable int circleId){
		
		return UsercircleService.getusercircledata(circleId);
		
	}
	

	@RequestMapping("/usercircles/user/{userId}")
	@Transactional
	public List<user_circle> getcirclesforuser(Model theModel,@PathVariable int userId){
		
		return UsercircleService.getusercircledata2(userId);
		
	}
	
	//https://springframework.guru/spring-requestmapping-annotation/
	
}
