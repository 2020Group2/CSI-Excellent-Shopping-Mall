package com.chinasoft.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinasoft.dao.OrderDao;
import com.chinasoft.entity.Order;
import com.chinasoft.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderDao orderDao;
	public List<Order> getOrderList() {

		return orderDao.queryOrder();
	}

}
