create database worker
use worker;
create table worker_table(worker_id int primary key, first_name varchar(20), last_name varchar(20), salary int , joining_date datetime, department varchar (10)); 
insert into worker_table (worker_id , first_name, last_name, salary , joining_date, department)
values (001 , 'Monika', 'Arora' ,100000,'2014-02-20 09:00:00','HR'),
(002 , 'Niharika', 'Verma' ,80000,'2014-06-11 09:00:00','Admin'),
(003 , 'Vishal', 'Singhal' ,300000,'2014-02-20 09:00:00','HR'),
(004, 'Amitabh', 'Singh' ,500000,'2014-02-20 09:00:00','Admin'),
(005 , 'Vivek', 'Bhati' ,500000,'2014-06-11 09:00:00','Admin'),
(006 , 'Vipul', 'Diwan' ,200000,'2014-06-11 09:00:00','Account'),
(007 , 'Satish', 'Kumar' ,75000,'2014-01-20 09:00:00','Account'),
(008 , 'Geetika', 'Chauhan' ,90000,'2014-04-11 09:00:00','Admin');
select * from worker_table;
select * from bonus_table;
select * from Title_table;
create table bonus_table(worker_ref_id int , bonus_date datetime, bonus_amount int, foreign key (worker_ref_id) references worker_table(worker_id));
insert into bonus_table(worker_ref_id,bonus_date,bonus_amount)
values (1, '2016-02-20 00:00:00',5000),
(2, '2016-06-11 00:00:00',3000),
(3, '2016-02-20 00:00:00',4000),
(1, '2016-02-20 00:00:00',4500),
(2, '2016-06-11 00:00:00',3500);

create table Title_table(worker_ref_id int , Worker_title varchar(20), AffectedFrom datetime,foreign key (worker_ref_id) references worker_table(worker_id));
insert into Title_table(worker_ref_id, Worker_title,AffectedFrom)
values (1,'Manager' ,'2016-02-20 00:00:00'),
(2, 'Executive','2016-06-11 00:00:00'),
(8,'Executive' ,'2016-02-20 00:00:00'),
(5, 'Manager','2016-02-20 00:00:00'),
(4, 'AssistantManager','2016-06-11 00:00:00'),
(7, 'Executive','2016-06-11 00:00:00'),
(6,'Lead' ,'2016-06-11 00:00:00'),
(3,'Lead' ,'2016-06-11 00:00:00');
drop table worker_table;
drop table bonus_table;
drop table Title_table;

/* Questions and Answers
 Q1)Write an SQL query to determine the 5th highest salary worker details?
*/
select * from worker_table where 4 = (select count(Distinct salary)from worker_table where salary > worker_table.salary);

/*
 Q2) Write an SQL query to fetch the names of workers who earn the highest salary.
*/
select first_name and last_name as HighestSalary from worker_table where max(salary) ;

/*
 Q3)write a query to get worker details who are working with ‘vivek’ dept?
*/
select * from worker_table where department = 'Admin';

/*
 Q4)write a query to get bonus details which worker ref id is match with title table ref id?
*/
select worker_ref_id, bonus_amount from bonus_table natural join Title_table order by worker_ref_id;

/*
 Q5)write a query to get worker details which worker salary is more than avg salary of each dept?
*/
select first_name , last_name as Workernames from worker_table where salary > 230625 ;

/*
Q6)write a query to get worker details which worker salary is more than avg salary of ‘satish’ dept?
*/
select * from worker_table where salary > 75000 and department ='Account';

/*
Q7)write a query to get title table details if worker ref id at least one record exists in ‘bonus’ table?
*/
select distinct worker_ref_id,Worker_title  from Title_table
natural join bonus_table;

/*
Q8)write a query to get bonus,title table details whose bonus date is ‘2016-02-20’?
*/
select * from bonus_table, Title_table
where bonus_date = '2016-02-20';
