USE LAB_01;

/* Lógico_LAB_01: */

CREATE TABLE Carro (
    CodCarro INT PRIMARY KEY NOT NULL,
    Marca VARCHAR(50),
    Modelo VARCHAR(50),
    AnoFabricacao INT,
    Kilometragem FLOAT,
    Cor VARCHAR(50),
    Placa VARCHAR(10)
);

INSERT INTO Carro (CodCarro, Marca, Modelo, AnoFabricacao, Kilometragem, Cor, Placa)
VALUES
(1, 'Peugeot', '208 New Style', 2022, 180101, 'Branco Perolado', 'ARC4W29'),
(2, 'Tesla', 'Model X', 2020, 453078, 'Vermelho', 'BDW8E40'),
(3, 'Volkswagem', 'Nivus', 2022, 098772, 'Cinza Espacial', 'FCK6A90'),
(4, 'Citroen', 'Citroen C3', 2023, 056096, 'Verde', 'SEX4E20'),
(5, 'Chevrolet', 'Camaro', 2013, 782312, 'Amarelo', 'FGC2B76')
;

SELECT * FROM Carro;
