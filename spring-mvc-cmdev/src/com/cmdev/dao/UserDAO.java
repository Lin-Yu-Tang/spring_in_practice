package com.cmdev.dao;

import com.cmdev.entity.User;

public interface UserDAO {
	
	void saveUser(User user);
	
	User getUserByAccount(String account);
}
