package com.learnspring.assign.assin1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_info")
public class user_info {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@Column(name="password")
	private String password;
	
	@Column(name="userid")
	private String userid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	
	public user_info() {
		
	}

	public user_info(String firstname, String lastname, String password, String userid) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.userid = userid;
	}

	@Override
	public String toString() {
		return "user_info [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", password=" + password
				+ ", userid=" + userid + "]";
	}
	
	
	
	

}
