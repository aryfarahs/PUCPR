public class Main {

    public static String nome;
    public static void main(String[] args) {
        //Instanciando objeto com o construtor sem parâmetros
        // (cria objeto padrão definido na classe)
        Casa casa = new Casa();
        //Instanciando objeto com o construtor com todos os parâmetros
        // (totalmente personalizável)
        Casa casa1 = new Casa("rosa", 333, 1, 2,5f);
        //Instanciando objeto com construtor sem o parâmetro cor
        // (cria objeto com cor padrão definida na classe,
        // mas o restante dos itens ficam personalizáveis)
        Casa casa2 = new Casa(170, 2, 5, 20f);
        //Aqui utilizamos o mesmo contrutor da casa2, alterando alguns valores
        //A casa2 e a casa3, apesar de usarem o mesmo construtor,
        //são independentes uma da outra (cada uma em um quadrado)
        Casa casa3 = new Casa(2225, 3, 5, 20f);

        // Imprimindo informações da casa criada com o construtor sem parâmetros
        System.out.println("CONSTRUTOR SEM PARÂMETROS");
        // como os atributos de Casa são privados, não conseguimos mais acessar diretamente (ex: casa.cor)
        // portanto as informações agora são obtidas através dos métodos getter
        System.out.println("Cor da casa: " + casa.getCor());
        System.out.println("Número da casa: " + casa.getNumero());
        System.out.println("Andares da casa: " + casa.getAndares());
        System.out.println("Quantidade de quartos da casa:" + casa.getQtdeQuartos());
        System.out.println("Altura da casa: " + casa.getAltura());

        // vamos supor que a casa passou por uma reforma e alguns atributos mudaram
        // a casa possui uma nova cor (azul) e a quantidade de quartos agora é 5
        // como os atributos de Casa são privados, não conseguimos mais acessar diretamente (ex: casa.cor = "azul")
        // portanto vamos utilizar o setter para alterar o valor
        casa.setCor("azul");
        casa.setQtdeQuartos(5);

        //depois de alterar vamos imprimir os atributos novamente para ver o que acontece
        System.out.println("\nImpressão após a reforma"); // \n pula uma linha
        System.out.println("Cor da casa após reforma: " + casa.getCor());
        System.out.println("Quantidade de quartos da casa após reforma:" + casa.getQtdeQuartos());

        // Imprimindo informações da casa criada com o construtor sem com todos os parâmetros
        System.out.println("\nCONSTRUTOR COM TODOS OS PARÂMETROS"); // \n pula uma linha
        // como os atributos de Casa são privados, não conseguimos mais acessar diretamente (ex: casa1.cor)
        // portanto as informações agora são obtidas através dos métodos getter
        System.out.println("Cor da casa1: " + casa1.getCor());
        System.out.println("Número da casa1: " + casa1.getNumero());
        System.out.println("Andares da casa1: " + casa1.getAndares());
        System.out.println("Quantidade de quartos da casa1: " + casa1.getQtdeQuartos());
        System.out.println("Altura da casa1: " + casa1.getAltura());

        // Imprimindo informações da casa criada com o construtor sem o parâmetro de cor
        // por padrão a cor dessa casa vai ser branca
        System.out.println("\nCONSTRUTOR CASA BRANCA"); // \n pula uma linha
        // como os atributos de Casa são privados, não conseguimos mais acessar diretamente (ex: casa2.cor)
        // portanto as informações agora são obtidas através dos métodos getter
        System.out.println("Cor da casa2: " + casa2.getCor());
        System.out.println("Número da casa2: " + casa2.getNumero());
        System.out.println("Andares da casa2: " + casa2.getAndares());
        System.out.println("Quantidade de quartos da casa2:" + casa2.getQtdeQuartos());
        System.out.println("Altura da casa2: " + casa2.getAltura());
    }
}