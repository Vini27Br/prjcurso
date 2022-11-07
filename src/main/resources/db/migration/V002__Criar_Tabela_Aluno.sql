Create Table Aluno(
id int not null auto_increment primary key,
nomealuno varchar(30),
cursoid int not null,
anodeconclusao int not null
);

Alter Table Aluno add CONSTRAINT FK_Aluno_Curso foreign key(cursoid) references curso(id);

insert into Aluno(nomealuno, cursoid, anodeconclusao)