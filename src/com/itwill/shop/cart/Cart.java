package com.itwill.shop.cart;
/*
이름         널?       유형         
---------- -------- ---------- 
CART_NO    NOT NULL NUMBER(10) 
CART_QTY            NUMBER(10) 
USER_NO             NUMBER(10) FK
PRODUCT_NO          NUMBER(10) FK
*/
public class Cart {
	private int cart_no;
	private int cart_qty;
	private int user_no;
	private int product_no;
	
	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int cart_no, int cart_qty, int user_no, int product_no) {
		super();
		this.cart_no = cart_no;
		this.cart_qty = cart_qty;
		this.user_no = user_no;
		this.product_no = product_no;
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

	public int getUser_no() {
		return user_no;
	}

	public void setUser_no(int user_no) {
		this.user_no = user_no;
	}

	public int getProduct_no() {
		return product_no;
	}

	public void setProduct_no(int product_no) {
		this.product_no = product_no;
	}

	@Override
	public String toString() {
		return "Cart [cart_no=" + cart_no + ", cart_qty=" + cart_qty + ", user_no=" + user_no + ", product_no="
				+ product_no + "]";
	}
	
			
	
}
