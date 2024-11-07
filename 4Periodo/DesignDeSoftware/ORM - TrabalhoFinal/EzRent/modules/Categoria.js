import { DataTypes } from "sequelize";
import sequelize from "../database";

const Categoria = sequelize.define("Categoria", {
    id_categoria: {
        type: DataTypes.UUID,
        primaryKey: true,
    },
    descricao: {
        type: DataTypes.STRING,
        allowNull: false,
    }
}, {
    tableName: 'categoria'
});

export default Categoria;
