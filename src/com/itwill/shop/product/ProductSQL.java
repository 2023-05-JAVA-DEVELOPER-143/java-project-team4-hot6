package com.itwill.shop.product;

public class ProductSQL {
	//product 전체출력
	public final static String PRODUCT_SELECT_ALL = "select * from product";
	//product 출력
	public final static String PRODUCT_SELECT_BY_NO = "select * from product where product_no=?";
	//product 이름에 따른 검색
	public final static String PRODUCT_SELECT_BY_NAME = "select * from product where product_name like '%?%'"; //'%'||?||'%'";
	//product 카테고리에 따른 검색
	public final static String PRODUCT_SELECT_BY_CATEGORY = "select product_category from product where product_category=?";
	//product 조회수 증가 기능
	public final static String PRODUCT_UPDATE_READ_COUNT = "update product set product_read_count=product_read_count+1 where product_no=?";	

	
}
