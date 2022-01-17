package com.cmdev.service;

import com.cmdev.entity.User;

public interface UserService {
	
	void saveUser(User user);
	
	User getUserByAccount(String account);
}
