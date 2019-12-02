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
	private String circle_name;
	
	@Column(name="createdby")
	private int createdby;
	
	
	
	
	
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
		return "circle**** [id=" + id + ", doj=" + doj + ", circle_name=" + circle_name + "]";
	}
	
	//in microservices , how to implement the one to many mapping
	
	
}
