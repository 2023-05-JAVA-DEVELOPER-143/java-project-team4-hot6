package com.itwill.shop.cart;

import java.sql.Date;

import com.itwill.shop.product.Product;
import com.itwill.shop.userinfo.User;

/*
이름         널?       유형            
---------- -------- ------------- 
CART_NO    NOT NULL NUMBER(10)    PK
CART_QTY            NUMBER(10)    
USER_ID             VARCHAR2(100) FK
PRODUCT_NO          NUMBER(10)    FK
*/
public class Cart {
	private int cart_no;
	private int cart_qty;
	private int product_no;
	private User user;
	private Product product;
	
	public Cart() {
		
	}

	public Cart(int cart_no, int cart_qty, int product_no, User user, Product product) {
		super();
		this.cart_no = cart_no;
		this.cart_qty = cart_qty;
		this.product_no = product_no;
		this.user = user;
		this.product = product;
	}

	public int getCart_no() {
		return cart_no;
	}

	public void setCart_no(int cart_no) {
		this.cart_no = cart_no;
	}

	public int getCart_qty() {
		return cart_qty;
	}

	public void setCart_qty(int cart_qty) {
		this.cart_qty = cart_qty;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [cart_no=" + cart_no + ", cart_qty=" + cart_qty + ", product_no=" + product_no + ", user=" + user
				+ ", product=" + product + "]";
	}
	

	
	
			
	
}
