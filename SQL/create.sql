drop database  if exists `store`;
create database `store`;
use store;
create table t_user(
    `id` int primary key auto_increment,
    `username` varchar(20) not null unique ,
    `password` varchar(32) not null ,
    `email` varchar(200)
);

