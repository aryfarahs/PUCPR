USE LAB_03;

SELECT
nome, -- campo / coluna da tabela
dt_nascimento, -- campo / coluna da tabela
DATE_FORMAT(dt_nascimento, '%d/%d/%Y') AS 'Aniversário', -- formata data em dia/mês/ano com 4 dígitos
(
YEAR(NOW()) - YEAR(dt_nascimento) - -- vai SUBTRAIR de 0 ou 1, dependendo se já fez aniversário ou não
CASE
 WHEN (MONTH(NOW()) * 100 + DAY(NOW())) > (MONTH(dt_nascimento) * 100 + DAY(dt_nascimento))
 THEN 0 -- Valor de retorno para ser subtraído = 0
 ELSE 1 -- Valor de retorno para ser subtraído = 1
END
) AS Idade -- AS é a indicação de apelido de exibição para a coluna recém calculada
FROM Empregado;

SELECT * FROM empregado AS E, departamento AS D
WHERE E.ID_depto = D.ID_depto
ORDER BY E.nome;

SELECT * FROM empregado AS E JOIN departamento AS D
ON (E.ID_depto = D.ID_depto)
ORDER BY E.nome;

SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM Empregado AS E, EmpSkill AS ES, Skill AS S
WHERE E.ID_emp = ES.ID_emp AND S.ID_skill = ES.ID_skill
ORDER BY S.nome, E.nome;

SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM
(Empregado AS E INNER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp)) -- Precedencia realizada por ()
INNER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill)
ORDER BY S.nome, E.nome;

SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM (Empregado AS E LEFT OUTER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp))
LEFT OUTER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill)
ORDER BY S.nome, E.nome;

-- Right Outer Join (precedencia feita com (), juntando tabelas Empregado e EmpSkill, depois Skill)
SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM (Empregado AS E RIGHT OUTER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp))
RIGHT OUTER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill)
ORDER BY S.nome, E.nome;

(SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM (Empregado AS E LEFT OUTER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp))
LEFT OUTER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill))
UNION
(SELECT E.nome AS Empregado, ES.nivel, S.nome
FROM (Empregado AS E RIGHT OUTER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp))
RIGHT OUTER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill))
ORDER BY nivel;


SELECT E.ID_emp, E.nome
FROM Empregado AS E JOIN Departamento AS D
ON (E.ID_depto = D.ID_depto) WHERE D.sigla = 'CTB' OR D.sigla ='VND'
ORDER BY E.nome;

SELECT E.ID_emp, E.nome
FROM Empregado AS E WHERE E.ID_depto IN
(SELECT D.ID_depto
FROM Departamento AS D
WHERE D.sigla = 'CTB' OR D.sigla ='VND')
ORDER BY E.nome;



SELECT E.ID_depto, E.ID_emp, E.nome FROM Empregado AS E
WHERE E.ID_depto NOT IN
(SELECT D.ID_depto
FROM Departamento AS D
WHERE D.sigla = 'CTB' OR D.sigla ='VND')
ORDER BY E.nome;

SELECT E.ID_depto, E.ID_emp, E.nome FROM Empregado AS E
WHERE E.ID_depto <> ALL
(SELECT D.ID_depto
FROM Departamento AS D
WHERE D.sigla = 'CTB' OR D.sigla ='VND')
ORDER BY E.nome;


SELECT E.ID_depto, E.ID_emp, E.nome, E.dt_nascimento
FROM Empregado AS E
WHERE YEAR(E.dt_nascimento) >= 1998 AND E.ID_depto IN
(SELECT D.ID_depto
FROM Departamento AS D, Empregado AS E1
WHERE D.ID_depto = E1.ID_depto AND (D.sigla = 'CTB' OR D.sigla ='VND'))
ORDER BY E.nome;

SELECT E.ID_depto, E.ID_emp, E.nome, E.dt_nascimento
FROM Empregado AS E
WHERE E.ID_depto = ANY
(SELECT D.ID_depto FROM Departamento AS D, Empregado AS E1
WHERE D.ID_depto = E1.ID_depto AND (D.sigla = 'CTB' OR D.sigla ='VND'))
AND YEAR(E.dt_nascimento) >= 1998
ORDER BY E.nome;


DROP VIEW IF EXISTS CompetenciasEmpregados;

CREATE VIEW CompetenciasEmpregados AS (
SELECT D.sigla AS Depto, S.nome AS Competencia, ES.nivel AS Nivel, E.nome AS Empregado
FROM ((Empregado AS E INNER JOIN EmpSkill AS ES ON (E.ID_emp = ES.ID_emp)) 
INNER JOIN Skill AS S ON (S.ID_skill = ES.ID_skill)) 
INNER JOIN Departamento AS D ON (D.ID_depto = E.ID_depto));

SELECT * FROM CompetenciasEmpregados
ORDER BY Depto, Competencia, Empregado;


SELECT
COUNT(*) AS 'Número de Empregados',
AVG(salario) AS 'Salário Médio',
MIN(salario) AS 'Menor Salário' ,
MAX(salario) AS 'Maior Salário' ,
SUM(salario) AS 'Total Salários'
FROM Empregado;

SELECT
COUNT(*) AS 'Número de Empregados',
CONVERT(AVG(salario), DECIMAL(8,2)) AS 'Salário Médio',
MIN(salario) AS 'Menor Salário' ,
MAX(salario) AS 'Maior Salário' ,
SUM(salario) AS 'Total Salários'
FROM Empregado;