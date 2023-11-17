..Crear Tabla:

CREATE TABLE alumno (
    codAlum		INTEGER primary key,
    nombreAlum	    	VARCHAR(20),
    edadAlum		INTEGER,
    fotoAlum  	        VARCHAR(20),
    notaMediaAlum           NUMERIC(6,2), 
    fechaNacimiento  		DATE,
    codTutor		INTEGER,
    constraint fk_alu foreign key references Tutor on delete cascade
);

.. Inserciones

INSERT INTO alumno VALUES (101,'Manuel', 23, '1001.jpg',9.5 , '10/17/2018');
INSERT INTO alumno VALUES (102,'Antonio', 24,'Prado','1002.jpg', 2.9, '11/01/2019');
INSERT INTO alumno VALUES (103,'Gonzalo', 26,'Gonzalez','default.jpg',9, '01/05/2019');
INSERT INTO alumno VALUES (104,'Sebastian', 18,'Sastre','1004.jpg', 4.5,'08/14/2019');
INSERT INTO alumno VALUES (105,'Amalia', 21,'1005.jpg', 5.6, '06/20/2021');
INSERT INTO alumno VALUES (106,'Manuel', 217,'default.jpg',8.4,'05/28/2021');
INSERT INTO alumno VALUES (107,'Sabrina', 28,'1007.jpg',8,'03/10/2019');
INSERT INTO alumno VALUES (108,'Pascual', 26,'1008.jpg',7.2,'07/11/2020');
INSERT INTO alumno VALUES (109,'Luna', 27,'1009.jpg',8.3,'06/12/2020');
INSERT INTO alumno VALUES (110,'Maria', 20,'1010.jpg',3.5,'11/21/2021');


..Consultas interesantes:

SELECT *
FROM alumno;

SELECT *
FROM alumno
WHERE notaMediaAlum+0.5 > 8;

SELECT *
FROM alumno
WHERE nombreAlum = 'Manuel';

SELECT avg (notaMediaAlum)
FROM alumno
WHERE edad>24;
