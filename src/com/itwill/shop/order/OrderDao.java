package com.itwill.shop.order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.itwill.shop.common.DataSource;

public class OrderDao {
	private DataSource dataSource;
	public OrderDao() throws Exception {
		dataSource = new DataSource();
	}
	
	//주문 생성
	public int insert(Order order) throws Exception {
		Connection con = dataSource.getConnection();
		int insertRowCount;
//		try {
		PreparedStatement pstmt1 = con.prepareStatement(OrderSQL.ORDER_INSERT);
		pstmt1.setString(1, order.getOrderName());
		pstmt1.setString(2, order.getOrderPhone());
		pstmt1.setInt(3, order.getOrderPrice());
		pstmt1.setString(4, order.getUserId());
		insertRowCount = pstmt1.executeUpdate();
		
		PreparedStatement pstmt2 = con.prepareStatement(OrderSQL.ORDERITEM_INSERT);
		for(OrderItem orderItem : order.getOrderItemList()) {
			pstmt2.setInt(1, orderItem.getOiQty());
			pstmt2.setInt(2, orderItem.getProduct().getProduct_no());
			pstmt2.executeUpdate();
		}
//		con.commit();
//		} catch (Exception e) {
//			e.printStackTrace();
//			con.rollback();
//			throw e;
//		} finally {
//			if(con != null) con.close();
//		}
		return insertRowCount;
	}
	
	public int deleteByUserId(String selectUserId) throws Exception {
		Connection con=null;
		PreparedStatement pstmt=null;
		int rowCount;
		try {
			con=dataSource.getConnection();
			con.setAutoCommit(false);
			pstmt=con.prepareStatement(OrderSQL.ORDER_DELETE_BY_USERID);
			pstmt.setString(1, selectUserId);
			rowCount = pstmt.executeUpdate();
			con.commit();
		}catch (Exception e) {
			con.rollback();
			e.printStackTrace();
			throw e;
		}finally {
			if(con!=null)con.close();
		}
		return rowCount;
	}
	
	public ArrayList<Order> findByUserId(String selectUserId) throws Exception{
		ArrayList<Order> orderList=new ArrayList<Order>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			con=dataSource.getConnection();
			pstmt=con.prepareStatement(OrderSQL.ORDER_SELECT_BY_USERID);
			pstmt.setString(1,selectUserId);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				orderList.add(new Order(rs.getInt("order_no"),
										rs.getString("order_name"),
								       rs.getString("order_phone"),
								       rs.getInt("order_price"),
								       rs.getDate("order_date"),
								       rs.getString("user_id"),
								       null));
			}
		}finally {
			if(con != null) {
				con.close();
			}
		}
		return orderList;
	}
	
	
	
}
