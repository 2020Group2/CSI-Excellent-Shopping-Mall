package com.chinasoft.service;
 
import com.chinasoft.entity.User;;

public interface UserService {
    //登录
	public User login(String name);
	
	//后台修改用户状态 
	void updateUserStatus(User user);
	
}
