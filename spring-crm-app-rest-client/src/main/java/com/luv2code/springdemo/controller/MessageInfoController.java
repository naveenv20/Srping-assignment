package com.luv2code.springdemo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.luv2code.springdemo.model.message_info;
import com.luv2code.springdemo.model.user_circle;
import com.luv2code.springdemo.model.user_inbox;
import com.luv2code.springdemo.model.user_info;
import com.luv2code.springdemo.service.messageinboxService;
import com.luv2code.springdemo.service.userinboxService;

@Controller

@RequestMapping("/messageinfo")
public class MessageInfoController {
	
	
	@Autowired
	private messageinboxService messageInboxService;
	
	@InitBinder     
	public void initBinder(WebDataBinder binder){
	     binder.registerCustomEditor(Date.class,     
	                         new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true, 10));   
	}
	
	
	
	@GetMapping("/list")
	public String getMessagedata(Model theModel) {
	
	// get customers from the service
			List<message_info> theMessages = messageInboxService.getmessagedata();
					
			// add the customers to the model
			theModel.addAttribute("theMessages", theMessages);
			
			return "list-messages";
			
			
			
			}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		message_info themessage_info = new message_info();
		
		List<user_info> senders=messageInboxService.getsenders();
		
		Map<Integer,String> senders_values = new HashMap<Integer,String>();
		for (user_info e:senders) {
			senders_values.put(e.getId(), e.getUserid());
		}
		
		List<user_info> receivers=messageInboxService.getreceivers();
		
		Map<Integer,String> receivers_values = new HashMap<Integer,String>();
		for (user_info e:receivers) {
			receivers_values.put(e.getId(), e.getUserid());
		}
		
		List<circle> circles = messageInboxService.getcircles();

		Map<Integer, String> circles_values = new HashMap<Integer, String>();
		for (circle e : circles) {
			circles_values.put(e.getId(), e.getCircle_name());
		}

		
		
		theModel.addAttribute("message", themessage_info);
		theModel.addAttribute("senders", senders);
		theModel.addAttribute("receivers", receivers);
		theModel.addAttribute("senders_values", senders_values);
		theModel.addAttribute("receivers_values", receivers_values);
		theModel.addAttribute("circles_values", circles_values);
		
		
		return "message-form";
	}
	
	
	
	@PostMapping("/saveMessage")
	public String saveMessage(@ModelAttribute("message") message_info themessage_info) {
		
		// save the customer using our service
		messageInboxService.savemessage(themessage_info);
		
		return "redirect:/messageinfo/list";
	}
	
}
