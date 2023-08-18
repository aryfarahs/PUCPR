USE conceitos;

/* Lógico_2: */

CREATE TABLE Projeto (
    Id_Proj INT PRIMARY KEY,
    Nome VARCHAR(100),
    Descricao TEXT
);

CREATE TABLE Trabalha (
	ID_Trab INT PRIMARY KEY,
    fk_Projeto_Id_Proj INT,
    fk_Empregado_ID_Emp INT,
    DT_Fim DATE,
    DT_Inicio DATE
);
 
ALTER TABLE Trabalha ADD CONSTRAINT FK_Trabalha_1
    FOREIGN KEY (fk_Projeto_Id_Proj)
    REFERENCES Projeto (Id_Proj)
    ON DELETE SET NULL;
 
ALTER TABLE Trabalha ADD CONSTRAINT FK_Trabalha_2
    FOREIGN KEY (fk_Empregado_ID_Emp)
    REFERENCES Empregado (ID_Emp)
    ON DELETE SET NULL;
    
INSERT INTO Projeto(ID_Proj, Nome, Descricao)
VALUES (1000, 'Sistema X', 'Sistema novo'),
		(2000, 'Sistema ABC', 'Manutenção');
        
SELECT * FROM Projeto;

INSERT INTO Trabalha(ID_Trab, fk_Empregado_ID_Emp, fk_Projeto_Id_Proj, DT_Inicio, DT_Fim)
VALUES (1, 1, 1000, '2020-04-20', NULL),
		(2, 3, 2000, '2019-07-14', '2022-10-12');

