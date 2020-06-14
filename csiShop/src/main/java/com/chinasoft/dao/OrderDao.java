package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.entity.Order;

public interface OrderDao {
	List<Order> queryOrder();
}
