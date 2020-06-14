package com.chinasoft.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.UserOrder;

public class UserOrderDaoTest extends BaseTest{
	
	@Autowired
	UserOrderDao orderDao;
	
	@Test
	public void queryOrderListTest() {
		List<UserOrder> orderList = orderDao.queryOrderList();
		assertEquals(true,orderList.size()!=0);
		for(UserOrder order:orderList) {
			System.out.println(order.getUser().getName()+"的关于"+order.getProduct().getProductName()+"的订单");
		}
		
	}
	
	
}
