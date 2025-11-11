DROP DATABASE IF EXISTS tanar_company;
CREATE DATABASE tanar_company;
USE tanar_company;

CREATE TABLE cities(
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	city VARCHAR(50)
);

CREATE TABLE roles(
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	role VARCHAR(100)
);

CREATE TABLE workers(
	id INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(50),
	salary INTEGER,
	birth_date DATE,
	hire_date DATE,
	address VARCHAR(100),
	city_id INTEGER,
	role_id INTEGER,
	FOREIGN KEY( city_id ) REFERENCES cities( id ),
	FOREIGN KEY( role_id ) REFERENCES roles( id )
);

INSERT INTO roles (role) VALUES
('Szoftverfejlesztő'),
('Projektmenedzser'),
('HR Munkatárs'),
('Grafikus Tervező'),
('Adatbázis Adminisztrátor'),
('Ügyfélszolgálati Munkatárs'),
('Marketing Menedzser'),
('Pénzügyi Elemző'),
('Rendszergazda'),
('Minőségellenőr');

INSERT INTO cities (city) VALUES
('Budapest'),
('Debrecen'),
('Szeged'),
('Miskolc'),
('Pécs'),
('Győr'),
('Nyíregyháza'),
('Kecskemét'),
('Székesfehérvár'),
('Szombathely'),
('Tatabánya'),
('Sopron'),
('Kaposvár'),
('Veszprém'),
('Békéscsaba'),
('Zalaegerszeg'),
('Eger'),
('Nagykanizsa'),
('Dunaújváros'),
('Hódmezővásárhely');

