CREATE DATABASE lab_04;

USE lab_04;

CREATE TABLE Tab_Depto (
ID INT AUTO_INCREMENT PRIMARY KEY,
Nome VARCHAR(60) NOT NULL DEFAULT ('Vendas'),
Localizacao VARCHAR(60) DEFAULT ('Bloco A'), 
Sala CHAR(3) NOT NULL, 
Fone VARCHAR(20)
);

INSERT Tab_Depto (Sala, Fone) VALUES ('80', '(41)3021-4040'); 		-- b.1) tratamento de campos omitidos
INSERT Tab_Depto (Sala) VALUES ('100');							 	-- b.2) tratamento de campos omitidos
INSERT Tab_Depto (Localizacao, Sala) VALUES (NULL,'200'); 			-- b.3) tratamento de NULL
INSERT Tab_Depto (Sala) VALUES ('000'); 							-- b.4) tratamento de NULL
INSERT Tab_Depto (Localizacao, Sala) VALUES (NULL, '300'); 			-- b.5) tratamento de NULL

SELECT * FROM Tab_Depto;

-- a)
CREATE TABLE Editora (
ID_edit INT AUTO_INCREMENT PRIMARY KEY, -- Tabela PAI
Nome_Edit VARCHAR(60) NOT NULL,
Cidade VARCHAR(60) NOT NULL,
Estado CHAR(2) NOT NULL,
Pais VARCHAR(50) NOT NULL
);

INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('Editora AAA', 'São Paulo', 'SP', 'Brasil');
INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('Editora Sul', 'Porto Alegre', 'RS', 'Brasil');
INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('LTC', 'São Paulo', 'SP', 'Brasil');
INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('CENGAGE', 'Rio de Janeiro', 'RJ', 'Brasil');
INSERT Editora (Nome_Edit, Cidade, Estado, Pais) VALUES ('Três Estrelas', 'Alagoas', 'CE', 'Brasil');

-- b)
CREATE TABLE Autor (
ID_Autor INT AUTO_INCREMENT PRIMARY KEY, -- Tabela FILHO
Nome_Autor VARCHAR(60) NOT NULL,
Dt_Nasc DATE NOT NULL,
fk_ID_Edit INT NULL
);

ALTER TABLE Autor ADD CONSTRAINT FK_Autor_Editora FOREIGN KEY(fk_ID_edit)
REFERENCES Editora (ID_edit)
ON UPDATE CASCADE
ON DELETE CASCADE ;

ALTER TABLE Autor AUTO_INCREMENT = 100; -- Seed = 100 (início do AUTO_INCREMENT)
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('José', '1956-09-08', 1);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Maria', '1975-04-18', 2);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Antônia', '1954-12-10', 3);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Armínio', '1976-07-28', 5);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Luiza', '1945-11-09', 5);

-- c)
SELECT * FROM Editora;
SELECT * FROM Autor;

UPDATE Editora
SET ID_edit = 50
WHERE ID_edit = 5;

SELECT * FROM Editora;
SELECT * FROM Autor;

-- d)
SELECT * FROM Editora;
SELECT * FROM Autor;

DELETE FROM Editora
WHERE ID_edit = 1;

SELECT * FROM Editora;
SELECT * FROM Autor;

-- e)
UPDATE Editora
SET ID_edit = 5
WHERE ID_edit = 50;

DROP TABLE Autor;
CREATE TABLE Autor -- Alterando Tabela Autor
(
ID_Autor INT AUTO_INCREMENT PRIMARY KEY, -- Tabela FILHO
Nome_Autor VARCHAR(60) NOT NULL,
Dt_Nasc DATE NOT NULL,
fk_ID_Edit INT NULL
);

ALTER TABLE Autor ADD CONSTRAINT FK_Autor_Editora FOREIGN KEY(fk_ID_edit)
REFERENCES Editora (ID_edit)
ON UPDATE RESTRICT
ON DELETE RESTRICT ;

ALTER TABLE Autor AUTO_INCREMENT = 100; -- Seed = 100 (início do AUTO_INCREMENT)
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('José', '1956-09-08', 1);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Maria', '1975-04-18', 2);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Antônia', '1954-12-10', 3);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Armínio', '1976-07-28', 5);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Luiza', '1945-11-09', 6);

-- f)
SELECT * FROM Editora;
SELECT * FROM Autor;

UPDATE Editora
SET ID_edit = 50
WHERE ID_edit = 5;

SELECT * FROM Editora;
SELECT * FROM Autor;


-- g)
SELECT * FROM Editora;
SELECT * FROM Autor;

DELETE FROM Editora
WHERE ID_edit = 1;

SELECT * FROM Editora;
SELECT * FROM Autor;

-- h)
UPDATE Editora
 SET ID_edit = 5
 WHERE ID_edit = 50;
 
DROP TABLE Autor;
CREATE TABLE Autor (
	ID_Autor INT AUTO_INCREMENT PRIMARY KEY, -- Tabela FILHO
	Nome_Autor VARCHAR(60) NOT NULL,
	Dt_Nasc DATE NOT NULL,
	fk_ID_Edit INT NULL
);

ALTER TABLE Autor ADD CONSTRAINT FK_Autor_Editora FOREIGN KEY(fk_ID_edit)
REFERENCES Editora (ID_edit)
ON UPDATE SET NULL
ON DELETE SET NULL;

ALTER TABLE Autor AUTO_INCREMENT = 100; -- Seed = 100 (início do AUTO_INCREMENT)
INSERT Autor (Nome_Autor, Dt_Nasc) VALUES ('José', '1956-09-08');
INSERT Autor (Nome_Autor, Dt_Nasc) VALUES ('Maria', '1975-04-18');
INSERT Autor (Nome_Autor, Dt_Nasc) VALUES ('Antônia', '1954-12-10');
INSERT Autor (Nome_Autor, Dt_Nasc) VALUES ('Armínio', '1976-07-28');
INSERT Autor (Nome_Autor, Dt_Nasc) VALUES ('Luiza', '1945-11-09');

-- i)
SELECT * FROM Editora;
SELECT * FROM Autor;

UPDATE Editora
SET ID_edit = 50
WHERE ID_edit = 5;

SELECT * FROM Editora;
SELECT * FROM Autor;

-- j)
SELECT * FROM Editora;
SELECT * FROM Autor;

DELETE FROM Editora
WHERE ID_edit = 1;

SELECT * FROM Editora;
SELECT * FROM Autor;