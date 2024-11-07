import { DataTypes } from "sequelize";
import sequelize from "../database";

const Usuario = sequelize.define("Usuario", {
    id_usuario: {
        type: DataTypes.UUID,
        primaryKey: true,
    },
    nome_usuario: {
        type: DataTypes.STRING,
        allowNull: false,
    },
    email_usuario: {
        type: DataTypes.STRING,
        allowNull: false,
    },
    telefone_usuario: {
        type: DataTypes.STRING,
        allowNull: false,
    },
    senha_usuario: {
        type: DataTypes.STRING,
        allowNull: false,
    }
}, {
    tableName: 'Usuario'
});

export default Usuario;