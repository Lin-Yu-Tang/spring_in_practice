package com.cmdev.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cmdev.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory factory;
	
	
	
	@Override
	public void saveUser(User user) {
		Session session = factory.getCurrentSession();
		
		session.save(user);
	}



	@Override
	public User getUserByAccount(String account) {
		Session session = factory.getCurrentSession();
		
		User user = (User) session
				.createQuery("select u from User u where u.account='"+ account+"'")
				.getSingleResult();
		
		
		return user;
	}

}
