-- Create table Roles --

create table roles(id int not null primary key,
name varchar(245) not null);

-- add information to roles--

insert into roles values (1, 'admin');
insert into roles values (2, 'user');

-- Create table users--

create table users(id int not null primary key,
login varchar(245) null,
password varchar(245) null,
roleId int null references roles(id));

-- add information to users--

insert into users values(1, 'admin', 'adminsPassword');
insert into users values(2, 'user', 'usersPassword');

-- Create table comments--

create table comments(id INT NOT NULL PRIMARY KEY,
text TEXT NULL,
createDate timestamp NOT NULL,
authorId int NULL references users(id));

-- add information to comments--

insert into comments values(1, 'My opinion about PostgresSQL is changing...', now());

-- Create table issues--

create table issues(id int not null primary key,
name VARCHAR(245) NULL,
description text NULL,
createDate timestamp not NULL,
authorId int NULL references users(id));

-- add information to issues--

insert into issues values(1, 'First Issue',
 'This is an issue about my first expierience',
 now());
