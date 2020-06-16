package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.UserOrderDao;
import com.chinasoft.entity.UserOrder;
import com.chinasoft.service.UserOrderService;

@Service
public class UserOrderServiceImpl implements UserOrderService{

	@Autowired
	private UserOrderDao userOrderDao;
	
	@Override
	public List<UserOrder> getUserOrderList() {
		return userOrderDao.queryOrderList();
	}

	@Override
	public void updateUserOrderStatus() {
		UserOrder userOrder = new UserOrder();
		userOrderDao.updatestatus(userOrder);
		
	}

	@Override
	public void updateUserOrderType() {
		UserOrder userOrder = new UserOrder();
		userOrderDao.updateorderType(userOrder);
		
	}

}
