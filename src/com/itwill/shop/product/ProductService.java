package com.itwill.shop.product;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;

public class ProductService {
	private ProductDao productDao;
	public ProductService() throws Exception{
		productDao=new ProductDao();
	}
	/*
	 * product 전체출력
	 */
	//public List<Product> productList() throws Exception{
	public List<Product> productList() throws Exception{
		return productDao.findAll();
	}
	/*
	 *  product 번호에 따른 출력
	 */
	public Product findByPrimaryKey() throws Exception{
		return productDao.findByPrimaryKey(0);
	}
	/*
	 *  product 이름에 따른 검색
	 */
	public Product findByKeyword() throws Exception{
		return productDao.findByKeyword(null);
	}
	/*
	 *  product 카테고리에 따른 검색
	 */
	public Product findByCategory() throws Exception{
		return productDao.findByCategory(null);
	}
	/*
	 *  product 조회수 증가 기능
	 */
	public Product updateByReadCount() throws Exception{
		//return pro
	}
}