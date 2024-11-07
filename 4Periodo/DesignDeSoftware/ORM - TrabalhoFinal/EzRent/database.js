import { Sequelize } from 'sequelize';

const sequelize = new Sequelize({
    database: 'ezrent',
    username: 'root',
    password: 'PUC@1234',
    host: 'localhost',
    dialect: 'mysql',
});

export default sequelize;