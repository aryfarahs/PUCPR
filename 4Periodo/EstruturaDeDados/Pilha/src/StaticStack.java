public class StaticStack<T> {
    private int top = -1;
    private T[] data;
    private int size;

    public StaticStack(int size) {
        this.data = (T[]) new Object[size];
        this.size = size;
    }

    public void push(T data) {
        if(isFull()) {
            throw new IllegalStateException("Pilha cheia!");
        }
        this.top++;
        this.data[top] = data;

    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha já está vazia!");
        }
        T popped = this.data[top];
        this.data[top] = null;
        this.top--;
        return popped;
    }

    public void clear() {
        for (int i = this.top; i >= 0; i--) {
            this.data[i] = null;
        }
        this.top = -1;
    }

    public boolean isFull() {
        return this.top >= this.size;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }


    public int getSize() {
        return size;
    }
}
