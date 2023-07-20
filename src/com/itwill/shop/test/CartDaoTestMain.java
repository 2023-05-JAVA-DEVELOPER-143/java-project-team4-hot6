package com.itwill.shop.test;

import java.sql.Date;

import com.itwill.shop.cart.Cart;
import com.itwill.shop.cart.CartDao;
import com.itwill.shop.product.Product;

public class CartDaoTestMain {
	public static void main(String[] args) throws Exception  {
		CartDao cartDao=new CartDao();
		System.out.println("1.insert");
		Cart addCart=new Cart(0, 1, "guard3",
				new Product(1, new Date(0), "공예", "축구수업", 5000, "재밌는 수업", "/images", 0));
		
		int rowCount = -999;
		
		rowCount = cartDao.insert(addCart);
		System.out.println(">>" + rowCount);
		
	}
}
