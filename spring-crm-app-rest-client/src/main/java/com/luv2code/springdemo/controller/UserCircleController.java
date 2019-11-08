package com.luv2code.springdemo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.model.circle;
import com.luv2code.springdemo.model.user_circle;
import com.luv2code.springdemo.model.user_info;
import com.luv2code.springdemo.service.circleService;
import com.luv2code.springdemo.service.usercircleService;


@Controller

@RequestMapping("/usercircle")


public class UserCircleController {

	// need to inject our customer service
	@Autowired
	private usercircleService usercircleservice;
	
	@InitBinder     
	public void initBinder(WebDataBinder binder){
	     binder.registerCustomEditor(Date.class,     
	                         new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));   
	}
	
	@GetMapping("/listcircleusers")
	public String listcircleuserss(@RequestParam("circleId") int theId,Model theModel) {
		
		// get customers from the service
		List<user_circle> theCircleusers = usercircleservice.getcircleuserdata(theId);
				
		// add the customers to the model
		theModel.addAttribute("usercirclelist", theCircleusers);
		System.out.println("##############"+theId);
		theModel.addAttribute("circleId", theId);
		return "list-usercircles";
	}
	
	@GetMapping("/listusercircles")
	public String listusercircles(@RequestParam("userId") int theId,Model theModel) {
		
		// get customers from the service
		List<user_circle> theusercircless = usercircleservice.getusercircledata(theId);
				
		// add the customers to the model
		theModel.addAttribute("usercirclelist", theusercircless);
		
		
		return "list-usercircles";
	}

	
	
	@PostMapping("/saveUserCircle")
	public String saveUserCircle(@ModelAttribute("usercircle") user_circle theUserCircle){
		
		
		//also just in the case the pass the id in JSON ...set id to 0
		//this is force a save of new item .. instead of doing update 
		usercircleservice.saveUserCircle(theUserCircle);
		
		
		return "redirect:/circle/list";
		
	}
	
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(@RequestParam("circleId") int theId,Model theModel) {
		
		// create model attribute to bind form data
		user_circle theUserCircle = new user_circle();
		circle theCircle = usercircleservice.getcircle(theId);
	
	
		
		circle thecircle=usercircleservice.getcircle(theId);
		theUserCircle.setTheCircle(thecircle);
		theModel.addAttribute("usercircle", theUserCircle);
		
		return "usercircle-form";
	}

	
	@GetMapping("/delete")
	public String deleteCircleUser(@RequestParam("circleuserId") int theId,@RequestParam("circleId") int ctheId) {
		
		System.out.println("inside  deleteCircleUser");
		// delete the customer
		usercircleservice.deleteCircleuser(theId);
		
		return "redirect:/usercircle/listcircleusers?circleId="+ctheId;
	}
	
	
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("circleuserId") int theId,
									Model theModel) {
		
		// get the customer from our service
		user_circle thecircleUser = usercircleservice.getcircleUser(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("usercircle", thecircleUser);
		
		// send over to our form		
		return "usercircle-form";
	}
	
	
	
}










