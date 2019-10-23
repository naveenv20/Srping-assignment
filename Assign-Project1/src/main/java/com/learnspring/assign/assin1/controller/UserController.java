package com.learnspring.assign.assin1.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learnspring.assign.assin1.dao.TesttbDAO;
import com.learnspring.assign.assin1.entity.testtb;
import com.learnspring.assign.assin1.service.Testtbservice;


@Controller
@RequestMapping("/user")
public class UserController {

	
	private Testtbservice testtbservice;
	
	
	public UserController (Testtbservice thetesttbservice) {
		testtbservice=thetesttbservice;
	}
	
	
	@GetMapping("/list")
	 public String listCustomer(Model themodel){
	    	
	    	//get customer from the dao
	    	//List<Customer> theCustomers=customerDAO.getCustomers();
	    	
	    	//using the service layer
	    	List<testtb> theUsers=testtbservice.getTestdata();
	    	// add the customer to the model
	    	themodel.addAttribute("userlist",theUsers);
	    	
	    	
	    	
			return "displaytestusers";
	}
	
}
