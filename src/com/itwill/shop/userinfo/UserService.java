package com.itwill.shop.userinfo;

import java.util.List;

public class UserService {
	
	private UserDao userDao;
	
	public UserService() throws Exception {
		userDao = new UserDao();
	}
	/*
	 * 회원가입
	 */
	
	
	/*
	 * 로그인하기
	 */
	
	public int login(String userId, String userPassword) throws Exception {
		/*
		 * 0:실패
		 * 1:성공
		 */
		int result = 0;
		if(userDao.countByUserId(userId)==1) {
			//아이디가 존재하는 경우
			User loginId = userDao.findByUserId(userId);
			if(loginId.getUserPw().equals(userPassword)){
				//비밀번호가 일치하는경우
				result = 1;
			}else {
				result = 0;
			}
		}else {
			//아이디가 존재하지 않을경우
			result=0;
		}
		return result;
	}
	/*
	 * 비회원 로그인하기
	 */
	public int noUserLogin(String phoneNo) {
		/*
		 * 0: 실패
		 * 1: 성공
		 */
		int result = 0;
		if(phoneNo.equals("")) {
			result =1;
		}else {
			result=0;
		}
		return result;
	}
	
	/*
	 * 로그아웃 하기
	 */
	public void logout() {
		
	}
	
	/*
	 * 로그인한 회원정보 보기
	 */
	public User findUser(String userId) throws Exception {
		User userInfo = userDao.findByUserId(userId);
		return userInfo;
	}
	/*
	 * 회원수정
	 */
	public int UpdateUser(User user) throws Exception {
		return userDao.update(user);
		
	}
	
	
	
}
