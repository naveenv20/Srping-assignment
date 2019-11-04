package com.luv2code.springdemo.model;




public class user_circle {

	private int id;

	
	public user_circle(){
		
	}
	
	

	private user_info User_info;
	
	


	private circle Circle;
	
	
	private boolean subscribe;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public user_info getUser_info() {
		return User_info;
	}

	public void setUser_info(user_info user_info) {
		User_info = user_info;
	}

	public circle getCircle() {
		return Circle;
	}

	public void setCircle(circle circle) {
		Circle = circle;
	}

	public boolean isSubscribe() {
		return subscribe;
	}

	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}

		
	
}
