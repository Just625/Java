create database QuanLyDiemThi;
use QuanLyDiemThi;
create table HocSinh(
	MaHS int primary key,
    TenHS varchar(50),
    NgaySinh date ,
    Lop  varchar(50),
    GT varchar(50)
);
create table MonHoc(
	MaMH int primary key,
    TenMH varchar(50)
);
create table BangDiem(
	MaHS int,
    MaMH int,
    DiemThi int,
    NgayKT date,
    primary key(MaHs, MaMH),
    foreign key(MaHs) references HocSinh(MaHS),
    foreign key(MaMH) references MonHoc(MaMH)
);
create table GiaoVien(
	MaGV int primary key,
    TenGV varchar(50),
    SDT int
);
alter table MonHoc add MaGV int;
alter table MonHoc add constraint FK_MaGV foreign key(MaGV) references GiaoVien(MaGV);