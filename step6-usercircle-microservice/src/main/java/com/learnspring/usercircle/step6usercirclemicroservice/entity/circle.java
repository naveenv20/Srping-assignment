package com.learnspring.usercircle.step6usercirclemicroservice.entity;

import java.util.Date;



import javax.persistence.Temporal;
import javax.persistence.TemporalType;





public class circle {
	

	private int id;
	
	@Temporal(value= TemporalType.DATE)
	private Date doj;
	

	private String circle_name;
	
	

	private int createdby;
	
	

	private String userid;
	
	


	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

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

	
	

	public int getCreatedby() {
		return createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	@Override
	public String toString() {
		return "circle**** [id=" + id + ", doj=" + doj + ", circle_name=" + circle_name +"]";
	}
	
	
	
}
