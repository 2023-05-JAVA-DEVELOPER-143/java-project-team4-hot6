package com.itwill.shop.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import com.itwill.shop.common.DataSource;


public class ProductDao {

	private DataSource dataSource;
	public ProductDao() throws Exception {
		dataSource = new DataSource();
		}
/*
 * selectAll
 */
	public List<Product> findAll() throws Exception{
		List<Product> productList=new ArrayList<Product>();
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(ProductSQL.PRODUCT_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Product product=new Product(
							rs.getInt("product_no"),
							rs.getDate("product_start_date"),
							rs.getString("product_category"),
							rs.getString("product_name"),
							rs.getString("product_image"),
							rs.getInt("product_read_count"));
			productList.add(product);
		}
		return productList;
	}
}
