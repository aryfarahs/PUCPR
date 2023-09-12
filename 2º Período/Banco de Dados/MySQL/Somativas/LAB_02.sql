CREATE DATABASE LAB_02;

USE LAB_02;

CREATE TABLE Disciplina
(
id_discip int	 NOT NULL,
nome varchar(50) NOT NULL,
ementa text,
creditos int 	 NOT NULL,
periodo int 	 NOT NULL
);

ALTER TABLE disciplina
ADD CONSTRAINT PRIMARY KEY (ID_discip);

INSERT INTO disciplina 
VALUES (1, 'Banco de Dados', NULL, 4, 2);

INSERT INTO disciplina
VALUES (2, 'Redes', 'Básico de redes de computadores', 4, 3);

INSERT INTO disciplina
VALUES (3, 'Engenharia de Requisitos', NULL, 4, 2);

INSERT INTO disciplina
VALUES (4, 'Programação Web', 'Desenvolvendo sites', 4, 3);

INSERT INTO disciplina
VALUES (5, 'Lógica Matemática', 'Resolvendo problemas de computação com lógica', 4, 3);

INSERT INTO disciplina
VALUES (6, 'Interação Humano Computador', 'Interface x Interação', 4, 3);

INSERT INTO disciplina
VALUES (7, 'Ethical Hacking', 'Introdução ao Ethical Hacking', 4, 4);

SELECT * FROM disciplina;


CREATE TABLE Professor (
id_prof 		INT AUTO_INCREMENT PRIMARY KEY,
nome			VARCHAR(50) NOT NULL,
dt_nascimento	DATE,
apelido			VARCHAR(50) GENERATED ALWAYS AS (SUBSTRING_INDEX(nome, " ", 1))
);

SELECT DATE_FORMAT(curdate(), '%d/%m/%y') AS Data;

INSERT INTO Professor (nome, dt_nascimento)
VALUES ('Maria das Flores', STR_TO_DATE('23/12/1990', '%d/%m/%Y'));

INSERT INTO Professor (nome, dt_nascimento)
VALUES ('José da Silva', STR_TO_DATE('20/02/1985', '%d/%m/%Y')),
	   ('Paulo Soares', STR_TO_DATE('10/12/1995', '%d/%m/%Y')),
       ('Ana Rita', STR_TO_DATE('20/02/2000', '%d/%m/%Y'));
       
SELECT * FROM Professor;

SELECT nome, dt_nascimento AS 'Data de Nascimento',
TIMESTAMPDIFF(YEAR, dt_nascimento, CURDATE()) AS Idade
FROM Professor;


CREATE TABLE Turma (
id_turma	int AUTO_INCREMENT PRIMARY KEY,
ano			int NOT NULL,
semestre	int NOT NULL,
id_discip	int NOT NULL,
id_prof		int NOT NULL,
CONSTRAINT CK_Sem	 CHECK (semestre BETWEEN 1 AND 2),
CONSTRAINT UN_Ofeta	 UNIQUE (ano, semestre, id_discip, id_prof),
CONSTRAINT FK_Prof	 FOREIGN KEY (id_prof)   REFERENCES Professor  (id_prof),
CONSTRAINT FK_Discip FOREIGN KEY (id_discip) REFERENCES Disciplina (id_discip)
);

INSERT INTO Turma (ano, semestre, id_prof, id_discip)
VALUES (2020, 1, 2, 2),
	   (2020, 2, 2, 2),
	   (2020, 1, 3, 1);

INSERT INTO Turma (ano, semestre, id_prof, id_discip)
VALUES (2020, 1, 2, 1);

INSERT INTO Turma (ano, semestre, id_prof, id_discip)
VALUES (2020, 2, 4, 2);

SELECT * FROM Turma;


       

