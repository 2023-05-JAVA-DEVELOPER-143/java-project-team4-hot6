package com.itwill.shop.product;

public class productDaoTest {

	public static void main(String[] args) throws Exception{
		ProductDao productDao=new ProductDao();
		//product 전체출력	
		System.out.println(productDao.findAll());
		//product 번호에 따른 검색
		System.out.println(productDao.findByProductNo(1));
		//product 이름에 따른 검색
		System.out.println(productDao.findByProductName(""));
		//product 카테고리에 따른 검색
		System.out.println(productDao.findByProductCategory("요리"));
		//product 조회수 증가 기능
		System.out.println(productDao.UpdateProductReadCount(1));
	}

}
