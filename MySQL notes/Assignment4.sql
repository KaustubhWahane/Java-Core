create database db9;
use db9;
create table courses(sname varchar(10),cname varchar(10), fees int);
insert into courses(sname, cname , fees)
values('sai', 'java',10000),
('manoj', 'oracle',5000),
('shiva', 'python',12000),
('mohan', 'java',10000),
('donna', 'java',10000),
('Stella', 'python',12000);
commit;
update courses set sname ='ayush' where cname = 'oracle';
rollback;
select * from courses;
select * from games;
delete from courses where sname = 'C-Lang';
desc students
/*
Write a query to find max, and total fees on the basis of cname
*/
select * from Max(courses) where cname = 'java';
