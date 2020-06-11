package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.UserAddressDao;
import com.chinasoft.entity.UserAddress;
import com.chinasoft.service.UserAddressService;

@Service
public class UserAddressServiceImpl implements UserAddressService{

	@Autowired
	private UserAddressDao userAddressDao;
	
	public List<UserAddress> getUserAddressList() {	
		return userAddressDao.queryUserAddress();
	}

}
