package com.itwill.shop.product;

public class ProductSQL {
	public final static String PRODUCT_SELECT_ALL = "select * from product";
	public final static String PRODUCT_SELECT_BY_NO = "select * from product where product_no=?";
	
	public final static String PRODUCT_SELECT_BY_NAME = "select * from product where product_name like '%?%'";
	public final static String PRODUCT_SELECT_BY_CATEGORY = "select product_category from product where product_category=?";
	
	public final static String PRODUCT_UPDATE_READ_COUNT = "update product set product_read_count=product_read_count+1 where product_no=?";	
	
}
