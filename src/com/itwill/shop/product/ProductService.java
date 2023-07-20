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


	public List<Product> productList() throws Exception{
		return productDao.findAll();
	}
	/*
	 *  product 번호에 따른 출력
	 */

	public Product productDetail(int product_no) throws Exception{

		return productDao.findByPrimaryKey(product_no);
	}
	/*
	 *  product 이름에 따른 검색
	 */

	public Product productSearch(String product_name) throws Exception{
		return productDao.findByKeyword(product_name);
	}
	
	/*
	 *  product 카테고리에 따른 검색
	 */

	public Product productCategorySearch(String product_category) throws Exception{
		return productDao.findByCategory(product_category);
	}
	
	/*
	 *  product 조회수 증가 기능
	 */

	private int productReadCount(int product_no) throws Exception{
		return productDao.updateByReadCount(product_no);

	
	}
}