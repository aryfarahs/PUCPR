public class Tree<T extends Comparable> {
    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }


    // ADICIONAR NOVO NÚMERO
    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        if (root == null) {
            this.root = newNode;
        } else {
            Node<T> current = this.root;
            while (true) {
                /*
                COMPARETO RETORNA:
                    -1 = menor
                    0 = igual
                    1 = maior
                 */
                if (newNode.getValue().compareTo(current.getValue()) == -1) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(newNode);
                        break;
                    }
                } else { // se for maior ou igual
                    if (current.getRight() != null) {
                        current = current.getRight();
                    } else {
                        current.setRight(newNode);
                        break;
                    }
                }
            }

        }

    }

    // IMPRIMIR EM-ORDEM
    public void showOrdered(Node<T> current) {
        if (current != null) {
            showOrdered(current.getLeft());
            System.out.print(current.getValue() + " - ");
            showOrdered(current.getRight());
        }
    }

   // IMPRIMIR PRÉ-ORDER
   public void showPreOrdered(Node<T> current) {
       if (current != null) {
           System.out.print(current.getValue() + " - ");
           showPreOrdered(current.getLeft());
           showPreOrdered(current.getRight());
       }
   }

   // IMPRIMIR PÓS-ORDEM
   public void showPosOrdered(Node<T> current) {
       if (current != null) {
           showPosOrdered(current.getLeft());
           showPosOrdered(current.getRight());
           System.out.print(current.getValue() + " - ");
       }
   }

}
