public class Main {
    public static void main(String[] args) {

        System.out.println("== FILA ESTÁTICA ==");

        StaticList<Integer> fila1 = new StaticList<>(4);

        fila1.show();

        System.out.println("Adicionando valor 5...");
        fila1.add(5);
        fila1.show();

        System.out.println("Adicionando valor 8...");
        fila1.add(8);
        fila1.show();

        System.out.println("Removendo primeiro valor da fila...");
        fila1.remove();
        fila1.show();

        System.out.println("Adicionando valor 6...");
        fila1.add(6);
        fila1.show();

        System.out.println("Limpando a fila...");
        fila1.clear();
        fila1.show();

        System.out.println("Adicionando valor 9...");
        fila1.insert(9, 2);
        fila1.show();

        System.out.println("Adicionando valor 9...");
        fila1.add(10);
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