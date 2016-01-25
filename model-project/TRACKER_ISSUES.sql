-- Create table issues--

create table issues(id_issues int not null primary key,
issue_name VARCHAR(45) NULL,
description VARCHAR(254) NULL,
date VARCHAR(45) NULL,
author VARCHAR(45) NULL);

-- add information to issues--

insert into issues values(1, 'First Issue',
 'This is an issue about my first expierience',
 '25-01-16',
 'Maxim');

-- Create table comments--

create table comments(id_comment INT NOT NULL PRIMARY KEY,
author VARCHAR(45) NULL,
date VARCHAR(45) NOT NULL,
comments VARCHAR(254) NULL);

-- add information to comments--

insert into comments values(1, 'John Smith', '26-01-16',
'Some information about comment');

-- Create table users--

create table users(id_user int not null primary key,
admins varchar(45) null,
users varchar(45) null);

-- add information to users--

insert into users values(1, null, 'John Smith');
insert into users values(2, 'Maxim', null);

-- Create table Files --

create table files(id_file int not null primary key,
file varchar(45) null);

-- add information to files--

insert into files values (1, 'a file');