drop table useraccount;
create table user_account (id serial primary key,
firstName varchar (100) not null,
lastName varchar (100) not null,
userName varchar (100) not null,
userPassword varchar (100) not null,
isikuKood bigint  unique not null,
email varchar (100) unique not null);

select * from user_account;

