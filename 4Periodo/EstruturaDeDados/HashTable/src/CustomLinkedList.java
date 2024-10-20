public class CustomLinkedList<T> {
    private Node <T> head;
    private int size;

    public CustomLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T value) {
        Node <T> newNode = new Node<>(value);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node<T> current = this.head;

            while (current.getRight() != null) {
                current = current.getRight();
            }
            current.setRight(newNode);
        }
        this.size++;
    }

    public boolean remove(T value) {
        if (this.head == null) {
            return false;
        }

        if (this.head.getValue().equals(value)) {
            this.head = this.head.getRight();
            this.size--;
            return true;
        }

        Node<T> current = this.head;
        while (current.getRight() != null) {
            if (current.getRight().getValue().equals(value)) {
                current.setRight(current.getRight().getRight());
                this.size--;
                return true;
            }
            current = current.getRight();
        }
        return false;
    }

    public T get(int index) {
        if (index < 0 || index >= this.size) {
            return null;
        }

        Node<T> current = this.head;
        for (int i = 0; i < index; i++) {
            current = current.getRight();
        }
        return current.getValue();
    }

    public boolean contains(T value) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.getValue().equals(value)) {
                return true;
            }
            current = current.getRight();
        }
        return false;
    }

    public int size() {
        return this.size;
    }

    public void printList() {
        Node<T> current = this.head;
        while (current != null) {
            System.out.print(current.getValue() + " -> ");
            current = current.getRight();
        }
    }



}
