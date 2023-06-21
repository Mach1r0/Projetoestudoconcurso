drop database if exists MVC;
create database if not exists MVC;
use MVC; 

create table concurso (
codConcurso int auto_increment not null,
nome varchar(50),
dias varchar(14),
edital varchar(30),
primary key (codConcurso));

create table matematica(
codMatematica int auto_increment not null,
nomemateria varchar(20),
graudedificuldade varchar(15),
resposta varchar(50),
binario varchar(50),
primary key (codQuestao));

create table portugues(
codPortugues int auto_increment not null,
nomemateria varchar(20),
graudedificuldade varchar(15),
resposta varchar(50),
discussiva varchar(50),
primary key (codQuestao));
