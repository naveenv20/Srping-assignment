package com.luv2code.springdemo.model;

import java.util.Date;



import com.fasterxml.jackson.annotation.JsonBackReference;


 
public class user_inbox {
	
	
	 
	private int id;
	
	 
	private String message;
	 
//	private int receiver_id;
	
	 
	private boolean iscircle;
	
	
	private Date doj;
	
	
	private user_info sender_Info;
	
	
	
	private user_info receiver_Info;
	
	
	public user_inbox(){
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


//	public int getReceiver_id() {
//		return receiver_id;
//	}
//
//
//	public void setReceiver_id(int receiver_id) {
//		this.receiver_id = receiver_id;
//	}


	public boolean isIscircle() {
		return iscircle;
	}


	public void setIscircle(boolean iscircle) {
		this.iscircle = iscircle;
	}


	public Date getDoj() {
		return doj;
	}


	public void setDoj(Date doj) {
		this.doj = doj;
	}

	
	public user_info getSender_Info() {
		return sender_Info;
	}


	public void setSender_Info(user_info sender_Info) {
		this.sender_Info = sender_Info;
	}

	
	public user_info getReceiver_Info() {
		return receiver_Info;
	}


	public void setReceiver_Info(user_info receiver_Info) {
		this.receiver_Info = receiver_Info;
	}
	
	

}
