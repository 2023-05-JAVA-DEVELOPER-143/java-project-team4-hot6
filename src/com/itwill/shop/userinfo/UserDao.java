package com.itwill.shop.userinfo;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.itwill.shop.common.DataSource;

public class UserDao {

	private DataSource dataSource;
	public UserDao() throws Exception {
		dataSource = new DataSource();
	}
	/*
	 * insert
	 */
	public int insert() throws Exception {
		Connection con = dataSource.getConnection();;
		PreparedStatement pstmt = con.prepareStatement(UserSQl.)
	}
}
