import { DataTypes } from "sequelize";
import sequelize from "../database";

const Carrinho = sequelize.define("Carrinho", {
    fk_id_item: {
        type: DataTypes.UUID,
        references: {
            model: 'Item',
            key: 'id_item'
        }
    },
    fk_id_usuario: {
        type: DataTypes.UUID,
        references: {
            model: 'Usuario',
            key: 'id_usuario'
        }
    }
}, {
    tableName: 'Carrinho'
});

export default Carrinho;