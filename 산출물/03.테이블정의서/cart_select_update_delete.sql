--select
select * from cart where cart_no=2;
select * from cart c join product p on c.product_no=p.product_no where cart_no=2;

--update
--상품 수량 증가
update cart set cart_qty=cart_qty+1 where cart_no=2;
--상품 수량 감소
update cart set cart_qty=cart_qty-1 where cart_no=2;

--delete
--cart 아이템 1개 삭제
delete from cart where cart_no=2;
--cart 아이템 모두삭제
delete from cart where user_id='guard1';


