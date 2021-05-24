use quanlysinhvien;
select * from subject
group by subname
having credit >= (select max(credit) from subject );

select * from subject 
where subid =(select subid from mark 
	where mark = (select max(mark.mark) from mark));

select student.StudentName, student.Address, student.phone, student.status,student.classid, avg(mark.mark) as "Avg mark" 
from student join mark on student.studentid = mark.studentid
group by student.studentname
order by avg(mark.mark) desc;