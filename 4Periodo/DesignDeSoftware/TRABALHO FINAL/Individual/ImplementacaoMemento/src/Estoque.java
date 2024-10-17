public class Estoque {
    private Memento memento;

    // CONSTRUTOR
    public Estoque(Memento memento) {
        this.memento = memento;
    }


    public void salvarEstado(Item item) {
        this.memento = item.save();
    }

    public void desfazerEstado(Item item) {
        if (memento != null) {
            item.restaurar(memento);
        }
    }



}
