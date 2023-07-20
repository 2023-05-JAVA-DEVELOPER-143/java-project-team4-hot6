package com.itwill.shop.test;

import com.itwill.shop.userinfo.UserService;

public class UserServiceTestMain {
	public static void main(String[] args) throws Exception  {
		
		UserService userService = new UserService();
		System.out.println("1.회원가입");
		
		System.out.println("2.로그인");
		
		int result = userService.login("user1", "1111");
		System.out.println("성공: " + result);
		
		result = userService.login("aaaa", "aaaa");
		System.out.println("실패: " + result);
		
		System.out.println("3.비회원 로그인");
		result = userService.noUserLogin("01012345678");
		System.out.println(result);
		
		System.out.println("4.수정");
		System.out.println("5.삭제");
		
	}
}
