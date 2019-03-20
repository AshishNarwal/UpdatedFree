package com.cts.freelancer.service;

import com.cts.freelancer.bean.User;

public interface UserLoginService {

	public boolean authenticate(String emailId,String password);
	public boolean registerUser(User user);
}
