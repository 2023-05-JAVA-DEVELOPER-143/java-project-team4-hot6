package com.itwill.shop.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.itwill.shop.common.DataSource;


public class ProductDao {

	private DataSource dataSource;
	public ProductDao() throws Exception {
		dataSource = new DataSource();
		}
/*
 * product 전체출력
 */
	public List<Product> findAll() throws Exception{
		List<Product> productList=new ArrayList<Product>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Product product=new Product(
							rs.getInt("product_no"),
							rs.getString("product_start_date"),
							rs.getString("product_category"),
							rs.getString("product_name"),
							rs.getString("product_image"),
							rs.getInt("product_read_count"));
			productList.add(product);
		}
		return productList;
	}
/*
 *  product 번호에 따른 출력
 */
	public Product findByProductNo(int product_no) throws Exception{
		Product product=null;
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_SELECT_BY_NO);
		pstmt.setInt(1, product_no);
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()) {
			product= 
					new Product(
							rs.getInt(product_no);
							rs.
					)
		}
		return product;
	}
/*
 *  product 이름에 따른 검색
 */
	
/*
 *  product 이름에 따른 검색
 */
	
/*
 *  product 카테고리에 따른 검색
 */
	
/*
 *  product 조회수 증가 기능
 */
}
