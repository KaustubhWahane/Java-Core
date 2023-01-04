create database Emps;
use Emps;
create table emp(eid int , ename varchar(20),salary int)
insert into emp (eid, ename, salary)
values (101, 'Kaustubh',20000),
(102, 'Devang',30000),
(103, 'Devesh',40000),
(104, 'Vikas',50000),
(105, 'Sekiro',60000),
(106, 'Squidwarda',20000)

select * from emp;
/*2)to select which emp sal above 25000?*/
select * from emp where salary > 25000;

/*3)to get all emps which emp name starts with 's' letter and ends with 'a'?*/
select * from emp where ename like 'S%' and '%A'

/*4)to get maximum salary emp details?*/
select MAX(salary) AS 'MaximumSalary' FROM emp;  

/*5)to get emp details which eid is above 10 and salary below 20000?*/
select * from emp where salary < 20000

/*6)to get emp details orderwise based salary descending?*/
select * from emp order by salary desc;

/*7)to get emp details which emp salary is null?*/
select * from emp where salary = null;