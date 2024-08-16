public class Main {
    public static void main(String[] args) {

        System.out.println("== FILA CIRCULAR ==");

        CircularQueue<Integer> fila1 = new CircularQueue<>(4);

        fila1.add(1);
        fila1.add(2);
        fila1.add(3);
        fila1.show();

        System.out.println("Adicionando valor 4...");
        fila1.add(4);
        fila1.show();

        System.out.println("Adicionando valor 5...");
        fila1.add(5);
        fila1.show();

        System.out.println("Removendo primeiro valor da fila...");
        fila1.remove();
        fila1.show();

        System.out.println("Adicionando valor 6...");
        fila1.add(6);
        fila1.show();

        System.out.println("Removendo o próximo valor da lista");
        fila1.remove();
        fila1.show();

        System.out.println("Removendo o próximo valor da lista");
        fila1.remove();
        fila1.show();

        System.out.println("Adicionando valor 7...");
        fila1.add(7);
        fila1.show();

        System.out.println("Limpando a fila...");
        fila1.clear();
        fila1.show();

//        Iniciar cheia para mostrar isFull e isEmpty funcionando
//        CircularQueue<String> fila2 = new CircularQueue<>(5);
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