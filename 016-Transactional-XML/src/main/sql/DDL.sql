use `spring-demo-015`;

create table _user(
  id int auto_increment primary key ,
  `username` varchar(30) not null ,
  `password` varchar(30) not null
);

create table _log(
  id int auto_increment primary key ,
  `message` varchar(255) not null
);