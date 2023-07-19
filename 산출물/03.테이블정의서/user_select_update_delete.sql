--update pk

update user set 
    user_pw='2872',
    user_pw_check='2872',
    user_name='신짱구', 
    user_email='짱구@email.com',
    user_email_send='T',
    user_phone='010-7777-7777'
    
where user_id='guard2';


update user set 
    user_pw='1717',
    user_pw_check='1717',
    user_name='맹구', 
    user_email='맹구@email.com',
    user_email_send='F',
    user_phone='010-4555-1111'
    
where user_id='user4';





--delete pk
delete from user where user_id='guard2';
delete from user where user_id='user1';


--select pk
select user_id, user_pw, user_pw_check, user_name, user_email, user_email_send, user_jumin, user_phone, user_gender from user where user_id='장희주';

--select All
select user_id, user_pw, user_pw_check, user_name, user_email, user_email_send, user_jumin, user_phone, user_gender  from user;


commit;

desc user;