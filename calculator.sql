create table client (
id integer not null,
name varchar(50) not null,
email varchar(50) unique not null,
constraint pk_client primary key (id)
);

create sequence seq_client;