create database db4;
use db4;
create table branchs(Brcode int primary key, Bname varchar(10) not null);
insert into branchs(Brcode , Bname)
values (10 , 'Hyd'),
(20 , 'Usa'),
(30 , 'Uk'),
(40 , 'Nz');

create table BankCustomer(Acno int primary key, Cname varchar(10), Amt int , Atmno varchar(10), addr varchar(10), Brcode int);
insert into BankCustomer(Acno, Cname , Amt , Atmno ,addr,Brcode)
values (100 , 'Purvaraja', 12000, 'Sb10' , 'Srinagar', 10),
(101, 'Punarvi', 20000, 'Sb11' , 'Jamestreet', 20),
(102, 'Varun', 25000, 'Sb12' , 'Churchroad', 20),
(103 , 'Manoj', 16000, null , 'Kphb', 10);

/*
h)Every customer brcode should be referenced from branchs brcode?
*/
select branchs , BankCustomer from Brcode join Acno on Brcode = Acno;

/*
2)write a query to get all branchs,customer details which branch have
the customers?
*/
select  branchs , BankCustomer from Bname , Cname where Brcode =  Cname;

/*
3)write a query to get all branchs,customer details which branch does
not have any customer?
*/
select  branchs , BankCustomer from Bname , Cname where Brcode !=  Cname;

/*
4)write a query to get cross product details of branchs,customer tables?
*/
select  * from branchs cross join BankCustomer;

desc branchs
select * from BankCustomer;