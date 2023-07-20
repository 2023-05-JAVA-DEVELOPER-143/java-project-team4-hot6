package com.itwill.shop.order;

import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartDao;
import com.itwill.shop.product.ProductDao;

public class OrderService {
	private OrderDao orderDao;
	private ProductDao productDao;
	private CartDao cartDao;
	
	public OrderService() throws Exception {
		orderDao=new OrderDao();
		productDao = new ProductDao();
		cartDao = new CartDao();
	}
	
	public OrderService(OrderDao orderDao, ProductDao productDao, CartDao cartDao) throws Exception{
		this.orderDao = orderDao;
		this.productDao = productDao;
		this.cartDao = cartDao;
	}

	// 결제버튼 (cart -> order_item -> order)
	
	
	// 주문내역 (결제완료 조회)
	public ArrayList<Order> list(String selectUserId) throws Exception{
		return orderDao.findByUserId(selectUserId);
	}
	
	
}
