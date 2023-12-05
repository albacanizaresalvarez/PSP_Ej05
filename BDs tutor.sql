CREATE TABLE tutor (
    codTutor    	    INTEGER primary key,
    nombre	    	    VARCHAR(20),
    apellidos        	VARCHAR(20),
    fototutor  	        VARCHAR(20),
    sueldo	        	NUMERIC(6,2), 
    entradaCentro       DATE,
    contrasena          VARCHAR(20)
);

CREATE TABLE alumno (
    codAlum		        INTEGER primary key,
    nombreAlum	    	VARCHAR(20),
    edadAlum		    INTEGER,
    fotoAlum  	        VARCHAR(20),
    notaMediaAlum       NUMERIC(6,2), 
    fechaNacimiento  	DATE,
    codTutor		    INTEGER references Tutor
);

INSERT INTO tutor VALUES (1026,'Pablo','Rodriguez','tutor1.jpg',2400,'10/15/2021', 'tutoralumno');
INSERT INTO tutor VALUES (1027,'Alba','Canizares','tutor3.jpg',1200,'07/25/2019', 'tutoralumno');
INSERT INTO tutor VALUES (1028,'Irene','Moya','tutor4.jpg',1500,'06/29/2020', 'tutoralumno');
INSERT INTO tutor VALUES (1029,'Tomas','Garcia','tutor2.jpg',2100,'07/15/2020', 'tutoralumno');
INSERT INTO tutor VALUES (1030,'Juan','Canizares','tutor2.jpg',2500,'10/15/2021', 'tutoralumno');

INSERT INTO alumno VALUES (101,'Manuel', 3, 'alumno1.jpg',9.5 , '10/17/2018', 1027);
INSERT INTO alumno VALUES (102,'Antonio', 4,'alumno2.jpg', 2.9, '11/01/2019', 1028);
INSERT INTO alumno VALUES (103,'Gonzalo', 6,'alumno5.jpg',9, '01/05/2019', 1026);
INSERT INTO alumno VALUES (104,'Sebastian', 8,'alumno2.jpg', 4.5,'08/14/2019', 1027);
INSERT INTO alumno VALUES (105,'Amalia', 2,'alumno4.jpg', 5.6, '06/20/2021', 1028);
INSERT INTO alumno VALUES (106,'Manuel', 7,'alumno1.jpg',8.4,'05/28/2021', 1028);
INSERT INTO alumno VALUES (107,'Sabrina', 8,'alumno3.jpg',8,'03/10/2019', 1026);
INSERT INTO alumno VALUES (108,'Pascual', 6,'alumno2.jpg',7.2,'07/11/2020', 1026);
INSERT INTO alumno VALUES (109,'Luna', 4,'alumno3.jpg',8.3,'06/12/2020',1028);
INSERT INTO alumno VALUES (110,'Mario', 3,'alumno5.jpg',3.5,'11/21/2021', 1028);
INSERT INTO alumno VALUES (111,'Luna', 5,'alumno3.jpg',8.3,'06/12/2020',1030);
INSERT INTO alumno VALUES (112,'Mario', 5,'alumno5.jpg',3.5,'11/21/2021', 1029);
INSERT INTO alumno VALUES (113,'Amalia', 2,'alumno4.jpg', 5.6, '06/20/2021', 1029);
INSERT INTO alumno VALUES (114,'Manuel', 7,'alumno1.jpg',8.4,'05/28/2021', 1030);

SELECT *
FROM tutor;

SELECT *
FROM tutor
WHERE sueldo > 2000;

SELECT *
FROM tutor
WHERE apellidos = 'Garcia';

SELECT sum (sueldo)
FROM tutor
WHERE apellidos = 'Canizares';
..-------------------------------------------------------------------------
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

