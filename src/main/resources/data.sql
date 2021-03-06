create table user(
id integer not null, 
user_id varchar(255), 
email_id varchar(255),
primary key(id)
);

INSERT INTO USER(ID, USER_ID, EMAIL_ID) 
VALUES(1, 'sunil', 'sunil@gmail.com');
INSERT INTO USER(ID, USER_ID, EMAIL_ID) 
VALUES(2, 'sahil', 'sahil@gmail.com');
INSERT INTO USER(ID, USER_ID, EMAIL_ID) 
VALUES(3, 'mohit', 'mohit@gmail.com');
INSERT INTO USER(ID, USER_ID, EMAIL_ID) 
VALUES(4, 'pankaj', 'pankaj@gmail.com');
INSERT INTO USER(ID, USER_ID, EMAIL_ID) 
VALUES(5, 'anil', 'anil@gmail.com');


create table purchase(
id integer not null, 
prod_name varchar(255) not null, 
prod_price varchar(255) not null,
category varchar(255),
purchase_date DATE,
primary key(id)
);
INSERT INTO PURCHASE(ID, PROD_NAME, PROD_PRICE, CATEGORY, PURCHASE_DATE) 
VALUES (1, 'Nike', '12000', 'Sport Shoes', SYSDATE());
INSERT INTO PURCHASE(ID, PROD_NAME, PROD_PRICE, CATEGORY, PURCHASE_DATE) 
VALUES (2, 'Puma', '3000', 'Sport Shoes', TO_DATE('2021-07-05', 'yyyy-MM-dd'));
INSERT INTO PURCHASE(ID, PROD_NAME, PROD_PRICE, CATEGORY, PURCHASE_DATE) 
VALUES (3, 'Sniker', '2200', 'Casual Shoes', SYSDATE());
INSERT INTO PURCHASE(ID, PROD_NAME, PROD_PRICE, CATEGORY, PURCHASE_DATE) 
VALUES (4, 'Nike', '2500', 'Casual Shoes', SYSDATE());
INSERT INTO PURCHASE(ID, PROD_NAME, PROD_PRICE, CATEGORY, PURCHASE_DATE) 
VALUES (5, 'Bata', '1250', 'Formal Shoes', TO_DATE('2021-07-10', 'yyyy-MM-dd'));




