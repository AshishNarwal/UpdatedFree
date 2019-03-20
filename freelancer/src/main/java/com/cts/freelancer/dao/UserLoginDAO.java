package com.cts.freelancer.dao;

import com.cts.freelancer.bean.User;

public interface UserLoginDAO {

	public boolean authenticate(String emailId,String password);
	public boolean registerUser(User user);
}
