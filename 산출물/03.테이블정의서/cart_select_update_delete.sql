--guard1 멤버한사람의  카트에 제품번호 존재여부
select count(*) as p_count from cart c join userinfo u on c.user_id=u.user_id where u.user_id='guard1' and c.product_no=1;

--guard1 멤버한사람의 카트아이템리스트
select * 
from cart c join userinfo u
on c.user_id=u.user_id 
join product p 
on p.product_no=c.product_no
where u.user_id='guard1';

--카트아이템 1개의 제품정보(guard1 멤버한사람)
select * from cart c join product p on c.product_no=p.product_no where cart_no=1 ;

--guard1 카트에 있는 1번제품의 수량증가
update cart set cart_qty=cart_qty+1 where user_id='guard1' and p_no=1;
--guard1 카트에 있는 cart_no 1번의 수량3개 수정
update cart set cart_qty=3 where cart_no=1

--guard1님 카트아이템1개삭제
delete from cart where cart_no=1;
--guard1님 카트아이템모두삭제
delete from cart where user_id='guard1';
