create database	db_rh;
use db_rh;
create table tb_funcionaries(
	id int(5) auto_increment,
    nome varchar(30) not null,
    genero enum('ela', 'elu', 'ele', 'outro'),
    dataNascimento date,
    salario int(6),
    primary key (id));
insert into tb_funcionaries (nome, genero, datanascimento, salario) values ("Joana", "ela", '1995-05-10', 2500);
insert into tb_funcionaries (nome, genero, datanascimento, salario) values ("Raí", "elu", '1996-02-04', 9100);
insert into tb_funcionaries (nome, genero, datanascimento, salario) values ("Luan", "ele", '1999-10-12', 1500);
insert into tb_funcionaries (nome, genero, datanascimento, salario) values ("Carol", "ela", '1984-11-14', 6000);
insert into tb_funcionaries (nome, genero, datanascimento, salario) values ("Til", "outro", '1994-09-28', 8500);
select * from tb_funcionaries;
    
select * from tb_funcionaries where salario > 2000;
select * from tb_funcionaries where salario < 2000;
update tb_funcionaries set salario = 9500 where id = 5;