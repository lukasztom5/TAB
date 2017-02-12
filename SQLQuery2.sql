create database projekt
drop database projekt
drop table dane
drop table uzytkownik
drop table historia
create table uzytkownik(
   ID   INT Not Null primary key,
   Imie VARCHAR (50)  Not Null,
   Nazwisko VARCHAR (50)  Not Null,
   login VARCHAR (50)  Not Null unique,
   Data_logowania date,
   liczba_prob int

   )

create table dane(
   ID   INT Not Null primary key,
   IDuser   INT Not Null,
   haslo VARCHAR (50)  Not Null unique,
   data_zmiany_hasla date

   )
create table historia(
   ID   INT Not Null primary key,
   IDuser   INT Not Null,
   IDDane   INT Not Null,
   haslo VARCHAR (50)  Not Null,
   data_zmiany_hasla date

   )
insert into uzytkownik(ID,imie,nazwisko,login,Data_logowania,liczba_prob) values(1,'Jan','Kowalski','admin',NULL,0)
insert into dane(ID,IDuser,haslo,data_zmiany_hasla) values(1,1,'admin','2017-02-06')
insert into historia(ID,IDuser,IDDane,haslo,data_zmiany_hasla) values(1,1,1,'admin','2017-02-06')

select *from uzytkownik where Id=(select ID from dane where login='admin' and haslo='admin')

ALTER TABLE historia
ADD CONSTRAINT FK_u_d FOREIGN KEY(IDUser) 
    REFERENCES uzytkownik(ID);
ALTER TABLE historia
ADD CONSTRAINT FK_u_h FOREIGN KEY(IDDane) 
    REFERENCES dane(ID);


ALTER TABLE historia  
DROP CONSTRAINT FK_u_d;   
GO
ALTER TABLE uzytkownik 
DROP CONSTRAINT FK_u_d;   
GO    