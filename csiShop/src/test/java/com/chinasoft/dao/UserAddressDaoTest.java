package com.chinasoft.dao;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.UserAddress;

public class UserAddressDaoTest extends BaseTest{

	@Autowired
	UserAddressDao userAddressDao;
	
	@Test
	public void queryUserAddressTest() {
		List<UserAddress> list = userAddressDao.queryUserAddress();
		for(UserAddress userAddress:list) {
			System.out.println(userAddress.getContent());
		}
		assertEquals(2,list.size());
	}
	

	
}
