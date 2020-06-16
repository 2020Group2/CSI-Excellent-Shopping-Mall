package com.chinasoft.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.chinasoft.BaseTest;
import com.chinasoft.entity.UserOrder;

public class UserOrderServiceTest extends BaseTest{
	@Autowired
	private UserOrderService userOrderService;
	
	@Test
	public void getUserOrderTest() {
		List<UserOrder> orderList = userOrderService.getUserOrderList();
		
		for(UserOrder order:orderList) {
			System.out.println(order.getUser().getName()+"的关于"+order.getProduct().getProductName()+"的订单"+" 地址："+order.getAddress().getContent());
		}
		
	}
	
}
