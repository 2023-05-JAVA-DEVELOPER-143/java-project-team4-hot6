package com.itwill.shop.order;

import java.util.ArrayList;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartDao;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductDao;
import com.itwill.shop.userinfo.UserDao;

public class OrderService {
	private OrderDao orderDao;
	private ProductDao productDao;
	private UserDao userDao;
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

	// 주문생성 (카트 -> 결제)
	public int create(String sUserId, String[] cart_item_noStr_array) throws Exception {
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		int o_tot_price=0;
		for(int i =0;i<cart_item_noStr_array.length;i++) {
			Cart cartItem = cartDao.findByCartNo(Integer.parseInt(cart_item_noStr_array[i]));
			OrderItem orderItem=new OrderItem(0, cartItem.getCart_qty(),cartItem.getProduct(), 0);
			orderItemList.add(orderItem);
			o_tot_price+=orderItem.getOiQty()*orderItem.getProduct().getProduct_price();
		}
		Order newOrder=new Order(0, sUserId, userDao.findByUserId(sUserId).getUserPhone(), o_tot_price, null, sUserId, orderItemList);
		orderDao.insert(newOrder);
		for(int i =0;i<cart_item_noStr_array.length;i++) {
			cartDao.deleteByCartNo(Integer.parseInt(cart_item_noStr_array[i]));
		}
		return 0;
	}
	
	// 상품1개 바로결제
	public int create(String sUserId, int p_no, int oi_qty) throws Exception{
		Product product=productDao.findByPrimaryKey(p_no);
		OrderItem orderItem=new OrderItem(0, oi_qty, product, 0);
		ArrayList<OrderItem> orderItemList=new ArrayList<OrderItem>();
		orderItemList.add(orderItem);
		Order newOrder=
				new Order(0,
						sUserId, 
						userDao.findByUserId(sUserId).getUserPhone(),
						orderItemList.get(0).getOiQty()*orderItemList.get(0).getProduct().getProduct_price(),
						null,
						sUserId,
						orderItemList);
		return orderDao.insert(newOrder);
	}
	
	
	// 주문내역 (결제완료 조회)
	public ArrayList<Order> list(String selectUserId) throws Exception{
		return orderDao.findByUserId(selectUserId);
	}
	
	public ArrayList<OrderItem> oiList(String selectUserId) throws Exception{
		return orderDao.orderItemList(selectUserId);
	}
	
	
}
