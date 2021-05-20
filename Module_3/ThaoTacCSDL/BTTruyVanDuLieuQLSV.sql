use quanlysinhvien;
select * from student where studentname like "h%";
select * from class where Month(class.startdate) = 12;
select * from subject where (credit between 3 and 5);
update student set classid = 2 where studentname = "Hung";