package com.learnspring.usercircle.step6usercirclemicroservice.entity;

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
	
	
	
	@JoinColumn(name="user_id")
	private int user_Info;
	
	@JoinColumn(name="circle_id")
	private int theCircle;
	
	@Column(name="subscribe")
	private boolean subscribe;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public int getUser_Info() {
		return user_Info;
	}

	public void setUser_Info(int user_Info) {
		this.user_Info = user_Info;
	}

	public int getTheCircle() {
		return theCircle;
	}

	public void setTheCircle(int theCircle) {
		this.theCircle = theCircle;
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
