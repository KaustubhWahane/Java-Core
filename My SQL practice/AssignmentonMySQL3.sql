create database db3;
use db3;
create table emp( Deptno int primary key,ename varchar(10), salary int); 
insert into emp( Deptno ,ename, salary)
values (101 , 'Kaustubh', 6900),(102 , 'Sakshi', 7000),(103, 'Devang', 8000),(104, 'Devesh', 9000);
select * from emp;
/*
5)Write A Query To Perform All Column Functions On ‘Salary’ Column
In ‘Emp’ Table?
*/
/*
Count function
*/
select count(salary) from emp;
/*
Max function
*/
select Max(salary) from emp;
/*
Min function
*/
select Min(salary) from emp;
/*
Sum function
*/
select Sum(salary) from emp;
/*
6)Write A Query To Calc Deptno Wise Max,Min Salaries?
*/
select Max(salary) as Deptno from emp;
select Min(salary) as Deptno from emp;

/*
7)Write A Query To Get All Emp Details Order Wise Based On Salary
Desc?
*/
select * from emp where salary >= 6900 && 9000;

/*
8)Write A Query To Get Deptno With Out Duplicates?
*/
select Deptno from emp ;

desc emp

