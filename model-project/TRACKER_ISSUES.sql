-- Create table issues--

create table issues(id_issues int not null primary key,
issue_name VARCHAR(45) NULL,
Ddescription VARCHAR(254) NULL,
date VARCHAR(45) NULL,
author VARCHAR(45) NULL);

-- Create table comments--

create table comments(id_comment INT NOT NULL PRIMARY KEY,
author VARCHAR(45) NULL,
date VARCHAR(45) NOT NULL,
comments VARCHAR(254) NULL);

-- Create table users--

create table users(id_user int not null primary key,
admins varchar(45) null,
users varchar(45) null);

-- Create table Files --

create table files(id_file int not null primary key,
file varchar(45) null);

