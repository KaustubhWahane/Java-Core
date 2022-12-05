create database db8;
use db8;

show databases;
create table Employee(empno int , ename varchar(10), addr varchar(15));
create table Department(empno int , dname varchar(10), deptno int default 103);
insert into Employee(empno, ename, addr)
values (1 , 'Ram' , 'Delhi'),
(2 , 'Varun' , 'Chandigarh'),
(3, 'Kaustubh' , 'Bhosdiwadi'),
(4 , 'Sakshi' , 'Chuddiephatee');

insert into Department(empno, dname, deptno)
values (1 , 'HR' , 100),
(2 , 'IT' , 101),
(4, 'Mark' , 102);

/*
Yup abhi samaj me aaya ye
*/
select ename from Employee natural join Department;
select * from Employee;
select * from Department;

select * from Employee cross join Department where 1;

