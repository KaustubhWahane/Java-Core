create database student;
use student;
create table AllConstraits(id int primary key, ename varchar(20) DEFAULT 'Suresh' ,Age int, CHECK (Age>=18),gender varchar(4) not null unique);
CREATE INDEX index1
ON  AllConstraits(id, ename);
select * from AllConstraits;
desc AllConstraits

drop table emp;