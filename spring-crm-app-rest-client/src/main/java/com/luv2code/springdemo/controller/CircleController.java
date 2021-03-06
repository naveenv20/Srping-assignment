package com.luv2code.springdemo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.model.circle;

import com.luv2code.springdemo.service.circleService;


@Controller
@RequestMapping("/circle")
public class CircleController {

	// need to inject our customer service
	@Autowired
	private circleService circleservice;
	
	@InitBinder     
	public void initBinder(WebDataBinder binder){
	     binder.registerCustomEditor(Date.class,     
	                         new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));   
	}
	
	@GetMapping("/list")
	public String listcircles(Model theModel) {
		
		// get customers from the service
		List<circle> theCircles = circleservice.getCircledata();
				
		// add the customers to the model
		theModel.addAttribute("circles", theCircles);
		
		return "list-circles";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		circle theCircle = new circle();
		
		theModel.addAttribute("circle", theCircle);
		
		return "circle-form";
	}
	
	@PostMapping("/saveCircle")
	public String saveCircle(@ModelAttribute("circle") circle theCircle) {
		
		// save the customer using our service
		circleservice.saveCircle(theCircle);
		
		return "redirect:/circle/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("circleId") int theId,
									Model theModel) {
		
		// get the customer from our service
		circle theCircle = circleservice.getCircle(theId);	
		
		// set customer as a model attribute to pre-populate the form
		theModel.addAttribute("circle", theCircle);
		
		// send over to our form		
		return "circle-form";
	}
	
	@GetMapping("/delete")
	public String deleteUser(@RequestParam("circleId") int theId) {
		
		// delete the customer
		circleservice.deleteCircle(theId);
		
		return "redirect:/circle/list";
	}
}










