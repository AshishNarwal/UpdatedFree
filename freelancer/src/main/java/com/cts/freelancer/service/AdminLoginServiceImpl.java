package com.cts.freelancer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.freelancer.bean.Admin;
import com.cts.freelancer.dao.AdminLoginDAO;

@Service("adminLoginService")
@Transactional(propagation=Propagation.SUPPORTS)
public class AdminLoginServiceImpl implements AdminLoginService{
	
	@Autowired
	private AdminLoginDAO adminLogin;

	public boolean authenticate(String emailId, String password) {
		// TODO Auto-generated method stub
		return adminLogin.authenticate(emailId, password);
	}


	public boolean registerAdmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminLogin.registerAdmin(admin);
	}

}
