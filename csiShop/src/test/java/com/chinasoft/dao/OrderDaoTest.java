package com.chinasoft.dao;


import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.Order;

public class OrderDaoTest extends BaseTest{

	@Autowired
	OrderDao orderDao;
	
	@Test
	public void queryUserAddressTest() {
		List<Order> list = orderDao.queryOrder();
		for(Order order:list) {
			System.out.println(order);
		}
		assertEquals(2,list.size());
	}
	

	
}
