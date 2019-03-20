package com.cts.freelancer.dao;

import com.cts.freelancer.bean.Admin;

public interface AdminLoginDAO {
	public boolean authenticate(String emailId,String password);
	public boolean registerAdmin(Admin admin);
}
