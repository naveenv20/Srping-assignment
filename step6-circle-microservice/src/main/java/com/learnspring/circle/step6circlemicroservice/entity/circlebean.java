package com.learnspring.circle.step6circlemicroservice.entity;

public class circlebean {
	
	private circle thecircle;
	public circle getThecircle() {
		return thecircle;
	}
	public void setThecircle(circle thecircle) {
		this.thecircle = thecircle;
	}
	public user_info getTheuser_info() {
		return theuser_info;
	}
	public void setTheuser_info(user_info theuser_info) {
		this.theuser_info = theuser_info;
	}
	private user_info theuser_info;
	public circlebean(circle thecircle, user_info theuser_info) {
		super();
		this.thecircle = thecircle;
		this.theuser_info = theuser_info;
	}
	
	
	public circlebean() {
		
	}
	

}
