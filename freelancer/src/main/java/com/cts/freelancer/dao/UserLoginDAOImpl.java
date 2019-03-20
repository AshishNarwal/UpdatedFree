package com.cts.freelancer.dao;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.cts.freelancer.bean.User;


@Repository("userLoginDAO")
public class UserLoginDAOImpl implements UserLoginDAO{

	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;

	@Transactional
	public boolean authenticate(String emailId, String password) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("from User where emailId=? and password=?");
		query.setParameter(0,emailId);
		query.setParameter(1, password);
		User user=(User)query.getSingleResult();
		if(user==null)
		return false;
		else
			return true;
	}

    @Transactional
	public boolean registerUser(User user) {
		// TODO Auto-generated method stub
    	Session session=null;
    	
    	try{
    		session=sessionFactory.getCurrentSession();
    		session.save(user);
    		return true;
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    		return false;
    	}
	
	}
}
