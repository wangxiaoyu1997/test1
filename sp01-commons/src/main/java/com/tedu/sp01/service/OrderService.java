package com.tedu.sp01.service;

import com.tedu.sp01.pojo.Order;

public interface OrderService {
	//根据订单id获取订单
	Order getOrder(String orderId);
	//添加订单
	void addOrder(Order order);
	
	
	
}
