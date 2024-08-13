public class StaticQueue<T> {
    private int top = -1;
    private int base = 0;
    private T[] data;
    private int size;


    public StaticQueue(int size) {
        this.data =(T[]) new Object[size];
        this.size = size;
    }

    public void add(T data) {
        if (isFull()) {
            throw new IllegalStateException("Fila já está cheia!");
        }
        this.top++;
        this.data[top] = data;
    }

    public T remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila está vazia!");
        }
        T rmvd = this.data[base];
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
        return ((this.top == this.size -1) && (this.base == 0));
    }

    public boolean isEmpty() {
        return this.top == -1;
    }


}
