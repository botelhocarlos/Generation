-- Criando banco de dados 
create database db_construindo_a_nossa_vida;

-- Selecionando banco de dados
use db_construindo_a_nossa_vida;

-- Criando tabela tb_categoria
create table tb_categoria(
id bigint auto_increment,
tipo varchar (250),
fabricante varchar (250),
primary key (id));

-- Populando a tabela
insert into tb_categoria (tipo, fabricante) values ("revestimento", "portobello");
insert into tb_categoria (tipo, fabricante) values ("peças sanitárias", "cebecon");
insert into tb_categoria (tipo, fabricante) values ("torneiras", "deca");
insert into tb_categoria (tipo, fabricante) values ("esquadrias", "sazaki");
insert into tb_categoria (tipo, fabricante) values ("portas", "madeireira souza");

select * from tb_produto;

-- Criando tabela tb_produto
create table tb_produto(
id bigint auto_increment,
nome varchar (250),
valor double,
fornecedor varchar (250),
disponivel boolean not null,
id_categoria bigint,
primary key (id),
foreign key (id_categoria) references tb_categoria(id));

-- Populando a tabela
insert into tb_produto (nome, valor, fornecedor, disponivel, id_categoria)
values ("porcelanato mara", 50, "Fornecedor 1", true, 1);
insert into tb_produto (nome, valor, fornecedor, disponivel, id_categoria)
values ("bacia sanitária lurdes", 130, "Fornecedor 2", true, 2);
insert into tb_produto (nome, valor, fornecedor, disponivel, id_categoria)
values ("torneira giratória simples", 40, "Fornecedor 2", true, 3);
insert into tb_produto (nome, valor, fornecedor, disponivel, id_categoria)
values ("vezeana tipo 1", 400, "Fornecedor 4", true, 4);
insert into tb_produto (nome, valor, fornecedor, disponivel, id_categoria)
values ("porta madeira de lei", 2300, "Fornecedor 3", true, 5);
insert into tb_produto (nome, valor, fornecedor, disponivel, id_categoria)
values ("lavatório lurdes", 330, "Fornecedor 2", true, 2);
insert into tb_produto (nome, valor, fornecedor, disponivel, id_categoria)
values ("bacia sanitária paula", 670, "Fornecedor 2", true, 2);
insert into tb_produto (nome, valor, fornecedor, disponivel, id_categoria)
values ("bacia sanitária janine", 450, "Fornecedor 2", true, 2);

select * from tb_produto;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais
select * from tb_produto where valor > 50;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais
select * from tb_produto where valor between 3 and 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra B
select * from tb_produto where nome like "b%";

-- Faça um um select com Inner join entre tabela categoria e produto
select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica
select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.id_categoria
where id_categoria = 2;
