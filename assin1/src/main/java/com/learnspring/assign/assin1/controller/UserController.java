package com.learnspring.assign.assin1.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.learnspring.assign.assin1.dao.TesttbDAO;
import com.learnspring.assign.assin1.entity.testtb;


@Controller
public class UserController {

	
	@Autowired
	private TesttbDAO testtbDAO;
	
	
	@GetMapping("/")
    public String userForm(Locale locale, Model model) {
       
        return "index";
    }
	
	@GetMapping("/list")
	 public String listCustomer(Model themodel){
	    	
	    	//get customer from the dao
	    	//List<Customer> theCustomers=customerDAO.getCustomers();
	    	
	    	//using the service layer
	    	List<testtb> theUsers=testtbDAO.getTestdata();
	    	// add the customer to the model
	    	themodel.addAttribute("userlist",theUsers);
	    	
	    	
	    	
			return "displaytestusers";
	}
	
}
