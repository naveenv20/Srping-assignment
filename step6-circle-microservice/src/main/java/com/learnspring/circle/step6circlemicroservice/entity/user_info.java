package com.learnspring.circle.step6circlemicroservice.entity;






public class user_info {
	
	

	private int id;
	

	private String firstname;
	
	
	private String lastname;
	
	
	private String password;
	
	
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
