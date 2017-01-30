create database projekt
drop database projekt
drop table dane
drop table uzytkownik
create table uzytkownik(
   ID   INT Not Null primary key,
   Imie VARCHAR (50)  Not Null,
   Nazwisko VARCHAR (50)  Not Null
   

   )

create table dane(
   ID   INT Not Null primary key,
   login VARCHAR (50)  Not Null,
   haslo VARCHAR (50)  Not Null,
   liczba_prob Varchar(50) not null

   )

insert into uzytkownik(ID,imie,nazwisko) values(1,'Jan','Kowalski')
insert into dane(ID,login,haslo,liczba_prob) values(1,'admin','admin','0')

select *from uzytkownik where Id=(select ID from dane where login='admin' and haslo='admin')

ALTER TABLE uzytkownik
ADD CONSTRAINT FK_u_d FOREIGN KEY(ID) 
    REFERENCES dane(ID);

ALTER TABLE uzytkownik  
DROP CONSTRAINT FK_u_d;   
GO  