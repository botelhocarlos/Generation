create	 	database	db_escola;
use db_escola;
create table tb_alunes(
	id int(5) auto_increment,
    nome varchar(30) not null,
    genero enum('ela', 'elu', 'ele', 'outro'),
    dataNascimento date,
    nota int(6),
    primary key (id));
insert into tb_alunes (nome, genero, datanascimento, nota) values ("Joana", "ela", '1995-05-10', 6);
insert into tb_alunes (nome, genero, datanascimento, nota) values ("Raí", "elu", '1996-02-04', 7);
insert into tb_alunes (nome, genero, datanascimento, nota) values ("Luan", "ele", '1999-10-12', 8);
insert into tb_alunes (nome, genero, datanascimento, nota) values ("Carol", "ela", '1984-11-14', 5);
insert into tb_alunes (nome, genero, datanascimento, nota) values ("Til", "outro", '1994-09-28', 10);
select * from tb_alunes;
    
select * from tb_alunes where nota > 7;
select * from tb_alunes where nota < 7;
update tb_alunes set nota = 8 where id = 5;

