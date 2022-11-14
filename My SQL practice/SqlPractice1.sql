create database practice;
use practice;
create table GroupsTable(gid int , gname varchar(4),primary key (gid));
create table Students(rollno int primary key , sname varchar(10) not null, marks int not null,gid int ,foreign key (gid) references GroupsTable (gid));
insert into GroupsTable(gid , gname)

values(1, 'ECE'),
(2, 'CSE'),
(3, 'IT');

insert into Students(rollno , sname ,marks , gid)
values(101, 'SURYA', 75,1),
(102, 'RAVI',67, 1),
(103, 'SITA',97, 2);

/*
2)Finally to get which course have students those details to display from both tables?
*/
select * from GroupsTable where gid;

/*
3)to get students total marks based on group ids?
*/
select SUM(marks) from Students where gid;

/*
4)To prepare view based on students table which marks above 90?
*/
select Max(marks) from Students where gid;

/*
5)To make procedure to insert record,update
records,delete records in students table with args?
(Done in new_procedure)
*/

/*
6)To get which group is not taken any student those details?
*/
select * from GroupsTable , Students where Count(gid);

/*
7)to display which student marks are equal to ‘sita’ marks?
*/
select * from Students where marks =97;

/*
8)to display students details which student marks is more than avg of each groupid?
*/
select * from Students where marks>= 80;

desc GroupsTable;
desc Students;
