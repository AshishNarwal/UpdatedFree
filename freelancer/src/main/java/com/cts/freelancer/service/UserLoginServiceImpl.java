package com.cts.freelancer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.freelancer.bean.User;
import com.cts.freelancer.dao.UserLoginDAO;

@Service("userLoginService")
@Transactional(propagation=Propagation.SUPPORTS)
public class UserLoginServiceImpl implements UserLoginService{

	@Autowired
	UserLoginDAO userLogin;

	@Override
	public boolean authenticate(String emailId, String password) {
		// TODO Auto-generated method stub
		return userLogin.authenticate(emailId, password);
	}

	@Override
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
		return userLogin.registerUser(user);
	}
}
