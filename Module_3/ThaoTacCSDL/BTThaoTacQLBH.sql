use quanlybanhang;
insert into customer values (1,"Minh Quan", 10),
(2, "Ngoc Oanh", 20),
(3, "Hong Ha", 50);
insert into orders(oID,cID,oDate) values(1,1,'2006-3-21'),
(2,2,'2006-3-23'),
(3,1,'2006-3-16');
insert into product values (1, "May Giat", 3),
(2,"Tu Lanh", 3),
(3,"Dieu Hoa", 7),
(4,"Quat", 1),
(5,"Bep Dien", 2);
insert into orderdetail values
(1,1,3),
(1,3,7),
(1,4,2),
(2,1,1),
(3,1,8),
(2,5,4),
(2,3,3);

select * from orders;
select customer.cName, customer.cAge, orders.oDate,product.pName, product.pPrice, orderdetail.odQTY
from customer join orders on customer.cID = orders.cID 
join orderdetail on orders.oID = orderdetail.oID
join product on orderdetail.pID = product.pID;

select * from customer where 
customer.cID not in 
(select customer.cID from customer join orders on customer.cID = orders.cID);

select orders.oID, orders.oDate, sum(product.pPrice * orderdetail.odQTY) as "Total Price"
from orders 
join orderdetail on orders.oID = orderdetail.oID 
join product on orderdetail.pID = product.pID
group by orders.oid;










