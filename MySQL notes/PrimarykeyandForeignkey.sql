create database db6;
use db6;
create table d1(empno int , empname varchar(10), primary key (empno));
create table t2(deptno int primary key , empno int , foreign key (empno) references d1 (empno));
select  * from d1 , t2