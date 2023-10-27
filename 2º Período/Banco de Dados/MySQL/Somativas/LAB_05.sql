CREATE DATABASE lab_05;

USE lab_05;

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