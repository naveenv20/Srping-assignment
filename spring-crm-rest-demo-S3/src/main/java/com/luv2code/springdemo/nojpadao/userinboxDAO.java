package com.luv2code.springdemo.nojpadao;

import java.util.List;

import com.luv2code.springdemo.entity.user_inbox;

public interface userinboxDAO {

	public List<user_inbox> getinboxdata(int receiverId) ;

}
