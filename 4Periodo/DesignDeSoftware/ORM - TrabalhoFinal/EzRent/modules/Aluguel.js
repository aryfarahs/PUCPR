import { DataTypes } from "sequelize";
import sequelize from "../database";

const Aluguel = sequelize.define("Aluguel", {
    id_aluguel: {
        type: DataTypes.INTEGER,
        primaryKey: true,
    },
    fk_id_usuario: {
        type: DataTypes.UUID,
        references: {
            model: 'Usuario',
            key: 'id_usuario'
        }
    },
    fk_id_item: {
        type: DataTypes.UUID,
        references: {
            model: 'Item',
            key: 'id_item'
        }
    },
    fk_id_locador: {
        type: DataTypes.UUID,
        references: {
            model: 'Usuario',
            key: 'id_usuario'
        }
    }
}, {
    tableName: 'Aluguel'
});

export default Aluguel;