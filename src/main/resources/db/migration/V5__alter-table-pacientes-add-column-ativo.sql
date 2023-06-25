alter table pacientes
add ativo tinyint not null;

update pacientes
set ativo = 1;