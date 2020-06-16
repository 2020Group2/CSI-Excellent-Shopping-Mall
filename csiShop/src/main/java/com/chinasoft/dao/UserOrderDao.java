package com.chinasoft.dao;

import java.util.List;

import com.chinasoft.entity.UserOrder;

public interface UserOrderDao {

	
	/**
	 * @return 后台查询所有的订单信息
	 */
	List<UserOrder> queryOrderList();
	
	/**
	 * @return 后台更新的订单状态
	 */
	void updatestatus(UserOrder userOrder);
	
	/**
	 * @return 后台更新的订单配送方式
	 */	
	void updateorderType(UserOrder userOrder);
	
}
