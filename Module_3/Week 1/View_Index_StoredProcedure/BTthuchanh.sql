create database demo;
use demo;

create table products
	(id int primary key auto_increment ,
	productCode varchar(10) ,
    productName varchar(30),
    productPrice int,
    productAmount int,
    productDescription varchar(50),
    productStatus bit);
insert into products(productCode, productName, productPrice, productAmount, productDescription, productStatus) 
values ("A1", "A one" , 10, 2, "A model the first",  1);
insert into products(productCode, productName, productPrice, productAmount, productDescription, productStatus) 
values ("A2", "A two" , 12, 4, "A model the second",  0);
insert into products(productCode, productName, productPrice, productAmount, productDescription, productStatus) 
values ("B1", "B one" , 9, 6, "B model the first",  1);

create unique index code_index on products(productcode);
create unique index name_price_index on products(productname, productprice);
explain  select * from products where productcode = "A1";
explain select * from products where productname = "A one" AND productprice = 10;

create view product_view as
select productcode, productname, productprice, productstatus 
from products;
select * from product_view;
create or replace view product_view as
select productcode,productname, productprice
from products;
select* from product_view;
drop view product_view;

delimiter //
create procedure store_procedure()
begin
	select * from products;
end//
delimiter ;
CALL store_procedure();

delimiter //
 create procedure add_product(IN codes varchar(10), IN productName varchar(30), IN productPrice int, productamount int, productdescription varchar(50))
 begin
	insert into products(productcode, productname, productprice, productamount, productdescription)
    values (codes, productname, productprice, productamount, productdescription);
end//
delimiter ;           

CALL add_product("2B",  "Two B", 15,1, "Fighting android");         
select * from products;

delimiter //
create procedure edit_product (IN id int, in productcode varchar(10), productname varchar(30))
begin
	update  products set products.productcode = productcode, products.productname = productname where products.id = id;
end//
delimiter ;
CALL  edit_product(3,"C", "Commander");

delimiter //
create procedure delete_product (IN productid int)
begin
	delete from products where products.id = productid;
end //
delimiter ;

call delete_product(1);
