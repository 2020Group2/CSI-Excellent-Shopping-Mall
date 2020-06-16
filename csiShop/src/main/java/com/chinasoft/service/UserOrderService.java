package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.UserOrder;

public interface UserOrderService {

	 List<UserOrder> getUserOrderList();
	 void updateUserOrderStatus();
	 void updateUserOrderType();
	 
}
