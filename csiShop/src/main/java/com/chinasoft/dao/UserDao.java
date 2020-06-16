package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.entity.User;

public interface UserDao {

	//后台修改用户状态 
	List<User> updateUserStatus();
	
	
}