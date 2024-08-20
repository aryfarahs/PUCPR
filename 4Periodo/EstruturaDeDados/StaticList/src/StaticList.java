public class StaticList<T> {
    private int top = -1;
    private T[] data;
    private int size;
    public int qnt = 0;


    public StaticList(int size) {
        this.data =(T[]) new Object[size];
        this.size = size;
    }

    public void add(T data) {
        if (isFull()) {
            System.out.println("Fila já está cheia!");
            return;
        }
        this.top++;
        while (this.data[top] != null) {
            this.top++;
        }
        this.qnt++;
        this.data[top] = data;
    }

    public void insert(T data, int index) {
        if (isFull()) {
            System.out.println("Fila já está cheia!");
            return;
        }
        this.qnt++;
        this.data[index] = data;
    }

    public T pop() {
        T rmvd = this.data[qnt];
        if (isEmpty()) {
            System.out.println("Fila está vazia!");
            return rmvd;
        }
        this.data[top] = null;
        this.top--;
        this.qnt--;
        return rmvd;
    }

    public T delete(int index) {
        T rmvd = this.data[index];
        if (rmvd == null) {
            System.out.println("Essa posição está vazia!");
        } else {
            this.data[index] = null;
        }
        return rmvd;

    }

    public T remove(T value) {
        for (int i = 0; i < this.size; i++) {
            if (this.data[i] == value) {
                this.data[i] = null;
            }
        }
        return value;
    }

    public void clear() {
        for (int i = this.size-1; i >= 0; i--) {
            this.data[i] = null;
        }
        this.top = -1;
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

