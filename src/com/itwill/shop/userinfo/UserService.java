package com.itwill.shop.userinfo;

import java.util.regex.Pattern;

public class UserService {
	
	private UserDao userDao;


	public UserService() throws Exception {
		userDao=new UserDao();
		
	}
	/*
	 * 회원가입
	 */
	public boolean addUser(User newUser) throws Exception {
		boolean isSuccess=false;

	
	 //아이디존재여부 
	 
		User findUser=userDao.findByUserId(newUser.getUserId());
		if(findUser==null) {
			int rowCount=userDao.insert(newUser);
			isSuccess=true;//아이디 중복 안될시에 
			
		}else {
			isSuccess=false;
		}
		
			return isSuccess;
			
		}
	
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

	public void noUserLogin(String name, String phoneNo) {
		/*
		 * true: 1
		 * false: 0
		 */
		
		String pattern2="";
		pattern2 = "^\\d{3}-\\d{3,4}-\\d{4}$";
		if(Pattern.matches(pattern2, phoneNo)) {
		    System.out.println("로그인 성공 ");
		} else {            
		    System.out.println("올바른 휴대전화 형식이 아닙니다.");
		}
		
	}
		/*
		 * 비회원 가입하기
		 */
	public int noUserInsert(User newUser) throws Exception {
		       int rowCount=userDao.insert1(newUser);
		       return rowCount;

	}
	/*
	 * 비회원 정보 업데이트 
	 */
	public int noUserUpdate(User newUser) throws Exception {
		int rowCount=userDao.update1(newUser);
		return rowCount;
	}
	
	
	/*
	 * 로그아웃 하기
	 */
	public String logout(String user) {
		return user = null;
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
	

	/*
	 * 아이디 중복체크
	 */
	public boolean isDuplicatedId(String userId) throws Exception {
		if(userDao.countByUserId(userId)>=1) {
			return true;
		}else {
			return false;
		}
	}
	/*
	 * 회원탈퇴
	 */
	public int remove(String userId) throws Exception {
		return userDao.delete(userId);
	}
	
}

