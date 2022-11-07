Create Table Curso(
id int not null auto_increment primary key,
carg int not null,
perd varchar(15),
nomecurso varchar(100)

);

insert into curso(nomecurso,carg,perd) values ("Desenvolvimento de Sistema",3,"manhã");
insert into curso(nomecurso,carg,perd) values ("Gatronomia",1,"manhã");
insert into curso(nomecurso,carg,perd) values ("Administração",2,"tarde");
insert into curso(nomecurso,carg,perd) values ("Química",3,"noite");
