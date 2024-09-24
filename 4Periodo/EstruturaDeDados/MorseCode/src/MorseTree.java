public class MorseTree<T> {
    private Node<T> root;

    public MorseTree() {
        this.root.setValue((T) " ");
    }

    public Node<T> getRoot() {
        return root;
    }

    public void insert(T value){
        Node<T> newElement = new Node<T>(value);

        Node<T> current = this.root;
        while(true) {
            if (newElement.getValue().equals('.')) {
                if (current.getLeft() != null) {
                    newElement = current.getLeft();
                }
                else {
                    current.setLeft(newElement);
                    break;
                }
            }
            else if (newElement.getValue().equals('-')) {
                if (current.getRight() != null) {
                    newElement = current.getRight();
                }
                else {
                    current.setRight(newElement);
                }
            }
        }
    }



}
