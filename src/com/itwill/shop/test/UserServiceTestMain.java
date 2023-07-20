package com.itwill.shop.test;

import com.itwill.shop.userinfo.User;
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
		userService.noUserLogin("010-1234-5678");
		
		
		System.out.println("4.수정");
		result = userService.UpdateUser(new User("user8", "9999","9999","강수지","suzikang@naver.com", "F", "990811", "010-9999-9999","여성"));
		System.out.println("수정완료: " + userService.findUser("user8"));
		System.out.println("성공: "+ result);
	
		System.out.println("5.삭제");
		result = userService.remove("user11");
		System.out.println("성공: "+ result);
		
	}
}
