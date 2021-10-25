-- Criando banco de dados 
create database db_farmacia_do_bem;

-- Selecionando banco de dados
use db_farmacia_do_bem;

-- Criando tabela tb_categoria
create table tb_categoria(
id bigint auto_increment,
categoria varchar (250),
generico boolean not null,
primary key (id));

-- Populando dados na tabela
insert into tb_categoria (categoria, generico) values ("analgésico", true);
insert into tb_categoria (categoria, generico) values ("anti-inflamatório", true);
insert into tb_categoria (categoria, generico) values ("anti-biótico", true);
insert into tb_categoria (categoria, generico) values ("fitoterapico", true);
insert into tb_categoria (categoria, generico) values ("anti-depressivos", true);

select * from tb_categoria;

-- Criando tabela tb_produto
create table tb_produto(
id bigint auto_increment,
nome varchar (250),
controle varchar (250),
valor double,
id_categoria bigint,
primary key (id),
foreign key (id_categoria) references tb_categoria(id));

-- Populando dados na tabela
insert into tb_produto (nome, controle, valor, id_categoria)
values ("parecetamol", "liberado", 6.90, 1);
insert into tb_produto (nome, controle, valor, id_categoria)
values ("nimesulida", "liberado", 32.90, 2);
insert into tb_produto (nome, controle, valor, id_categoria)
values ("amoxilina", "contolado", 65.90, 3);
insert into tb_produto (nome, controle, valor, id_categoria)
values ("phitoss", "liberado", 26.90, 4);
insert into tb_produto (nome, controle, valor, id_categoria)
values ("rivotril", "controlado", 78.90, 5);
insert into tb_produto (nome, controle, valor, id_categoria)
values ("penicilina", "controlado", 68.90, 3);
insert into tb_produto (nome, controle, valor, id_categoria)
values ("dipirona", "liberado", 8.90, 1);
insert into tb_produto (nome, controle, valor, id_categoria)
values ("fluoxetina", "controlado", 98.90, 5);

select * from tb_produto;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais
select * from tb_produto where valor > 50;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais
select * from tb_produto where valor between 3 and 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra P
select * from tb_produto where nome like "p%";

-- Faça um um select com Inner join entre tabela categoria e produto
select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica
select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.id_categoria
where id_categoria = 3;







