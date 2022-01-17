package com.cmdev.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cmdev.dao.UserDAO;
import com.cmdev.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDao;
	
	
	@Override
	@Transactional
	public void saveUser(User user) {
		userDao.saveUser(user);
	}


	@Override
	@Transactional
	public User getUserByAccount(String account) {
		User user = userDao.getUserByAccount(account);
		return user;
	}

}
