package com.learnspring.circle.step6messagemicroservice.entity;

public class messageinfobean {

	
	private message_info message_Info;
	private user_info senderinfo;
	private user_info receiverinfo;
	public user_info getSenderinfo() {
		return senderinfo;
	}
	public void setSenderinfo(user_info senderinfo) {
		this.senderinfo = senderinfo;
	}
	public user_info getReceiverinfo() {
		return receiverinfo;
	}
	public void setReceiverinfo(user_info receiverinfo) {
		this.receiverinfo = receiverinfo;
	}
	public message_info getMessage_Info() {
		return message_Info;
	}
	public void setMessage_Info(message_info message_Info) {
		this.message_Info = message_Info;
	}
	public user_info getUser_Info() {
		return senderinfo;
	}
	public void setUser_Info(user_info user_Info) {
		this.senderinfo = user_Info;
	}
	
	
	
	public messageinfobean(message_info message_Info, user_info senderinfo, user_info receiverinfo) {
		super();
		this.message_Info = message_Info;
		this.senderinfo = senderinfo;
		this.receiverinfo = receiverinfo;
	}
	public messageinfobean(){
		
	}
	
}
