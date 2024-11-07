public class Item {
    private String nameItem;

    // GETTERS E SETTERS
    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
        System.out.println("Nome do item alterado para: " + nameItem);
    }

    public Memento save() {
        return new Memento(nameItem);
    }

    public void restaurar(Memento memento) {
        this.nameItem = memento.getNameItem();
        System.out.println("Nome do item restaurado para: " + nameItem);
    }




}
