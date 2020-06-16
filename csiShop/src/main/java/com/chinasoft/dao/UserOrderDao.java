package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.entity.UserOrder;

public interface UserOrderDao {

	
	/**
	 * @return 后台查询所有的订单信息
	 */
	List<UserOrder> queryOrderList();
	
	void updatestatus(UserOrder userOrder);
	void updateorderType(UserOrder userOrder);
	
}
