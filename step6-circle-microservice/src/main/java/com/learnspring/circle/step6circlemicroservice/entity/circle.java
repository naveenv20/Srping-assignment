package com.learnspring.circle.step6circlemicroservice.entity;

import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;



@Entity
@Table(name="circle")
public class circle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="created_date_time")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(value= TemporalType.DATE)
	private Date doj;
	
	@Column(name="circle_name")
	private String circlename;
	
	
	@Column(name="createdby")
	private int createdby;
	
	
//	@Column(name="userid")
//	private String userid;
//	
	


//	public String getUserid() {
//		return userid;
//	}
//
//	public void setUserid(String userid) {
//		this.userid = userid;
//	}

	public circle(Date doj, String circle_name) {
		super();
		this.doj = doj;
		this.circlename = circle_name;
		
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
		return circlename;
	}

	public void setCircle_name(String circle_name) {
		this.circlename = circle_name;
	}

	
	

	public int getCreatedby() {
		return createdby;
	}

	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}

	@Override
	public String toString() {
		return "circle**** [id=" + id + ", doj=" + doj + ", circle_name=" + circlename +"]";
	}
	
	//in microservices , how to implement the one to many mapping
	
	
}
