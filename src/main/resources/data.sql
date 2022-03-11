insert into asignatura (id,nombre,descripcion,curso)
  select 1,'Programación','Fundamentos prog. aplicaciones informáticas', 1
  from dual
  where not exists (select 1 from asignatura where id=1);
 
insert into asignatura (id,nombre,descripcion,curso)
  select 2,'Bases de datos','Fundamentos sist. gestión bases de datos', 2
  from dual
  where not exists (select 1 from asignatura where id=2);