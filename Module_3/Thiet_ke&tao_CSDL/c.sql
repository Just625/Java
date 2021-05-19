create database QuanLyBanHang;
use QuanLyBanHang;
create table Customer(
	cID  int primary key,
    cName varchar(30),
    cAge int
);
create table Orders(
	oID int primary key,
    cID int ,
    oDate date,
    oTotalPrice float,
    foreign key(cID) references Customer(cID)
);
create table Product(
	pID int primary key,
    pName varchar(30),
    pPrice float
);
create table OrderDetail(
	oID int, 
    pID int,
    odQTY int,
    primary key(oID, pID),
    foreign key(oID) references Orders(oID),
    foreign key(pID) references Product(pID)
);