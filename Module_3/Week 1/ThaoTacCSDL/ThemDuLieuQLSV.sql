use quanlysinhvien;
insert into class (classid, classname, startdate, status)  
values (1, "A1", '2008-12-20', 1);
insert into class 
values (2, "A2", '2008-12-22', 	1);
insert into class
values (3, "B3", current_date, 0);

insert into student (studentid, studentname, address, phone, status, classid)
values (1, "Hung", "Ha Noi", "0912113113", 1, 1);
insert into student (studentid, studentname, address, status, classid)
values (2, "Hoa", "Hai Phong", 1, 1);
insert into student 
values (3, "Manh", "HCM", "0123123123", 0, 2);

insert into subject (subid, subname, credit, status)
values (1, "CF", 5, 1),
	   (2, "C", 6, 1),
	   (3, "HDJ", 5, 1),
       (4, "RDBMS", 10, 1)
;

insert into mark (subid, studentid,mark,examtimes)
values (1,1,8,1),
(1,2,10,2),
(2,1,12,1);