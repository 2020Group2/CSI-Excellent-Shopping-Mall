package com.chinasoft.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.UserAddress;

public class UserAddressServiceTest extends BaseTest{
	@Autowired
	private UserAddressService userAddressService;
	
	@Test
	public void getUserAddressListTest() {
		List<UserAddress> list = userAddressService.getUserAddressList();
		assertEquals("2",list.get(0).getContent());
		
	}
	
}
