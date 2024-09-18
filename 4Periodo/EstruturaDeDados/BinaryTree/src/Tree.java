public class Tree<T extends Comparable> {
    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;
    }


    // ADICIONAR NOVO VALOR
    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        if (root == null) {
            this.root = newNode;
        } else {
            Node<T> current = this.root;
            while (true) {
                /* COMPARETO RETORNA:
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

    // REMOVER VALOR
    public boolean rmv(T value) {
        Node<T> current = this.root;
        Node<T> currentDad = null;

        // buscar elemento
        while (current != null) {
            if (current.getValue().equals(value)) {

                // remover o elemento
                // filho à direita
                if (current.getRight() != null) {
                    Node<T> altern = current.getRight();
                    Node<T> alternDad = current;

                    // buscar o número mais próximo do que deseja
                    while (altern.getLeft() != null) {
                        alternDad = altern;
                        altern = altern.getLeft();
                    }
                    // substituir o atual (com pai)
                    if (currentDad != null) {
                        if (current.getValue().compareTo(currentDad.getValue()) == -1) {
                            currentDad.setLeft(altern);

                        } else {
                            currentDad.setRight(altern);
                        }
                    }
                    // substituir o atual (sem pai) == é a raiz!
                    else {
                        this.root = altern;
                    }

                    // removendo elemento
                    if (altern.getValue().compareTo(alternDad.getValue()) == -1) {
                        alternDad.setLeft(null);

                    } else {
                        alternDad.setRight(null);
                    }

                }

                // filho somente à esquerda
                else if (current.getLeft() != null) {
                    Node<T> altern = current.getLeft();
                    Node<T> alternDad = current;

                    // buscar o número mais próximo do que deseja
                    while (altern.getRight() != null) {
                        alternDad = altern;
                        altern = altern.getRight();
                    }
                    // substituir o atual (com pai)
                    if (currentDad != null) {
                        if (current.getValue().compareTo(currentDad.getValue()) == -1) {
                            currentDad.setLeft(altern);

                        } else {
                            currentDad.setRight(altern);
                        }
                    }
                    // substituir o atual (sem pai) == é a raiz!
                    else {
                        this.root = altern;
                    }

                    // removendo elemento
                    if (altern.getValue().compareTo(alternDad.getValue()) == -1) {
                        alternDad.setLeft(null);

                    } else {
                        alternDad.setRight(null);
                    }

                }

                // sem filho
                else {
                    if (currentDad != null) {
                        if (current.getValue().compareTo(currentDad.getValue()) == -1) {
                            currentDad.setLeft(null);

                        } else {
                            currentDad.setRight(null);
                        }
                    }
                    else {
                        this.root = null;
                    }

                }

            } else if (value.compareTo(current.getValue()) == -1) { // é menor
                currentDad = current;
                current = current.getLeft();

            } else {
                currentDad = current;
                current = current.getRight();
            }
        }
        return false;
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
