create database chmura;
use chmura;
create table zjawiska (
id int auto_increment,
nazwa char (50),
poczatek datetime,
koniec datetime,
deszcz char(3),
grad char(3),
wyladowania char (3),
predkosc_wiatru int,
intensywnosc int
);