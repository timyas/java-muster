-- Create table issues--

create table issues(id int not null primary key,
name VARCHAR(45) NULL,
description VARCHAR(254) NULL,
createDate date not NULL,
authorId int NULL references users(id));

-- add information to issues--

insert into issues values(1, 'First Issue',
 'This is an issue about my first expierience',
 CURRENT_DATE);

-- Create table comments--

create table comments(id INT NOT NULL PRIMARY KEY,
text VARCHAR(245) NULL,
createDate date NOT NULL,
authorId int NULL references users(id));

-- add information to comments--

insert into comments values(1, 'My opinion about PostgresSQL is changing...', CURRENT_DATE);

-- Create table users--

create table users(id int not null primary key,
login varchar(45) null,
password varchar(45) null,
roleId int null references roles(id));

-- add information to users--

insert into users values(1, 'admin', 'adminsPassword');
insert into users values(2, 'user', 'usersPassword');

-- Create table Files --

create table roles(id int not null primary key,
name varchar(45) not null);

-- add information to files--

insert into roles values (1, 'admin');
insert into roles values (2, 'user');