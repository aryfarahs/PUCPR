CREATE DATABASE forminhas;

USE forminhas;

/* Lógico_APTO: */

CREATE TABLE Estado (
    Cod_Estado INT PRIMARY KEY,
    Nome VARCHAR(100),
    Sigla CHAR(2)
);

CREATE TABLE Cidade (
    Cod_Cidade INT PRIMARY KEY,
    Nome VARCHAR(100),
    fk_Estado_Cod_Estado INT
);

CREATE TABLE Apartamento (
    Cod_Ap INT PRIMARY KEY,
    Numero INT,
    Andar INT,
    fk_Predio_Cod_Predio INT
);

CREATE TABLE Predio (
    Cod_Predio INT PRIMARY KEY,
    Rua VARCHAR(100),
    Nome VARCHAR(100),
    Numero INT,
    fk_Cidade_Cod_Cidade INT
);

CREATE TABLE Pessoa (
    Cod_Pessoa INT PRIMARY KEY,
    Nome VARCHAR(100),
    CPF VARCHAR(20) UNIQUE
);

CREATE TABLE Mora (
    fk_Apartamento_Cod_Ap INT,
    fk_Pessoa_Cod_Pessoa INT
);
 
ALTER TABLE Cidade ADD CONSTRAINT FK_Cidade_2
    FOREIGN KEY (fk_Estado_Cod_Estado)
    REFERENCES Estado (Cod_Estado)
    ON DELETE RESTRICT;
 
ALTER TABLE Apartamento ADD CONSTRAINT FK_Apartamento_2
    FOREIGN KEY (fk_Predio_Cod_Predio)
    REFERENCES Predio (Cod_Predio)
    ON DELETE RESTRICT;
 
ALTER TABLE Predio ADD CONSTRAINT FK_Predio_2
    FOREIGN KEY (fk_Cidade_Cod_Cidade)
    REFERENCES Cidade (Cod_Cidade)
    ON DELETE CASCADE;
 
ALTER TABLE Mora ADD CONSTRAINT FK_Mora_1
    FOREIGN KEY (fk_Apartamento_Cod_Ap)
    REFERENCES Apartamento (Cod_Ap)
    ON DELETE RESTRICT;
 
ALTER TABLE Mora ADD CONSTRAINT FK_Mora_2
    FOREIGN KEY (fk_Pessoa_Cod_Pessoa)
    REFERENCES Pessoa (Cod_Pessoa)
    ON DELETE SET NULL;