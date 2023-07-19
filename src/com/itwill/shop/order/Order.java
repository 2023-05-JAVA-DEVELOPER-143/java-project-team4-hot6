package com.itwill.shop.order;
/*
 이름          널?       유형            
----------- -------- ------------- 
ORDER_NO    NOT NULL NUMBER(10)    
ORDER_NAME           VARCHAR2(100) 
ORDER_PHONE          VARCHAR2(100) 
ORDER_PRICE          NUMBER(10)    
ORDER_DATE           DATE          
USER_ID              VARCHAR2(100) 
 */

import java.sql.Date;

public class Order {
	private int orderNo;
	private String orderName;
	private String orderPhone;
	private int orderPrice;
	private Date orderDate;
	private String userId;
	
	public Order(int orderNo, String orderName, String orderPhone, int orderPrice, Date orderDate, String userId) {
		super();
		this.orderNo = orderNo;
		this.orderName = orderName;
		this.orderPhone = orderPhone;
		this.orderPrice = orderPrice;
		this.orderDate = orderDate;
		this.userId = userId;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public String getOrderPhone() {
		return orderPhone;
	}
	public void setOrderPhone(String orderPhone) {
		this.orderPhone = orderPhone;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	@Override
	public String toString() {
		return "Order [orderNo=" + orderNo + ", orderName=" + orderName + ", orderPhone=" + orderPhone + ", orderPrice="
				+ orderPrice + ", orderDate=" + orderDate + ", userId=" + userId + "]";
	}
		

}
