package com.learnspring.usercircle.step6usercirclemicroservice.entity;

public class usercirclebean {
	
	
	private user_info User_info;
	private circle Circle;
	private user_circle User_circle;
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
	public user_circle getUser_circle() {
		return User_circle;
	}
	public void setUser_circle(user_circle user_circle) {
		User_circle = user_circle;
	}
	public usercirclebean(user_info user_info, circle circle, user_circle user_circle) {
		super();
		User_info = user_info;
		Circle = circle;
		User_circle = user_circle;
	}
	public usercirclebean() {
		
	}
}
