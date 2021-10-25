-- Criando banco de dados 
create database db_generation_game_online;

-- Selecionando banco de dados
use db_generation_game_online;

-- Criando a tabela tb_classe
create table tb_classe(
id bigint auto_increment,
categoria varchar (255),
regiao varchar (255),
energia int,
primary key (id));

-- Populando dados na tabela
insert into tb_classe (categoria, regiao, energia) values ("mago", "norte", 90);
insert into tb_classe (categoria, regiao, energia) values ("elfo", "sul", 95);
insert into tb_classe (categoria, regiao, energia) values ("hobbit", "nordeste", 80);
insert into tb_classe (categoria, regiao, energia) values ("arqueiro", "leste", 75);
insert into tb_classe (categoria, regiao, energia) values ("guerreiro", "oeste", 70);

select * from tb_classe;

-- Criando a tabela tb_personagem
create table tb_personagem(
id bigint auto_increment,
nome varchar (255),
genero varchar (255),
skin boolean not null,
ataque int,
defesa int,
classe_id bigint,
primary key (id),
foreign key (classe_id) references tb_classe(id));

-- Populando dados na tabela
insert into tb_personagem (nome, genero, skin, ataque, defesa, classe_id) 
values ("Valkiria", "ela", true, 4000, 2500, 2);
insert into tb_personagem (nome, genero, skin, ataque, defesa, classe_id) 
values ("Takki", "ele", true, 3000, 1500, 5);
insert into tb_personagem (nome, genero, skin, ataque, defesa, classe_id) 
values ("Gorky", "elu", true, 5000, 900, 4);
insert into tb_personagem (nome, genero, skin, ataque, defesa, classe_id) 
values ("Vankar", "elu", true, 4000, 2000, 1);
insert into tb_personagem (nome, genero, skin, ataque, defesa, classe_id) 
values ("Freuda", "ela", true, 1000, 3000, 3);
insert into tb_personagem (nome, genero, skin, ataque, defesa, classe_id) 
values ("Carakki", "ele", true, 4000, 1000, 2);
insert into tb_personagem (nome, genero, skin, ataque, defesa, classe_id) 
values ("Celestre", "elu", true, 2000, 2000, 1);
insert into tb_personagem (nome, genero, skin, ataque, defesa, classe_id) 
values ("Caleb", "ele", true, 5000, 800, 4);

select * from tb_personagem;

-- Faça um select que retorne os personagens com o poder de ataque maior do que 2000
select * from tb_personagem where ataque > 2000;

-- Faça um select trazendo os personagens com poder de defesa entre 1000 e 2000
select * from tb_personagem where defesa between 1000 and 2000;

-- Faça um select utilizando LIKE buscando os personagens com a letra C
select * from tb_personagem where nome like "c%";

-- Faça um um select com Inner join entre tabela classe e personagem
select * from tb_personagem inner join tb_classe
on tb_classe.id = tb_personagem.classe_id; 

-- Faça um select onde traga todos os personagem de uma classe específica (exemplo todos os personagens que são arqueiros).
select * from tb_personagem inner join tb_classe
on tb_classe.id = tb_personagem.classe_id
where classe_id = 4;





