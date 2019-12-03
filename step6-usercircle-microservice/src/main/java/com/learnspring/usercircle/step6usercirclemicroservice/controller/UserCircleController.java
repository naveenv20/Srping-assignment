package com.learnspring.usercircle.step6usercirclemicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learnspring.usercircle.step6usercirclemicroservice.entity.user_circle;
import com.learnspring.usercircle.step6usercirclemicroservice.service.UserCircleService;


@RestController
@RequestMapping("/api")
public class UserCircleController {
	
	private UserCircleService userCircleService;
	
	@Autowired
	public UserCircleController (UserCircleService theuserCircleService) {
		userCircleService=theuserCircleService;
	}
	
	@RequestMapping("/usercircles")
	
	public List<user_circle> getusercircles(Model theModel){
		
		return userCircleService.findAll();
		
	}
	
	//https://springframework.guru/spring-requestmapping-annotation/
	@PostMapping("/usercircles")
	@Transactional
	public user_circle addCircleUser(@RequestBody user_circle theUserCircle){
		
		
		
		userCircleService.save(theUserCircle);
		
		
		return theUserCircle;
		
	}
	
	
	@PutMapping("/usercircles")
	public user_circle updateCircleUser(@RequestBody user_circle theUserCircle){
		
		
		//also just in the case the pass the id in JSON ...set id to the value u want delete
		//
		userCircleService.save(theUserCircle);
		
		
		return theUserCircle;
		
	}
	
	@DeleteMapping("/usercircles")
	public String deleteuser(@PathVariable int usercircleId) {

		System.out.println("##################");
		userCircleService.deleteById(usercircleId);
		
		
		return "Delete Customer id :  "+usercircleId;
		
	}
	
	
	
	

}
