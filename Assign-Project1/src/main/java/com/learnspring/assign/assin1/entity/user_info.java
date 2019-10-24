package com.learnspring.assign.assin1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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

	@OneToOne(mappedBy="user_Info", 
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	private message_info message_Info;
	
	
	public message_info getMessage_Info() {
		return message_Info;
	}

	public void setMessage_Info(message_info message_Info) {
		this.message_Info = message_Info;
	}

	@OneToOne(mappedBy="circle_user_Info", 
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	private circle cirCle;
	
	
	
	
	
	public circle getCirCle() {
		return cirCle;
	}

	public void setCirCle(circle cirCle) {
		this.cirCle = cirCle;
	}

	public message_info getMessage_info() {
		return message_Info;
	}

	public void setMessage_info(message_info message_info) {
		this.message_Info = message_info;
	}

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
				+ ", userid=" + userid + ", message_Info=" + message_Info + ", cirCle=" + cirCle + "]";
	}

	
	
	
	
	

}
