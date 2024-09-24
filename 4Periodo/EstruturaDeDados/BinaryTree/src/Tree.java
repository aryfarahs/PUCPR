public class Tree<T extends Comparable> {
    private Node<T> root;

    public Tree() {
        this.root = null;
    }

    public Node<T> getRoot() {
        return root;

    }


    public void add(T value) {
        Node<T> newNode = new Node<T>(value);
        if (root == null) {
            this.root = newNode;
        } else {
            Node<T> current = this.root;
            while (true) {
                if (newNode.getValue().compareTo(current.getValue()) == -1) {
                    if (current.getLeft() != null) {
                        current = current.getLeft();
                    } else {
                        current.setLeft(newNode);
                        break;
                    }
                } else {
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

    public boolean rmv(T value) {
        Node<T> current = this.root;
        Node<T> currentDad = null;

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

        if (current == null) {
            return false;
        }

        if (current.getLeft() == null && current.getRight() == null) {
            if (currentDad == null) {
                this.root = null;
            } else if (currentDad.getLeft() == current) {
                currentDad.setLeft(null);
            } else {
                currentDad.setRight(null);
            }
        }

        else if (current.getLeft() == null || current.getRight() == null) {
            Node<T> child = (current.getLeft() != null) ? current.getLeft() : current.getRight();
            if (currentDad == null) {
                this.root = child;
            } else if (currentDad.getLeft() == current) {
                currentDad.setLeft(child);
            } else {
                currentDad.setRight(child);
            }
        }

        else {
            Node<T> altern = current.getRight();
            Node<T> alternDad = current;

            while (altern.getLeft() != null) {
                alternDad = altern;
                altern = altern.getLeft();
            }

            current.setValue(altern.getValue());

            if (alternDad.getLeft() == altern) {
                alternDad.setLeft(altern.getRight());
            } else {
                alternDad.setRight(altern.getRight());
            }
        }

        return true;
    }

    public void showOrdered(Node<T> current) {
        if (current != null) {
            showOrdered(current.getLeft());
            System.out.print(current.getValue() + " - ");
            showOrdered(current.getRight());
        }
    }

    public void showPreOrdered(Node<T> current) {
       if (current != null) {
           System.out.print(current.getValue() + " - ");
           showPreOrdered(current.getLeft());
           showPreOrdered(current.getRight());
       }
   }

    public void showPosOrdered(Node<T> current) {
       if (current != null) {
           showPosOrdered(current.getLeft());
           showPosOrdered(current.getRight());
           System.out.print(current.getValue() + " - ");
       }
   }

}
