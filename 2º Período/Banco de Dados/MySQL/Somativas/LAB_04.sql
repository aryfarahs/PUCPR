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

INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('José', '1956-09-08', 1);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Maria', '1975-04-18', 2);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Antônia', '1954-12-10', 3);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Armínio', '1976-07-28', 5);
INSERT Autor (Nome_Autor, Dt_Nasc, fk_ID_Edit) VALUES ('Luiza', '1945-11-09', 5);

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


-- 4.3
-- a)
CREATE TABLE Tab_Um (
ID_um INT PRIMARY KEY NOT NULL,
col_1 CHAR(3) NOT NULL
);

CREATE TABLE Tab_Dois (
fk_ID_um INT PRIMARY KEY NOT NULL,
col_2 CHAR(3) NOT NULL,
FOREIGN KEY (FK_ID_um)
REFERENCES Tab_Um (ID_um)
);

CREATE VIEW JuntaUmDois AS (
SELECT ID_um, col_1, fk_ID_um, col_2
FROM Tab_Um JOIN Tab_Dois
ON (Tab_Um.ID_um = Tab_Dois.fk_ID_um)
);

--------------------------------------------------------------------------------------

-- b) 

-- 1º. INSERT
INSERT Tab_Um (ID_um, col_1) VALUES (5, 'AAA');
SELECT * FROM JuntaUmDois;
SELECT * FROM Tab_Um;
SELECT * FROM Tab_Dois;

-- 2º. INSERT
INSERT Tab_Dois(fk_ID_um, col_2) VALUES (5, 'XXX');
SELECT * FROM JuntaUmDois;
SELECT * FROM Tab_Um;
SELECT * FROM Tab_Dois;

-- c)
-- 1º. INSERT
INSERT JuntaUmDois (ID_Um, col_1) VALUES (10, 'BBB');
SELECT * FROM JuntaUmDois;
SELECT * FROM Tab_Um;
SELECT * FROM Tab_Dois;

-- 2º. INSERT
INSERT JuntaUmDois(fk_ID_um, col_2) VALUES (10, 'YYY');
SELECT * FROM JuntaUmDois;
SELECT * FROM Tab_Um;
SELECT * FROM Tab_Dois;

-- 4.4
-- a)
CREATE TABLE Empresa (
ID INT PRIMARY KEY AUTO_INCREMENT,
Nome VARCHAR(20),
Atuacao VARCHAR(50),
Cidade VARCHAR(20),
Estado VARCHAR(2)
);

INSERT Empresa (Nome, Atuacao, Cidade, Estado) VALUES
('ACME Corp.','Cartoons','São Paulo','SP'),
('Estrela Ltda.', 'Transporte passageiros','Campinas','SP'),
('Aurora','Panificadora','Belo Horizonte','MG'),
('Azul','Aviação','São Paulo','SP'),
('Leão Ltda.','Bebidas','Curitiba','PR'),
('Petit S.A.','Queijos e frios', 'Uberlândia','MG'),
('Barreados Corp.','Alimentos congelados','Morretes','PR');

SELECT * FROM Empresa;

-- b)
CREATE TABLE Estoque (
ID INT PRIMARY KEY AUTO_INCREMENT,
Nome VARCHAR(20),
Qtde INT DEFAULT 10,
ValUnit DECIMAL(10,2)
);

INSERT Estoque (Nome, Qtde, ValUnit) VALUES
('caderno',200,15.00),
('borracha',50,6.50),
('caneta',300, 5.50),
('régua 30cm',80, 10.00),
('lápis',500, 4.00),
('bloco A4',35, 18.45);

SELECT * FROM Estoque;

-- c)
SET @nome_produto = 'none'; -- Declara e inicializa variáveis de sessão
SET @total_produtos = -1;

SELECT nome INTO @nome_produto FROM Estoque
WHERE ID = 3;

SELECT COUNT(*) INTO @total_produtos FROM Estoque;

SELECT @nome_produto AS 'Produto com ID = 3';
SELECT @total_produtos AS 'Total de Produtos Cadastrados';

-- d)
DELIMITER $$ -- Altera delimitador de comando para não conflitar com a SP
DROP PROCEDURE IF EXISTS proc_demo1; -- Exclui procedure, se já existir
CREATE PROCEDURE proc_demo1() -- Cria procedure proc_demo1(), sem parâmetros

BEGIN
	DECLARE i INT DEFAULT 0; -- Declara e inicializa variáveis locais
	DECLARE output VARCHAR(100) DEFAULT 'Saída = ';
	WHILE i < 10 DO
		SET output = CONCAT(output, i , ', ');
		SET i = i + 1;
	END WHILE;
	SELECT output;
END
$$ DELIMITER ; -- Retorna ao delimitador padrão da linguagem

CALL proc_demo1(); -- Chama a STORED PROCEDURE proc_demo1()


CALL proc_demo1(); -- Chama a STORED PROCEDURE proc_demo1()