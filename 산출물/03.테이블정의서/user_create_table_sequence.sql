DROP TABLE userinfo CASCADE CONSTRAINTS;

CREATE TABLE userinfo(
		user_no                       		NUMBER(10)		 NULL ,
		user_pw                       		VARCHAR2(100)		 NULL ,
		user_pw_check                 		VARCHAR2(100)		 NULL ,
		user_name                     		VARCHAR2(100)		 NULL ,
		user_email                    		VARCHAR2(100)		 NULL ,
		user_email_send               		VARCHAR2(100)		 NULL ,
		user_jumin                    		VARCHAR2(100)		 NULL ,
		user_phone                    		VARCHAR2(100)		 NULL ,
		user_gender                   		VARCHAR2(100)		 NULL 
);


DROP SEQUENCE userinfo_user_no_SEQ;

CREATE SEQUENCE userinfo_user_no_SEQ NOMAXVALUE NOCACHE NOORDER NOCYCLE;