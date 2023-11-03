CREATE DATABASE lab_05;

USE lab_05;



-- 5.1
-- a)
DELIMITER $$
-- function: não usa IN / OUT nos parâmetros da função
CREATE FUNCTION Diagonal (ladoA FLOAT, ladoB FLOAT)
RETURNS FLOAT
DETERMINISTIC -- define que a função é determinística
BEGIN
	DECLARE DIAG FLOAT DEFAULT -1;
	SET DIAG = SQRT(POWER(ladoA, 2) + POWER(ladoB, 2));
	RETURN DIAG;
END; $$
DELIMITER ;
SELECT Diagonal(3, 4) AS 'Diagonal do retângulo 3m x 4m';

-- b)
DELIMITER $$
CREATE FUNCTION CalcSalario (valor_inicial INT)
RETURNS INT
DETERMINISTIC
BEGIN
	DECLARE salario INT DEFAULT 0;
	WHILE salario <= 3000 DO
		SET salario = salario + valor_inicial;
		END WHILE;
	RETURN salario;
END; $$
DELIMITER ;

SELECT CalcSalario(500) AS 'Salário Final';
SELECT CalcSalario(200) AS 'Salário Final';
SELECT CalcSalario(2000) AS 'Salário Final';



-- 5.2)
-- a)
DROP TABLE IF EXISTS Tab_Teste;
CREATE TABLE Tab_Teste (
col1 INT NOT NULL PRIMARY KEY,
col2 INT NOT NULL);
SELECT * FROM Tab_Teste;

-- b) 
START TRANSACTION ;
INSERT Tab_Teste VALUES (1,111) ;
INSERT Tab_Teste VALUES (2,222) ;
COMMIT;
SELECT * FROM Tab_Teste;

-- c)
START TRANSACTION ;
INSERT Tab_Teste VALUES (3,333) ;
INSERT Tab_Teste VALUES (4,444) ;
ROLLBACK;
SELECT * FROM Tab_Teste;



-- 5.3
-- a)
DROP TABLE IF EXISTS Tab_Teste;
CREATE TABLE Tab_Teste (
col1 INT NOT NULL PRIMARY KEY,
col2 INT NOT NULL);
SELECT * FROM Tab_Teste;


-- b)
DROP PROCEDURE IF EXISTS nãoTratErroTransact;
DELIMITER $$
CREATE PROCEDURE nãoTratErroTransact()
BEGIN
	START TRANSACTION;
	INSERT Tab_Teste VALUES (1,111) ;
	INSERT Tab_Teste VALUES (2,222) ;
	INSERT Tab_Teste VALUES (3,333) ;
	INSERT Tab_Teste VALUES (4,444) ;
	COMMIT; -- esse commando executa?
END $$
DELIMITER ;
CALL nãoTratErroTransact();
SELECT * FROM Tab_Teste;