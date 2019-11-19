package com.luv2code.springdemo.nojpadao;

import java.util.List;

import com.luv2code.springdemo.entity.circle;
import com.luv2code.springdemo.entity.message_info;
import com.luv2code.springdemo.entity.user_inbox;
import com.luv2code.springdemo.entity.user_info;





public interface TesttbDAO {
	
	


	
	
	public List<user_info> getUserdata();

	public List<message_info> getMessagedata();

	public List<user_inbox> getinboxdata();

	public user_info getuser(int theId);

	public void deleteUser(int theId);

	public void saveUser(user_info theUser);

}
