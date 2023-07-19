--select

--전체 제품 리스트
select * from product

--제품 상세보기(상품 클릭시 상품 페이지로 이동)
select * from product where product_no=?;

--제품 검색
select * from product where product_name like '%*test%'

--조회수 최고 상품정보 제공

select * from product order by product_read_count desc;

--장바구니로의 이동

select * from product




