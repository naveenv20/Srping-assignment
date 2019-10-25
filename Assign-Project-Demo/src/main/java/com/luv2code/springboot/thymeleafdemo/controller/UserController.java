package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.List;
import java.util.Locale;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luv2code.springboot.thymeleafdemo.entity.circle;
import com.luv2code.springboot.thymeleafdemo.entity.message_info;
import com.luv2code.springboot.thymeleafdemo.entity.user_inbox;
import com.luv2code.springboot.thymeleafdemo.entity.user_info;
import com.luv2code.springboot.thymeleafdemo.service.Testtbservice;



@Controller
@RequestMapping("/user")
public class UserController {

	
	private Testtbservice testtbservice;
	
	
	public UserController (Testtbservice thetesttbservice) {
		testtbservice=thetesttbservice;
	}
	
	
	
	
	

	
	
	
	@GetMapping("/circlelist")
	 public String listCircledata(Model themodel){
	    	
	    	//get customer from the dao
	    	//List<Customer> theCustomers=customerDAO.getCustomers();
	    	
	    	//using the service layer
	    	List<circle> thecircles=testtbservice.getCircledata();
	    	// add the customer to the model
	    	themodel.addAttribute("circlelist",thecircles);
	    	
	    	
	    	
			return "user/list-circle";
	}
	
	
	@GetMapping("/userlist")
	 public String listUserdata(Model themodel){
	    	
	    	//get customer from the dao
	    	//List<Customer> theCustomers=customerDAO.getCustomers();
	    	
	    	//using the service layer
	    	List<user_info> thecircles=testtbservice.getUserdata();
	    	// add the customer to the model
	    	themodel.addAttribute("userlist",thecircles);
	    	
	    	
	    	
			return "user/list-users";
	}
	
	
	@GetMapping("/messagelist")
	 public String listmessagedata(Model themodel){
	    	
	    	//get customer from the dao
	    	//List<Customer> theCustomers=customerDAO.getCustomers();
	    	
	    	//using the service layer
	    	List<message_info> thecircles=testtbservice.getMessagedata();
	    	// add the customer to the model
	    	themodel.addAttribute("messagelist",thecircles);
	    	
	    	
	    	
			return "user/list-messages";
	}
	
	@GetMapping("/inbox")
	 public String userinbox(Model themodel){
	    	
	    	//get customer from the dao
	    	//List<Customer> theCustomers=customerDAO.getCustomers();
	    	
	    	//using the service layer
	    	List<user_inbox> thecircles=testtbservice.getinboxdata();
	    	// add the customer to the model
	    	themodel.addAttribute("inbox",thecircles);
	    	
	    	
	    	
			return "user/user_inbox";
	}
}
