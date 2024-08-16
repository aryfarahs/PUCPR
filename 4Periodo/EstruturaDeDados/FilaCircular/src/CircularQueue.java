import java.util.Arrays;

public class CircularQueue<T> {
    private int top = -1;
    private int base = 0;
    private T[] data;
    private int size;
    private int qnt;


    public CircularQueue(int size) {
        this.data =(T[]) new Object[size];
        this.size = size;
        this.qnt = 0;
    }

    public void add(T data) {
        if (isFull()) {
//            throw new IllegalStateException("Fila já está cheia!");
            System.out.println("ta cheia");
            return;
        }

        this.top = move(top);
        this.data[top] = data;
        this.qnt += 1;
    }

    public T remove() {
        T rmvd = this.data[base];
        if (isEmpty()) {
//            throw new IllegalStateException("Fila está vazia!");
            System.out.println("ta vazia");
            return rmvd;
        }
        this.data[base] = null;
        this.base = move(base);
        this.qnt -= 1;
        return rmvd;
    }

    public void clear() {
        Arrays.fill(data, null);
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

    public int move(int pos) {
        return pos + 1 == data.length ? 0 : pos + 1;
    }

    public boolean isFull() {
        return this.qnt == this.data.length;
    }

    public boolean isEmpty() {
        return this.qnt == 0;
    }

}
