public class Main {
    public static void main(String[] args) {

        System.out.println("== LISTA ESTÁTICA ==");

        StaticList<Integer> fila1 = new StaticList<>(4);

        fila1.show();

        System.out.println("Adicionando o valor 5...");
        fila1.add(5);
        fila1.show();

        System.out.println("Removendo o último valor da fila...");
        fila1.pop();
        fila1.show();

        System.out.println("Adicionando o valor 6...");
        fila1.add(6);
        fila1.show();

        System.out.println("Inserindo o valor 9...");
        fila1.insert(9, 2);
        fila1.show();

        System.out.println("Adicionando o valor 10...");
        fila1.add(10);
        fila1.show();

        System.out.println("Adicionando o valor 20...");
        fila1.add(20);
        fila1.show();

        System.out.println("Adicionando o valor 30...");
        fila1.add(30);
        fila1.show();

        System.out.println("Deletando o valor da posição 2...");
        fila1.delete(1);
        fila1.show();

        System.out.println("Retirando os valores 20...");
        fila1.remove(20);
        fila1.show();

        System.out.println("Limpando a fila...");
        fila1.clear();
        fila1.show();





//        Iniciar cheia para mostrar isFull e isEmpty funcionando
//        StaticList<String> fila2 = new StaticList<>(5);
//        fila2.add("A");
//        fila2.add("E");
//        fila2.add("I");
//        fila2.add("O");
//        fila2.add("U");
//
//        fila2.show();
//
//        System.out.println("Tentando adicionar valor com a fila cheia");
//        fila2.add("Y");
//
//        System.out.println("Tentando remover valor com a fila vazia");
//        fila2.clear();
//        fila2.show();
//        fila2.remove();
    }
}