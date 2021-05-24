use classicmodels;

DELIMITER //
CREATE PROCEDURE findAllCustomers()
BEGIN
	SELECT * FROM CUSTOMERS;
END //
DELIMITER ;

CALL findAllCustomers();

DELIMITER //
DROP procedure IF EXISTS findAllCustomers//
create procedure findAllCustomers()
begin
	select * from customers where customerNumber = 175;
end //
delimiter ;

CALL findAllCustomers();