--CREATE database spring DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

create table i_staff(id int auto_increment primary key,name varchar(30), age int, salary double);


create table i_student(id int primary key,name varchar(30), age int);


create table i_account(id int auto_increment primary key, name varchar(30), money decimal(10,2));

insert into i_account(name, money) values("User_A",10000.00);
insert into i_account(name, money) values("User_B",20000.00);
