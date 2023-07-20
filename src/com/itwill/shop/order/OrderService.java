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
	
	public OrderService(OrderDao orderDao, ProductDao productDao, CartDao cartDao) {
		this.orderDao = orderDao;
		this.productDao = productDao;
		this.cartDao = cartDao;
	}

	// 결제버튼 (cart -> order)
	public int create(String selectUserId) throws Exception{
		List<Cart> cartList=cartDao.findByUserId(selectUserId);
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		int o_tot_price=0;
		int oi_tot_count=0;
		for (Cart cart : cartList) {
			OrderItem orderItem=new OrderItem(0,cart.getCart_qty(),0, cart.getProduct());
			orderItemList.add(orderItem);
			o_tot_price+=orderItem.getOi_qty()*orderItem.getProduct().getP_price();
			oi_tot_count+=orderItem.getOi_qty();
		}
		String o_desc = orderItemList.get(0).getProduct().getP_name()+"외 "+(oi_tot_count-1)+" 개";
		Order newOrder=new Order(0,o_desc, null, o_tot_price, selectUserId,orderItemList);
		orderDao.insert(newOrder);
		cartDao.deleteByUserId(selectUserId);
		return 0;
	}  
	
	// 주문내역 (결제완료 조회)
	public ArrayList<Order> list(String selectUserId) throws Exception{
		return orderDao.findByUserId(selectUserId);
	}
	
	
}
