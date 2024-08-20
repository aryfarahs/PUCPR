public class StaticList<T> {

    private int top = -1;
    private int base = 0;
    private T[] data;
    private int size;
    public int qnt;


    public StaticList(int size) {
        this.data =(T[]) new Object[size];
        this.size = size;
    }

    public void add(T data) {
        if (isFull()) {
            System.out.println("Fila já está cheia!");
            return;
        }
        this.qnt++;
        this.data[top] = data;
    }

    public void insert(T data, int index) {
        if (isFull()) {
            System.out.println("Fila já está cheia!");
            return;
        }
        this.top++;
        this.data[index] = data;
    }

    public T remove() {
        T rmvd = this.data[base];
        if (isEmpty()) {
            System.out.println("Fila está vazia!");
            return rmvd;
        }
        this.data[base] = null;
        this.base++;
        return rmvd;
    }

    public void clear() {
        for (int i = this.base; i <= this.top; i++) {
            this.data[i] = null;
        }
        this.top = -1;
        this.base = 0;
    }

    public void show() {
        for (int i = 0; i < this.size; i++) {
            System.out.print("| ");
            if (this.data[i] != null) {
                System.out.print(this.data[i] + " ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.print("|");
        System.out.println();
        System.out.println();
    }

    public boolean isFull() {
        return this.qnt == this.size;
    }

    public boolean isEmpty() {
        return this.qnt == 0;
    }


}

