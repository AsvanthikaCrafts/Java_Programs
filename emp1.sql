use emp1;
CREATE TABLE salaries (emp_no int not null,salary int not null,from_date date not null,to_date date not null,key(emp_no),foreign key(emp_no) references employee(emp_no),primary key(emp_no,from_date));
create table departments(dept_no char(4),dept_name varchar(40),primary key(dept_no),unique key (dept_name));
insert into employee(emp_no,birth_date,first_name,last_name,gender,hire_date) values (11,'2004-10-04','kaviya','C','F','2012-02-12');
alter table employee drop b_date;
alter table employee add birth_date date not null;
insert into salaries values(11,50000,'13-12-23','13-12-25');
insert into departments values(11,'physics department');
select * from employee;
select*from salaries;
select*from departments;



