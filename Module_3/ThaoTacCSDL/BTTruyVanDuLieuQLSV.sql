use quanlysinhvien;
select * from student where studentname like "h%";
select * from class where Month(class.startdate) = 12;
select * from subject where (credit between 3 and 5);
update student set classid = 2 where studentname = "Hung";
select student.studentname, subject.subname, mark.mark
from student join mark on student.studentid = mark.studentid
join subject on mark.subid = subject.subid
order by mark.mark desc, student.studentname;