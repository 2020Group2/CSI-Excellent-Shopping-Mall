package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.entity.UserAddress;

public interface UserAddressDao {

	//查询用户地址
	List<UserAddress> queryUserAddress();
	
	
}
