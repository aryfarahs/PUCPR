public class Casa {
    //Todos os atributos da classe são privados para seguir os princípios do encapsulamento
    // esses atributos não são mais acessíveis em outras classes (ex: Main)
    // só posso usar esses atributos dentro da classe Casa
    private String cor;
    private int numero;
    private int qtdeQuartos;
    private int andares;
    private float altura;

    //construtor que não recebe parâmetros
    // esse tipo de construtor define valores padronizados para os atributos
        public Casa() {
        this("verde", 289, 2, 3, 10f);
    }

    // construtor que recebe todos os valores por atributo (o objeto é criado de forma 100% personalizada)
    public Casa(String cor, int numero, int andares, int qtdeQuartos, float altura) {
        //usamos a palavra chave this para os atributos da classe
        // não usamos a palavra this para os valores recebidos por parâmetro
        this.cor = cor;
        this.numero = numero;
        this.andares = andares;
        this.qtdeQuartos = qtdeQuartos;
        this.altura = altura;
    }

    // construtor que não receve Cor como um parâmetro
    //possui atributos com valores padrão, mas tem outros atributos personalizados
    public Casa(int numero, int andares, int qtdeQuartos, float altura) {
        // usando this desta forma, criamos o objeto utilizando o construtor definido acima (linha 18)
        // dessa forma o código fica mais limpo, definindo o valor padrão cor como "branco"
        // e os demais valores que foram recebidos como parâmetro são repassados para o outro construtor
        this("branco", numero, andares, qtdeQuartos, altura);
    }

    // getter de cor: quero que outras classes possam ler o valor do atributo cor
    public String getCor() {
        return this.cor;
    }

    // setter de cor: quero que outras classes possam alterar o valor do atributo cor
    public void setCor(String cor) {
        this.cor = cor;
    }

    // getter de numero: quero que outras classes possam ler o valor do atributo numero
    public int getNumero() {
        return numero;
    }

    // nesse caso não precisamos implementar um setter para o atributo numero
    // pois quando o numero da casa é definido de acordo com a rua, não deve ser alterado

    // getter de quantidade de quartos: quero que outras classes possam ler o valor do atributo qtdeQuartos
    public int getQtdeQuartos() {
        return qtdeQuartos;
    }

    // setter de cor: quero que outras classes possam alterar o valor do atributo qtdeQuartos
    public void setQtdeQuartos(int qtdeQuartos) {
        this.qtdeQuartos = qtdeQuartos;
    }

    // getter de andares: quero que outras classes possam ler o valor do atributo andares
        public int getAndares() {
        return andares;
    }

    // setter de quantidade de quartos: quero que outras classes possam alterar o valor do atributo andares
    public void setAndares(int andares) {
        this.andares = andares;
    }
    // setter de altura: quero que outras classes possam ler o valor do atributo altura
    public float getAltura() {
        return altura;
    }
    // setter de altura: quero que outras classes possam alterar o valor do atributo altura
    public void setAltura(float altura) {
        this.altura = altura;
    }
}
