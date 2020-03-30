drop table useraccount;
create table user_account (id serial primary key,
firstName varchar (100) not null,
lastName varchar (100) not null,
userName varchar (100) not null,
userPassword varchar (100) not null,
isikuKood bigint  unique not null,
email varchar (100) unique not null);

select * from user_account;

create table viking_lotto_result (id serial primary key,
number1 int not null,
number2 int not null,
number3 int not null,
number4 int not null,
number5 int not null,
number6 int not null,
game_date timestamp unique null);

create table viking_lotto_ticket (id serial primary key,
viking_lotto_result_id int references viking_lotto_result(id),
user_account_id int references user_account(id),
number1 int not null,
number2 int not null,
number3 int not null,
number4 int not null,
number5 int not null,
number6 int not null);

