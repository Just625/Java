use quanlysinhvien;
select * from student;
select * from student where status = true;
select * from subject where credit <10;
select class.classname, student.studentid, student.studentname
from student join class on student.classid = class.classid
where class.classname = "A1";
select student.studentid, student.studentname, subject.subname, mark.mark
from student join mark on student.studentid = mark.studentid join subject on mark.subid = subject.subid
where subject.subname = "CF";