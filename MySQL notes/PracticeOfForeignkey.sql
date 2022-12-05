create database db5;
use db5;
create table city(
cid int not null auto_increment, 
cityname varchar(10) not null,
primary key (cid));
desc city;
select * from city;
insert into city(cityname)
values('Agra'),('Delhi'), ('Bhopal'), ('Jaipur'), ('Noida');

create table student(id int not null auto_increment, name varchar(10), age int not null , city varchar(10) not null , primary key (id) , foreign key (city) references city(cid));
insert into student(id, name , age , city)
values (100 , 'Purvaraja', 12000, 'Sb10' ,  10),
(101, 'Punarvi', 20000,  20),
(102, 'Varun', 25000, 20),
(103 , 'Manoj', 16000,10);



