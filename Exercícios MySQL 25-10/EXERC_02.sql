-- Criando banco de dados 
create database db_pizzaria_legal;

-- Selecionando banco de dados
use db_pizzaria_legal;

-- Criando a tabela tb_categoria
create table tb_categoria(
id bigint auto_increment,
tipo varchar(250),
borda boolean not null,
primary key(id));

-- Populando dados na tabela
insert into tb_categoria (tipo, borda) values ("clássica", true);
insert into tb_categoria (tipo, borda) values ("jumbo", true);
insert into tb_categoria (tipo, borda) values ("brotinho", false);
insert into tb_categoria (tipo, borda) values ("doce", true);
insert into tb_categoria (tipo, borda) values ("quadrada", true);

select * from tb_categoria;

-- Criando a tabela tb_pizza
create table tb_pizza(
id bigint auto_increment,
sabor varchar (250),
ingredientes varchar (250),
valor double,
azeitona boolean not null,
id_categoria bigint,
primary key (id),
foreign key (id_categoria) references tb_categoria(id));

-- Populando dados na tabela
insert into tb_pizza (sabor, ingredientes, valor, azeitona, id_categoria)
values ("marguerita", "molho, muçarela e manjericão", 39.90, true, 1);
insert into tb_pizza (sabor, ingredientes, valor, azeitona, id_categoria)
values ("portuguesa", "molho, muçarela, presunto, ovo, cebola", 49.90, true, 2);
insert into tb_pizza (sabor, ingredientes, valor, azeitona, id_categoria)
values ("calabresa", "molho, muçarela, calabresa e cebola", 29.90, true, 3);
insert into tb_pizza (sabor, ingredientes, valor, azeitona, id_categoria)
values ("romeu & julieta", "muçarela e goibada", 39.90, false, 4);
insert into tb_pizza (sabor, ingredientes, valor, azeitona, id_categoria)
values ("pepperoni", "molho, muçarela, e pepperoni", 39.90, true, 5);
insert into tb_pizza (sabor, ingredientes, valor, azeitona, id_categoria)
values ("frango com catupiry", "molho, muçarela, frango, ovo, catupiry", 49.90, true, 2);
insert into tb_pizza (sabor, ingredientes, valor, azeitona, id_categoria)
values ("cogumelos", "molho, muçarela, shitake, shimeji, paris e champignon", 69.90, true, 2);
insert into tb_pizza (sabor, ingredientes, valor, azeitona, id_categoria)
values ("m&ms", "ganache e confeitos de chocolate", 39.90, false, 4);

select * from tb_pizza;

-- Faça um select que retorne os Produtos com o valor maior do que 45 reais
select * from tb_pizza where valor > 45;

-- Faça um select trazendo os Produtos com valor entre 29 e 60 reais
select * from tb_pizza where valor between 29 and 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra C
select * from tb_pizza where sabor like "c%";

-- Faça um um select com Inner join entre tabela categoria e pizza
select * from tb_pizza inner join tb_categoria
on tb_categoria.id = tb_pizza.id_categoria;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são pizza doce).
select * from tb_pizza inner join tb_categoria
on tb_categoria.id = tb_pizza.id_categoria
where id_categoria = 4;
