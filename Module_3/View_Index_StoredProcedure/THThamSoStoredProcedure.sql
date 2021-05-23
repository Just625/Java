use classicmodels;
delimiter //
create procedure getCusById (IN cusNum int(11))
begin
	select * from customers where customerNumber = cusNum;
end //
delimiter ;

CALL getCusById(175);

delimiter //
create  procedure getCustomersCountByCity(IN in_city varchar(50), OUT total int)
begin
	select count(customerNumber)
    into total
    from customers
    where city = in_city;
end//
delimiter ;

Call getCustomersCountByCity('Lyon', @total);
select @total;
select count(customerNumber)
from customers
where city = 'Lyon';

DELIMITER //
CREATE PROCEDURE SetCounter(INOUT counter INT, IN inc INT)
BEGIN
	SET counter = counter + inc;
END//
DELIMITER ;

SET @counter = 1;
CALL SetCounter(@counter, 1);
CALL SetCounter(@counter,1);
Call SetCounter(@counter,5);
SELECT @counter;


    