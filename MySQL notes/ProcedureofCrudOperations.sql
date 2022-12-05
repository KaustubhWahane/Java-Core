CREATE PROCEDURE `new_procedure` ()
BEGIN
insert into Students(rollno , sname ,marks , gid) values(104,'Kaustubh',69,2);
update Students set marks = 70 where rollno = 104;
delete from Students where rollno = 104;
end;
