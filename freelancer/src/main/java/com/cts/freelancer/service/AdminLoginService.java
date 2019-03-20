package com.cts.freelancer.service;

import com.cts.freelancer.bean.Admin;

public interface AdminLoginService {
	public boolean authenticate(String emailId,String password);
	public boolean registerAdmin(Admin admin);
}
