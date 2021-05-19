create database QuanLySinhVien;
use QuanLySinhVien;
create table Class(
	ClassID int Not Null auto_increment primary KEY,
    ClassName varchar(60) Not NUll,
    StartDate datetime not null,
    Status bit
);
create table student(
	StudentID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    StudentName varchar(30) NOT NULL, 
    Address varchar(50),
    Phone varchar(20),
    Status bit,
    ClassID int NOT NULL,
    foreign key(ClassID) references Class(ClassID)
);
create table Subject(
	SubID int NOT NULL PRIMARY KEY AUTO_INCREMENT,
    SubName varchar(30) NOT NULL,
    Credit Tinyint NOT NULL DEFAULT 1 CHECK(Credit>=1),
    Status Bit DEFAULT 1
);
create table Mark(
	MarkID int NOT NULL AUTO_INCREMENT PRIMARY KEY,
    SubID int NOT NULL ,
    StudentID int not null ,
    Mark Float DEFAULT 0 CHECK (Mark BETWEEN 0 AND 100),
    ExamTimes tinyint DEFAULT 1,
    UNIQUE(SubID, StudentID),
    foreign key (SubID) references Subject(SubID),
    foreign key (StudentID) references Student(StudentID)
); 
