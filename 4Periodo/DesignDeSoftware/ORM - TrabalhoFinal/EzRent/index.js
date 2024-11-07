const sequelize = require('./database');
const Aluguel = require('./modules/Aluguel')
const Carrinho = require('./modules/Carrinho')
const Categoria = require('./modules/Categoria')
const Item = require('./modules/Item')
const Usuario = require('./modules/Usuario')

(async () => {
    try {
        await sequelize.sync({ force : true });
        console.log("Tabelas sincronizadas com sucesso!")
    }
    catch (error) {
        console.error("Erro ao sincronizar tabelas: ", error)
    }
})();