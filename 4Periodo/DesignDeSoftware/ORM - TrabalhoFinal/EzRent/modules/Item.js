import { DataTypes } from 'sequelize';
import sequelize from '../database';

// valor_item, disponivel, fk_Categoria_item, fk_Usuario_id_usuario, fk_Pedido_id_pedido, data_inicio, data_final, descricao, imagem, imagemExtensao

const Item = sequelize.define('Item', {
    id_item: {
        type: DataTypes.UUID,
        primaryKey: true
    },
    nome_item: {
        type: DataTypes.STRING,
        allowNull: false
    },
    valor_item: {
        type: DataTypes.DOUBLE,
        allowNull: false
    },
    disponivel: {
        type: DataTypes.BOOLEAN,
        allowNull: false
    },
    data_inicio: {
        type: DataTypes.DATE,
        allowNull: false
    },
    data_final: {
        type: DataTypes.DATE,
        allowNull: false
    },
    descricao: {
        type: DataTypes.STRING,
        allowNull: false
    },
    imagem: {
        type: DataTypes.BLOB,
        allowNull: false
    },
    imagemExtensao: {
        type: DataTypes.STRING,
        allowNull: false
    },
    fk_id_categoria: {
        type: DataTypes.UUID,
        references: {
            model: 'Categoria',
            key: 'id_categoria'
        }
    },
    fk_id_usuario: {
        type: DataTypes.UUID,
        references: {
            model: 'Usuario',
            key: 'id_usuario'
        }
    },
    fk_id_pedido: {
        type: DataTypes.UUID,
        references: {
            model: 'Pedido',
            key: 'id_pedido'
        }
    }
}, {
    tableName: 'Item'
});

export default Item;