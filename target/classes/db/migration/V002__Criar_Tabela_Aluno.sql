Create Table Aluno(
id int not null auto_increment primary key,
nomealuno varchar(30),
cursoid int not null,
anodeconclusao int not null
);

Alter Table Aluno add CONSTRAINT FK_Aluno_Curso foreign key(cursoid) references curso(id);

insert into Aluno(nomealuno, cursoid, anodeconclusao) values
("Huginho",1,2010),
("Zezinho",2,2011),
("Luizinho",3,2012),
("Ricardão",3,2007);