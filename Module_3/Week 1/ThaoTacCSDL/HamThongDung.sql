use quanlysinhvien;
select address,count(address) from student group by address;
select student.studentname, avg(mark.mark) as "Avg mark"
from student
join mark on student.studentid = mark.studentid
group by student.studentname;

select student.studentname, avg(mark.mark) as "Avg mark"
from student
join mark on student.studentid = mark.studentid
group by student.studentname
having avg(mark.mark) >15;

select student.studentname, avg(mark.mark) as "Avg mark"
from student
join mark on student.studentid = mark.studentid
group by student.studentname
having avg(mark.mark)>= ALL (select avg(mark.mark) from mark group by mark.studentid);