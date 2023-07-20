package com.itwill.shop.userinfo;


public class UserService {
	
	private UserDao userDao;
	public UserService() throws Exception {
		userDao=new UserDao();
	}
	/*
	 * 회원가입
	 */
	public boolean addUser(User newUser) {
		boolean isSuccess=false;

	/*
	 * 아이디존재여부 
	 */
	User findUser=userDao.findByUserId(newUser.getUserId());
	if(findUser==null) {
		int rowCount=userDao.insert(newUser);
		isSuccess=true;//아이디 중복 안될시에 
		
	}else {
		isSuccess=false;
	}
	
		return isSuccess;
		
	}	
	
