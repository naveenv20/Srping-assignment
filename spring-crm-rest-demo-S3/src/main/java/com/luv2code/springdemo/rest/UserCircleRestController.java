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

import com.luv2code.springdemo.entity.circle;
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
	
	public List<user_circle> getcirclesusers(Model theModel,@PathVariable int circleId){
		
		return UsercircleService.getusercircledata(circleId);
		
	}
	

	@RequestMapping("/usercircles/user/{userId}")
	
	public List<user_circle> getusercircles(Model theModel,@PathVariable int userId){
		
		return UsercircleService.getusercircledata2(userId);
		
	}
	
	//https://springframework.guru/spring-requestmapping-annotation/
	
	
	
	@PostMapping("/usercircles")
	@Transactional
	public user_circle addCircleUser(@RequestBody user_circle theUserCircle){
		
		
		//also just in the case the pass the id in JSON ...set id to 0
		//this is force a save of new item .. instead of doing update 
		UsercircleService.saveUserCircle(theUserCircle);
		
		
		return theUserCircle;
		
	}
	
	
	@PutMapping("/usercircles")
	public user_circle updateCircleUser(@RequestBody user_circle theUserCircle){
		
		
		//also just in the case the pass the id in JSON ...set id to the value u want delete
		//
		UsercircleService.saveUserCircle(theUserCircle);
		
		
		return theUserCircle;
		
	}
	
	
	
	@RequestMapping("/usercircles/{circleId}")
	public circle getcircle(@PathVariable int circleId ){
			
		circle thecircle=UsercircleService.getCircle(circleId);
		
		
		
		return thecircle;
		
	}
	
	
	@DeleteMapping("/usercircles/delete/{usercircleId}")
	public String deleteuser(@PathVariable int usercircleId) {

		System.out.println("##################");
		UsercircleService.deleteCircle(usercircleId);
		
		
		return "Delete Customer id :  "+usercircleId;
		
	}
	
	
	@RequestMapping("/usercircles/usercircle/{usercircleId}")
	public user_circle getcircleuser(@PathVariable int usercircleId ){
			
		user_circle thecircleuser=UsercircleService.getcircleuser(usercircleId);
		
		
		
		return thecircleuser;
		
	}
	
	
}
