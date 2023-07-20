package com.itwill.shop.test;

import java.sql.Date;
import java.util.ArrayList;

import com.itwill.shop.order.Order;
import com.itwill.shop.order.OrderDao;
import com.itwill.shop.order.OrderItem;
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductDao;

public class OrderDaoTestMain {
	public static void main(String[] args) throws Exception  {
		OrderDao orderDao = new OrderDao();
		
		// 아이디로 결제내역 조회
		System.out.println(orderDao.findByUserId("guard1"));

		// 상품에서 직접 주문
//		int p_qty=1;
//		int p_no=1;
//		ProductDao productDao=new ProductDao();
//		
//		
//		ArrayList<OrderItem> jumunDetailList=new ArrayList<OrderItem>();
//		jumunDetailList.add(new OrderItem(0, p_qty, new Product(p_no, new Date(0), "미술", "축구", "세모발", "/images.jpg", 0), p_no));
//		Order newJumun=new Order(0, "구매자", "번호", 5000, new Date(0), "guard1", jumunDetailList);
//		
//		System.out.println(orderDao.insert(newJumun));
		
		// 장바구니에서 결제
	
	}
}
