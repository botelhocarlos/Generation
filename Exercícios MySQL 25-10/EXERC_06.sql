-- Criando banco de dados 
create database db_cursoDaMinhaVida;

-- Selecionando banco de dados
use db_cursoDaMinhaVida;

-- Criando tabela tb_categoria
create table tb_categoria(
id bigint auto_increment,
area varchar (250),
presencial boolean not null,
primary key (id));

-- Populando a tabela
insert into tb_categoria (area, presencial) values ("idiomas", true);
insert into tb_categoria (area, presencial) values ("softwares", false);
insert into tb_categoria (area, presencial) values ("artesanatos", true);
insert into tb_categoria (area, presencial) values ("artes", false);
insert into tb_categoria (area, presencial) values ("cinema", true);

select * from tb_categoria;

-- Criando tabela tb_curso
create table tb_curso(
id bigint auto_increment,
nome varchar (250),
valor double,
duracao varchar (250),
certificado boolean not null,
id_categoria bigint,
primary key (id),
foreign key (id_categoria) references tb_categoria(id));

-- Populando a tabela
insert into tb_curso (nome, valor, duracao, certificado, id_categoria)
values ("francês", 230.90, "3 anos", true, 1);
insert into tb_curso (nome, valor, duracao, certificado, id_categoria)
values ("photoshop", 130.90, "1 ano", true, 2);
insert into tb_curso (nome, valor, duracao, certificado, id_categoria)
values ("crochê", 80.90, "1 ano", false, 3);
insert into tb_curso (nome, valor, duracao, certificado, id_categoria)
values ("pintura aquarelada", 60.90, "1 ano", false, 4);
insert into tb_curso (nome, valor, duracao, certificado, id_categoria)
values ("direção de arte", 560.90, "3 anos", true, 5);
insert into tb_curso (nome, valor, duracao, certificado, id_categoria)
values ("alemão", 230.90, "3 anos", true, 1);
insert into tb_curso (nome, valor, duracao, certificado, id_categoria)
values ("mandarim", 230.90, "3 anos", true, 1);
insert into tb_curso (nome, valor, duracao, certificado, id_categoria)
values ("italiano", 230.90, "3 anos", true, 1);

select * from tb_curso;

-- Faça um select que retorne os Produtos com o valor maior do que 100 reais
select * from tb_curso where valor > 100;

-- Faça um select trazendo os Produtos com valor entre 50 e 100 reais
select * from tb_curso where valor between 50 and 100;

-- Faça um select utilizando LIKE buscando os Produtos com a letra P
select * from tb_curso where nome like "p%";

-- Faça um um select com Inner join entre tabela categoria e produto
select * from tb_curso inner join tb_categoria
on tb_categoria.id = tb_curso.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica
select * from tb_curso inner join tb_categoria
on tb_categoria.id = tb_curso.id_categoria
where id_categoria = 1;
