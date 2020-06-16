package com.chinasoft.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.UserDao;
import com.chinasoft.entity.User;
import com.chinasoft.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public User login(String name) {
		return null;
	}

	@Override
	public void updateUserStatus(User user) {
		userDao.updateUserStatus();
		
	}
	
	
}
