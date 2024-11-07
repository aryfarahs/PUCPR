public class Main {
    public static void main(String[] args) {

        Item item = new Item();
        Estoque estoque = new Estoque(item.save());

        item.setNameItem("Escova de Dentes");
        estoque.salvarEstado(item);

        item.setNameItem("Celular");
        estoque.desfazerEstado(item);

    }
}