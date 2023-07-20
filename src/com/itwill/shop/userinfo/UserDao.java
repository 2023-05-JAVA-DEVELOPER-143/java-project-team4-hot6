package com.itwill.shop.userinfo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;



import com.itwill.shop.common.DataSource;
import com.itwill.shop.user.UserSQL;

public class UserDao {

	private DataSource dataSource;
	public UserDao() throws Exception {
		dataSource = new DataSource();
	}
	/*
	 * insert
	 */
	public int insert(User newuser) throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt = con.prepareStatement(UserSQL.USER_INSERT);
		pstmt.setString(1,newuser.getUserId());
		pstmt.setString(2,newuser.getUserPw());
		pstmt.setString(3,newuser.getUserPwCheck());
		pstmt.setString(4,newuser.getUserName());
		pstmt.setString(5,newuser.getUserEmail());
		pstmt.setString(6,newuser.getUserEmailSend());
		pstmt.setString(7,newuser.getUserJumin());
		pstmt.setString(8,newuser.getUserPhone());
		pstmt.setString(9,newuser.getUserGender());
		int insertRowCount=pstmt.executeUpdate();
		return insertRowCount;
		
	}
	/*
	 * update
	 */
	public int update(User updateUser) throws Exception {
			Connection con=dataSource.getConnection();
			PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_UPDATE);
			pstmt.setString(1,updateUser.getUserPw());
			pstmt.setString(2, updateUser.getUserPwCheck());
			pstmt.setString(3,updateUser.getUserName());
			pstmt.setString(4,updateUser.getUserEmail());
			pstmt.setString(5, updateUser.getUserEmailSend());
			pstmt.setString(6, updateUser.getUserPhone());
			pstmt.setString(7,updateUser.getUserId());
			int updateRowCount=pstmt.executeUpdate();
			return updateRowCount;
			
		}
	/*
	 * delete
	 */
	
	
	public int delete(String user_id) throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_DELETE);
		pstmt.setString(1, user_id);
		int deleteRowCount=pstmt.executeUpdate();
		return deleteRowCount;
	}
	
	
	
	
	
	
		/*
		 * select
		 */
	public User findByUserId(String user_id)throws Exception {
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_SELECT_BY_ID);
		pstmt.setString(1,user_id);
		ResultSet rs=pstmt.executeQuery();
		
		User findUser=null;
		if(rs.next()) {
			findUser=new User( 
						rs.getString("user_id"),
						rs.getString("user_pw"),
						rs.getString("user_pw"),
						rs.getString("user_pw_check"),
						rs.getString("user_name"),
						rs.getString("user_email"),
						rs.getString("user_email_send"),
						rs.getString("user_jumin"),
						rs.getString("user_gender")
						
					);
		}
		return findUser;
	}
	
	  /*
	   * selectAll
	   */
	public ArrayList<User> findAll() throws Exception{
		Connection con = dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_SELECT_ALL);
		ResultSet rs=pstmt.executeQuery();
		ArrayList<User> userList=new ArrayList<User>();
		while(rs.next()) {
			userList.add(new User(
					rs.getString("user_id"),
					rs.getString("user_pw"),
					rs.getString("user_pw"),
					rs.getString("user_pw_check"),
					rs.getString("user_name"),
					rs.getString("user_email"),
					rs.getString("user_email_send"),
					rs.getString("user_jumin"),
					rs.getString("user_gender"))
					 );
		}
		return userList;
	}
	
	public int countByUserId(String userId) throws Exception {
		Connection con=dataSource.getConnection();
		PreparedStatement pstmt=con.prepareStatement(UserSQL.USER_SELECT_BY_NO_COUNT);
		pstmt.setString(1, userId);
		ResultSet rs=pstmt.executeQuery();
		rs.next();
		int userCount = rs.getInt(1);
		return userCount;
		
	}
}