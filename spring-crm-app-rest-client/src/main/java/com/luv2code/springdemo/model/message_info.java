package com.luv2code.springdemo.model;

import java.util.Date;



import com.fasterxml.jackson.annotation.JsonBackReference;



public class message_info {
	
	
	private int id;
	
	
	private String message;
	
	
	private int receiver_id;
	
	private boolean iscircle;
	
	
	private Date doj;
	
	
	
	private user_info user_Info;
	

	
	public message_info() {
		
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



	


	public int getReceiver_id() {
		return receiver_id;
	}



	public void setReceiver_id(int receiver_id) {
		this.receiver_id = receiver_id;
	}



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


	
	public user_info getUser_Info() {
		return user_Info;
	}



	public void setUser_Info(user_info user_Info) {
		this.user_Info = user_Info;
	}



//	public message_info(String message, int receiver_id, boolean iscircle, Date doj) {
//		
//		this.message = message;
//		this.receiver_id = receiver_id;
//		this.iscircle = iscircle;
//		this.doj = doj;
//	}
//
//	
//	public message_info(int id, String message, int receiver_id, boolean iscircle, Date doj, user_info user_Info) {
//		super();
//		this.id = id;
//		this.message = message;
//		this.receiver_id = receiver_id;
//		this.iscircle = iscircle;
//		this.doj = doj;
//		this.user_Info = user_Info;
//	}


	@Override
	public String toString() {
		return "message_info [id=" + id + ", message=" + message + ", receiver_id=" + receiver_id + ", iscircle="
				+ iscircle + ", doj=" + doj + "]";
	}
	
	
	
	
}
