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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.luv2code.springdemo.model.user_circle;
import com.luv2code.springdemo.model.user_inbox;
import com.luv2code.springdemo.service.userinboxService;

@Controller

@RequestMapping("/userinbox")
public class UserInboxController {
	
	
	@Autowired
	private userinboxService userInboxService;
	
	@InitBinder     
	public void initBinder(WebDataBinder binder){
	     binder.registerCustomEditor(Date.class,     
	                         new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));   
	}
	
	
	
	@GetMapping("/listusermessages")
	public String listcircleuserss(@RequestParam("theId") int theId,Model theModel) {
		
		// get customers from the service
		List<user_inbox> theuserinbox = userInboxService.getusermesages(theId);
				
		// add the customers to the model
		theModel.addAttribute("userinboxlist", theuserinbox);
		System.out.println("##############"+theId);
		theModel.addAttribute("theId", theId);
		return "list-usermessages";
	}

}
