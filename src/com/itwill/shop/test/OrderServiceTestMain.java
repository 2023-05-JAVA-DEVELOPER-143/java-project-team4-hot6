package com.itwill.shop.test;

import com.itwill.shop.order.OrderService;

public class OrderServiceTestMain {

	public static void main(String[] args) throws Exception {
		OrderService orderService = new OrderService();
		
		System.out.println(orderService.list("guard1"));
		
	}

}
