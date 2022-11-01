create database db2;
use db2;
create table example(textName varchar(15), numberExample double);
desc example;
insert into example (textName, numberExample ,DateandTime)
values ('Hyderabad', 27.456);
insert into example(DateandTime)
values ('2020-08-15');
alter table example add column DateandTime date;
select * from example
/*
A)To Convert Upper Case
*/ 
select upper('Hyderabad');

/*
B)To Display Only First 3 Letters
*/ 
select substr('Hyderabad', 1,3);

/*
C)To Replace ‘Hyd’ With ‘Secun’
*/ 
select replace('Hyd' , 'Hyd','Secun');

/*
D)To Find Position Of First ‘e’ Letter
*/
select instr('Secun', 'e' );

/*
A)To Display Week Name For Above Date
*/
select example when date DateandTime then 'Thursday';

/*
B)To Display Only Year In 4 Digits
*/
select * from example where DateandTime in 'YYYY';

/*
D)To Find Days Difference The Given Above Date To Today Date
*/
select * from example where DateandTime in 'YYYY' or Current_date;

/*
C)To Roundup Number With First Precision.
*/
select round(27.456);

/*
4)Write A Query To Get Todays Date In ‘Dd-Mon-Yyyy’
*/

select current_date() as convertedDate from example;
