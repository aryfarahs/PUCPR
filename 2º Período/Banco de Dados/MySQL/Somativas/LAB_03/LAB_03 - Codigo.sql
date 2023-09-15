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
