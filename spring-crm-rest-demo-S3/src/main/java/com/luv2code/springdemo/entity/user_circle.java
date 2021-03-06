package com.luv2code.springdemo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_circle")
public class user_circle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	
	public user_circle(){
		
	}
	
	
	@ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="user_id")
	private user_info user_Info;
	
	

	@ManyToOne(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH})
	@JoinColumn(name="circle_id")
	private circle theCircle;
	
	@Column(name="subscribe")
	private boolean subscribe;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public user_info getUser_Info() {
		return user_Info;
	}

	public void setUser_Info(user_info user_info) {
		user_Info = user_info;
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

	@Override
	public String toString() {
		return "user_circle [id=" + id + ", User_info=" + user_Info + ", Circle=" + theCircle + ", subscribe=" + subscribe
				+ "]";
	}

		
	
}
