create database Usersdetails;
create table employees(
emp_no int not null,
birth_date DATE not null,
first_name Varchar(64) not null,
last_name Varchar (52) not null,
gender Enum('m','f'),
hire_date Date not null,
primary key (emp_no)
);

create table departments(
dept_no char(4) not null,
dept_name varchar(36) not null,
primary key (dept_no),
unique key (dept_no)
