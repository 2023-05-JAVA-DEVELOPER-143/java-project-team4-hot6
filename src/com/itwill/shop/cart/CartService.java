package com.itwill.shop.cart;

import java.util.List;

public class CartService {
	private CartDao cartDao;
	public CartService() throws Exception {
		cartDao=new CartDao();
	}
	
	//카트 수량 변경 수정
	public int updateCart(int cart_no,int cart_qty) throws Exception {
		return cartDao.updateByCartNo(cart_no, cart_qty);
	}
	
	//카트보기
	public List<Cart> getCartItemByUserId(String user_id) throws Exception {
		return cartDao.findByUserId(user_id);
	}
	
	//카트아이템 1개보기
	public Cart getCartItemByCartNo(int cart_no) throws Exception {
		return cartDao.findByCartNo(cart_no);
	}
	
	//카트 아이템 1개 삭제
	public int deleteCartItemByCartNo(int cart_no) throws Exception {
		return cartDao.deleteByCartNo(cart_no);
	}
	
	//카트삭제
	public int deleteCartItemByUserId(String user_id) throws Exception {
		return cartDao.deleteByCartUserId(user_id);
		
	}
	
	
}
