..Crear Tabla:

CREATE TABLE tutor (
    codTutor    		INTEGER primary key,
    nombre	    	VARCHAR(20),
    apellidos    	VARCHAR(20),
    fototutor  	        VARCHAR(20),
    sueldo	    	NUMERIC(6,2), 
    entradaCentro  		DATE 
);

.. Inserciones

INSERT INTO turor VALUES (1026,'Pablo','Rodriguez','default.jpg',2400,'10/15/2021');
INSERT INTO turor VALUES (1027,'Alba','Canizares','default.jpg',1200,'07/25/2019');
INSERT INTO turor VALUES (1028,'Irene','Moya','1028.jpg',1500,'06/29/2020');
INSERT INTO turor VALUES (1029,'Tomas','Garcia','1029.jpg',2100,'07/15/2020');
INSERT INTO turor VALUES (1030,'Juan','Canizares','1030.jpg',2500,'10/15/2021');

..Consultas interesantes:

SELECT *
FROM tutor;

SELECT *
FROM tutor
WHERE sueldo > 2000;

SELECT *
FROM tutor
WHERE apellido = 'Garcia';

SELECT sum (sueldo)
FROM empleado
WHERE apellido = 'Canizares';






