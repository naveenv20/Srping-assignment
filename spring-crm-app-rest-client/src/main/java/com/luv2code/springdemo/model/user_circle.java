package com.luv2code.springdemo.model;




public class user_circle {

	private int id;

	private circle theCircle;

	private boolean subscribe;

	private user_info user_Info;
	
	




	
	
	public user_info getUser_Info() {
		return user_Info;
	}

	public void setUser_Info(user_info user_Info) {
		this.user_Info = user_Info;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	




	public circle getTheCircle() {
		return theCircle;
	}

	public void setTheCircle(circle circle) {
		theCircle = circle;
	}

	public boolean isSubscribe() {
		return subscribe;
	}

	public void setSubscribe(boolean subscribe) {
		this.subscribe = subscribe;
	}

	public user_circle() {

	}


		
	@Override
	public String toString() {
		return "user_circle [id=" + id + ", User_info=" + user_Info + ", Circle=" + theCircle + ", subscribe=" + subscribe
				+ "]";
	}
}
