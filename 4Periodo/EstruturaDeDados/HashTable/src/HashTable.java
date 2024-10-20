public class HashTable<K, Y> {
    private Node[] table;
    private int size = 10;

    public HashTable() {
        this.table = new Node[size];
    }

    public int funcaoHash(int key) {
        return key % size;
    }

    public void put(int value) {
        int key = funcaoHash(value);

        if (table[key] == null) {
            table[key] = new Node(value);
        } else {
            Node current = table[key];
            while (current.getRight() != null) {
                current = current.getRight();
            }
            current.setRight(new Node(value));
        }
    }

    public boolean contains(int value) {
        int key = funcaoHash(value);

        if (table[key] == null) {
            return false;
        }

        Node current = table[key];
        while (current != null) {
            if (current.getValue().equals(value)) {
                return true;
            }
            current = current.getRight();
        }
        return false;
    }

    public void remove(int value) {
        int key = funcaoHash(value);

        if (table[key] == null) {
            return;
        }

        if (table[key].getValue().equals(value)) {
            table[key] = table[key].getRight();
            return;
        }

        Node current = table[key];
        while (current.getRight() != null) {
            if (current.getRight().getValue().equals(value)) {
                current.setRight(current.getRight().getRight());
                return;
            }
            current = current.getRight();
        }
    }

    public void printTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("[" + i + "]");
            Node current = table[i];
            while (current != null) {
                System.out.print(" -> " + current.getValue());
                current = current.getRight();
            }
            System.out.println();
        }
    }



}
