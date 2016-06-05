create table _user (
  `id` int primary key auto_increment,
  `username` nvarchar(30) not null ,
  `password` varchar(32),
  `credits` int,
  `last_visit` datetime,
  `last_ip` varchar(32)
)character set utf8;


create table _login_log(
  `id` int primary key auto_increment,
  `uid` int,
  ip varchar(32),
  login_datetime datetime
)character set utf8;

