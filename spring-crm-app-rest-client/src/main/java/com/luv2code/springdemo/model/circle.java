package com.luv2code.springdemo.model;


import java.util.Date;
import java.util.TimeZone;

import org.springframework.format.annotation.DateTimeFormat;




public class circle {
	
	
	private int id;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date doj;
	
	
	private String circle_name;
	
	
	private user_info circle_user_Info;
	
	
	public circle(Date doj, String circle_name) {
		super();
		this.doj = doj;
		this.circle_name = circle_name;
		
	}

	public circle() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDoj() {
//		
//		String abc=(new SimpleDateFormat("yyyy-MM-dd").format(doj));
//		System.out.println("==============>"+abc);
//		
//		try {
//			doj=new SimpleDateFormat("yyyy-MM-dd").parse(abc);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		TimeZone.setDefault(TimeZone.getTimeZone("ADT"));
		
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getCircle_name() {
		return circle_name;
	}

	public void setCircle_name(String circle_name) {
		this.circle_name = circle_name;
	}

	public user_info getCircle_user_Info() {
		return circle_user_Info;
	}

	public void setCircle_user_Info(user_info circle_user_Info) {
		this.circle_user_Info = circle_user_Info;
	}

	@Override
	public String toString() {
		return "circle%%% [id=" + id + ", doj=" + doj + ", circle_name=" + circle_name + "]";
	}
	
	
	
	
}
