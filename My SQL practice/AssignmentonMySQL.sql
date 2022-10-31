create database db1;
use db1;
create table school(sno int, sname varchar(10), course varchar(10), batch varchar(3), M1 int ,M2 int , M3 int , Total int , Average int , Result varchar(4)); 
insert into school(sno , sname , course , batch , M1 , M2 , M3 , Total, Average, Result)
values (1 , 'Surya' , 'SQL' , 'MOR' , 65 , 66 , 70 , 201 , 67, 'pass'),
(2, 'Neha' , 'JAVA' , 'EVE' , 45 , 35 , 56, 133,45,'fail'),
(3, 'Joshi' , 'JAVA' , 'MOR' , 23, 90, 90, 203,67,'pass'),
(4, 'Varun' , 'C-LANG' , 'MOR' , 78, 90, 99, 267,89,'pass'),
(5, 'Sasi' , 'SQL' , 'EVE' , 88, 90, 90, 268,89,'pass'),
(6, 'Shweta' , 'SQL' , 'EVE' , 56, 45, 45, 146,48,'fail');
desc school;
select * from school;

/*
2)WRITE A QUERY TO UPDATE SNAMES FOR SNO IS 1 AND 5.
*/
update school set sname = 'Sasi' where sno = 1;
update school set sname = 'Surya' where sno = 5;

/*
3)WRITE A QUERY TO SELECT ALL STUDENTS DETAILS RESULT IS ‘PASS’ AND
COURSE SHOULD BE EQUAL TO ‘SQL’?
*/
update school set result = 'pass' ;
update school set course = 'MySQL' ;

/*
4)WRITE A QUERY TO SELECT WHICH STUDENTS MARKS BELOW 75 AND ABOVE
50.
*/
select m1 from school where m1 >= 50 && m1 <=75;
select m2 from school where m2 >= 50 && m2 <=75;
select m3 from school where m3 >= 50 && m3 <=75;

/*
5)WRITE A QUERY TO SELECT ALL STUDENTS WHICH NAME STARTS WITH ‘S’
LETTER AND ENDS WITH ‘A’?
*/
select * from school where sname ='S' and '&a';

/*
6)WRITE A QUERY TO GET ALL STUDENTS DETAILS WHICH STUDENT COURSE
IS ‘JAVA’,’CLANG’?
*/
select sname from school where course = 'JAVA' && 'C-LANG';

/*
7)WRITE A QUERY TO GET ALL COURSE DETAILS WHICH COURSE IS RUNNING
IN ‘MOR’ AND ‘EVE’ BATCHES?
*/
select course from school where batch = 'MOR' && 'EVE';

/*
8)WRITE A QUERY TO GET COURSE DETAILS WHICH COURSE IS ONLY ‘MOR’
BUT NOT IN ‘EVE’ BATCH?
*/

select course from school where batch = 'MOR' != 'EVE';