INSERT INTO workers (name, salary, birth_date, hire_date, address, city_id, role_id) VALUES
('Nagy Zoltán', 550000, '1985-03-12', '2015-06-20', 'Petőfi utca 12.', 1, 1),
('Kovács Anna', 620000, '1990-08-25', '2018-01-15', 'Kossuth tér 5.', 2, 2),
('Tóth Gábor', 480000, '1992-11-01', '2019-09-10', 'Szabadság út 33.', 3, 3),
('Szabó Eszter', 710000, '1988-04-18', '2016-03-05', 'Hősök tere 8.', 4, 4),
('Varga Dávid', 580000, '1995-07-07', '2020-02-28', 'Rákóczi út 45.', 5, 5),
('Horváth Krisztina', 530000, '1991-02-22', '2017-11-11', 'Bartók Béla utca 10.', 6, 6),
('Kiss Bence', 650000, '1987-10-30', '2014-08-01', 'Ady Endre utca 21.', 7, 7),
('Fekete Judit', 490000, '1993-06-14', '2021-05-20', 'József Attila utca 6.', 8, 8),
('Molnár Péter', 700000, '1984-09-03', '2013-04-10', 'Dózsa György út 17.', 9, 9),
('Balogh Mária', 510000, '1996-12-28', '2022-01-07', 'Arany János utca 3.', 10, 10),
('Papp Ádám', 600000, '1989-05-09', '2018-07-01', 'Kálvin tér 9.', 11, 1),
('Takács Orsolya', 540000, '1994-01-19', '2020-10-15', 'Kazinczy utca 22.', 12, 2),
('Juhász Ferenc', 470000, '1997-03-24', '2021-04-01', 'Ferenciek tere 1.', 13, 3),
('Simon Kata', 730000, '1986-11-16', '2015-09-29', 'Margit körút 14.', 14, 4),
('Fodor Zsolt', 590000, '1998-08-02', '2022-06-18', 'Bajcsy-Zsilinszky út 7.', 15, 5),
('Gál Réka', 560000, '1990-09-29', '2017-02-14', 'Deák Ferenc utca 25.', 16, 6),
('Katona Márk', 680000, '1983-05-05', '2014-12-05', 'Vörösmarty tér 11.', 17, 7),
('Kovács Sándor', 520000, '1995-02-08', '2020-03-20', 'Római tér 30.', 18, 8),
('Lakatos Viktória', 750000, '1982-10-10', '2013-08-22', 'Lehel tér 2.', 19, 9),
('Lengyel Norbert', 500000, '1996-04-04', '2021-12-01', 'Blaha Lujza tér 13.', 20, 10),
('Oláh Gergő', 610000, '1988-07-17', '2016-05-15', 'Liszt Ferenc tér 16.', 1, 1),
('Szűcs Andrea', 570000, '1991-03-29', '2019-08-05', 'Oktogon 19.', 2, 2),
('Fülöp Máté', 495000, '1993-09-06', '2020-11-25', 'Andrássy út 28.', 3, 3),
('Bíró Klaudia', 720000, '1987-12-12', '2017-06-30', 'Váci utca 4.', 4, 4),
('Vincze Tamás', 595000, '1995-04-21', '2021-03-10', 'Király utca 18.', 5, 5),
('Németh Eszter', 545000, '1990-01-03', '2018-09-01', 'Rumbach Sebestyén utca 2.', 6, 6),
('Pásztor Gábor', 660000, '1984-06-08', '2015-04-10', 'Dob utca 23.', 7, 7),
('Juhász Dóra', 505000, '1992-10-14', '2022-02-14', 'Wesselényi utca 15.', 8, 8),
('Gulyás István', 715000, '1986-08-27', '2014-07-28', 'Kertész utca 26.', 9, 9),
('Kovács Éva', 525000, '1994-05-31', '2020-04-12', 'Nagymező utca 1.', 10, 10),
('Balázs Levente', 630000, '1989-02-05', '2017-10-20', 'Szent István körút 32.', 11, 1),
('Kiss Renáta', 585000, '1991-11-19', '2019-01-22', 'Teréz körút 3.', 12, 2),
('Fekete Roland', 485000, '1996-07-11', '2021-08-01', 'Erzsébet körút 6.', 13, 3),
('Molnár Zsófia', 740000, '1985-06-25', '2016-02-10', 'Andrássy út 54.', 14, 4),
('Szabó Kristóf', 605000, '1997-09-13', '2022-05-01', 'Károly körút 40.', 15, 5),
('Pál Zsuzsanna', 555000, '1990-04-09', '2018-06-05', 'Benczúr utca 20.', 16, 6),
('Tóth Márton', 670000, '1983-01-28', '2015-01-19', 'Bajza utca 1.', 17, 7),
('Horváth Ákos', 515000, '1994-03-17', '2020-07-08', 'Kodály körönd 8.', 18, 8),
('Varga Anett', 760000, '1981-12-06', '2014-02-28', 'Hősök tere 2.', 19, 9),
('Kiss János', 535000, '1996-09-22', '2021-10-09', 'Erzsébet tér 10.', 20, 10),
('Gál Péter', 640000, '1987-04-14', '2016-09-25', 'Múzeum körút 11.', 1, 1),
('Borbély Nikolett', 590000, '1992-08-05', '2019-03-03', 'Rákóczi út 14.', 2, 2),
('Major Ágnes', 490000, '1995-10-18', '2020-12-06', 'Kálvin tér 1.', 3, 3),
('Székely Gergely', 700000, '1986-03-02', '2017-04-17', 'Vámház körút 9.', 4, 4),
('Bognár Sándor', 610000, '1998-01-29', '2022-07-07', 'Üllői út 16.', 5, 5),
('Gulyás Orsolya', 560000, '1991-05-11', '2018-08-15', 'Páter utca 3.', 6, 6),
('Szekeres Balázs', 690000, '1984-10-23', '2015-02-01', 'Szent Gellért tér 24.', 7, 7),
('Antal Viktória', 520000, '1993-02-15', '2021-06-25', 'Városligeti fasor 31.', 8, 8),
('Fekete Gábor', 730000, '1985-07-09', '2014-05-18', 'Dózsa György út 1.', 9, 9),
('Kocsis Bence', 540000, '1997-06-03', '2020-05-10', 'Hunyadi utca 7.', 10, 10);


