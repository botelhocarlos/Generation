-- Criando banco de dados 
create database db_cidade_das_frutas;

-- Selecionando banco de dados
use db_cidade_das_frutas;

-- Criando tabela tb_categoria
create table tb_categoria(
id bigint auto_increment,
tipo varchar (250),
organico boolean not null,
primary key (id));

-- Populando a tabela
insert into tb_categoria (tipo, organico) values ("legume", false);
insert into tb_categoria (tipo, organico) values ("verdura", true);
insert into tb_categoria (tipo, organico) values ("fruta", false);
insert into tb_categoria (tipo, organico) values ("grão", false);
insert into tb_categoria (tipo, organico) values ("ovo", true);

select * from tb_categoria;

-- Criando tabela tb_produto
create table tb_produto(
id bigint auto_increment,
nome varchar (250),
valor double,
fornecedor varchar (250),
dtvalidade date,
id_categoria bigint,
primary key (id),
foreign key (id_categoria) references tb_categoria(id));

-- Populando a tabela
insert into tb_produto (nome, valor, fornecedor, dtvalidade, id_categoria)
values ("cenoura", 4.30, "Zé da Cenoura", "2021-11-10", 1);
insert into tb_produto (nome, valor, fornecedor, dtvalidade, id_categoria)
values ("acelga", 2.30, "Horta da Vovó", "2021-11-10", 2);
insert into tb_produto (nome, valor, fornecedor, dtvalidade, id_categoria)
values ("banana", 4.30, "Pomar do João", "2021-11-10", 3);
insert into tb_produto (nome, valor, fornecedor, dtvalidade, id_categoria)
values ("soja", 5.40, "Fazenda da Katia Abreu", "2021-11-10", 4);
insert into tb_produto (nome, valor, fornecedor, dtvalidade, id_categoria)
values ("ovo de codorna", 12.90, "Granja do Pedro", "2021-11-10", 5);
insert into tb_produto (nome, valor, fornecedor, dtvalidade, id_categoria)
values ("ovo de gansa", 18.90, "Granja do Pedro", "2021-11-10", 5);
insert into tb_produto (nome, valor, fornecedor, dtvalidade, id_categoria)
values ("pepino", 6.90, "Zé da Cenoura", "2021-11-10", 1);
insert into tb_produto (nome, valor, fornecedor, dtvalidade, id_categoria)
values ("maçã", 5.20, "Pomar do João", "2021-11-10", 3);

select * from tb_produto;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais
select * from tb_produto where valor > 50;

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais
select * from tb_produto where valor between 3 and 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra C
select * from tb_produto where nome like "c%";

-- Faça um um select com Inner join entre tabela categoria e produto
select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica
select * from tb_produto inner join tb_categoria
on tb_categoria.id = tb_produto.id_categoria
where id_categoria = 3;
