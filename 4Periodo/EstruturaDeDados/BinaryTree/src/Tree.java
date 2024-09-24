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
                break;
            } else if (value.compareTo(current.getValue()) == -1) {
                currentDad = current;
                current = current.getLeft();
            } else {
                currentDad = current;
                current = current.getRight();
            }
        }

        // Verificar se o elemento existe
        if (current == null) {
            return false; // Não encontrou o valor
        }

        // Caso 1: Nó sem filhos
        if (current.getLeft() == null && current.getRight() == null) {
            if (currentDad == null) {
                this.root = null; // Se for a raiz
            } else if (currentDad.getLeft() == current) {
                currentDad.setLeft(null);
            } else {
                currentDad.setRight(null);
            }
        }
        // Caso 2: Nó com apenas um filho
        else if (current.getLeft() == null || current.getRight() == null) {
            Node<T> child = (current.getLeft() != null) ? current.getLeft() : current.getRight();
            if (currentDad == null) {
                this.root = child; // Se for a raiz
            } else if (currentDad.getLeft() == current) {
                currentDad.setLeft(child);
            } else {
                currentDad.setRight(child);
            }
        }
        // Caso 3: Nó com dois filhos
        else {
            Node<T> altern = current.getRight();
            Node<T> alternDad = current;

            // Encontrar o sucessor (menor elemento à direita)
            while (altern.getLeft() != null) {
                alternDad = altern;
                altern = altern.getLeft();
            }

            // Substituir o valor do nó a ser removido pelo sucessor
            current.setValue(altern.getValue());

            // Remover o sucessor da subárvore
            if (alternDad.getLeft() == altern) {
                alternDad.setLeft(altern.getRight());
            } else {
                alternDad.setRight(altern.getRight());
            }
        }

        return true; // Remoção bem-sucedida
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
