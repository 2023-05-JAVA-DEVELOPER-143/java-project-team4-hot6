package com.itwill.shop.test;

import com.itwill.shop.product.ProductService;

public class ProductServiceTestMain {
	public static void main(String[] args) throws Exception  {
		
		ProductService productService=new ProductService();
		System.out.println("1.selectAll:");
		System.out.println("  "+productService.findAll());
		System.out.println("2.findByPrimaryKey");
		System.out.println(productService.findByPrimaryKey(1));
		System.out.println("3.findByKeyword");
		System.out.println(productService.findByKeyword("[망원] 다양한 베이킹"));
		System.out.println("4.findByCategory");
		System.out.println(productService.findByCategory("미술"));
		System.out.println("5.updateByReadCount");
		//productDao.updateByReadCount(0);
		System.out.println(productService.updateByReadCount(0));
	}
}
