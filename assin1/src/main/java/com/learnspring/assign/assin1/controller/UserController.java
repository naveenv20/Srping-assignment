package com.learnspring.assign.assin1.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

	
	@GetMapping("/")
    public String userForm(Locale locale, Model model) {
       
        return "displaytestusers";
    }
	
	
	
	
	
}
