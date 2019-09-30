package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//根据订单id获取商品
	List<Item> getItems(String orderId);
	//减少库存数量
	void decreaseNumbers(List<Item>list);
	
	
}
