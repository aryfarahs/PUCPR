public class Main {
    public static void main(String[] args) {

        Item bicicleta = new Item("Bicicleta", true, 50.0);

        bicicleta.search_item();

        bicicleta.update_item(false);

        System.out.println("-------------------");
        System.out.println("Item atualizado:");
        System.out.println("-------------------");

        bicicleta.search_item();

        System.out.println("-------------------");
        Pagamento pagamento = new Pagamento();
        pagamento.setValor(50);

        Aluguel aluguel = new Aluguel(pagamento, bicicleta);

        if (pagamento.pagar()) {
            aluguel.alugar();
        } else {
            System.out.println("Não foi possível realizar o aluguel.");
        }

    }
}