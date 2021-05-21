use classicmodels;
explain select * from customers  where customername = "Land of Toys Inc.";
alter table customers add index idx_customersname (customername);
explain select * from customers  where customername = "Land of Toys Inc.";
alter table customers add index idx_fullname (contactlastname, contactfirstname);
explain select * from customers  where contactlastname =  "Jean" AND contactfirstname = "King";
-- cach drop 1
alter table customers drop index idx_fullname;
-- cach drop 2
drop index idx_fullname on customers;
