package com.luv2code.springdemo.service;

import java.util.List;

import com.luv2code.springdemo.model.user_inbox;

public interface userinboxService {

	List<user_inbox> getusermesages(int theId);

}
