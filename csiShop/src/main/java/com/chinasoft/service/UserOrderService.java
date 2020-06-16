package com.chinasoft.service;

import java.util.List;

import com.chinasoft.entity.UserOrder;

public interface UserOrderService {
	//后台获取所有订单
	 List<UserOrder> getUserOrderList();
	 
	//后台修改用户订单状态
	 void updateUserOrderStatus();
	 
	//后台修改用户订单配送方式
	 void updateUserOrderType();
	 
}
