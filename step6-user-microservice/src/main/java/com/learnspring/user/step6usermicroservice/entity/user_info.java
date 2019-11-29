package com.learnspring.user.step6usermicroservice.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import com.fasterxml.jackson.annotation.JsonManagedReference;



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
	
	
	
/*
	@OneToMany(fetch = FetchType.EAGER,mappedBy="user_Info", 
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	
	private List<message_info> message_Info;
	
	
	@OneToMany(mappedBy="circle_user_Info", 
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	@Fetch(FetchMode.SELECT)
	private List<circle> cirCles;
	
	
	@OneToMany(mappedBy="sender_Info", 
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	@Fetch(FetchMode.SELECT)
	private List<user_inbox> userinboxsender;
	
	@OneToMany(mappedBy="receiver_Info", 
			cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
						CascadeType.REFRESH})
	@Fetch(FetchMode.SELECT)
	private List<user_inbox> userinboxreceiver;
	
	*/
	/*
	@JsonManagedReference
	public List<user_inbox> getUserinboxsender() {
		return userinboxsender;
	}

	public void setUserinboxsender(List<user_inbox> userinboxsender) {
		this.userinboxsender = userinboxsender;
	}

	@JsonManagedReference
	public List<user_inbox> getUserinboxreceiver() {
		return userinboxreceiver;
	}

	public void setUserinboxreceiver(List<user_inbox> userinboxreceiver) {
		this.userinboxreceiver = userinboxreceiver;
	}

	
	@JsonManagedReference
	public List<message_info> getMessage_Info() {
		return message_Info;
	}

	public void setMessage_Info(List<message_info> message_Info) {
		this.message_Info = message_Info;
	}

	@JsonManagedReference
	public List<circle> getCirCles() {
		return cirCles;
	}

	public void setCirCles(List<circle> cirCles) {
		this.cirCles = cirCles;
	}
*/
	

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

	

	
	//https://thoughts-on-java.org/entity-mappings-introduction-jpa-fetchtypes/
	
	
	

}
