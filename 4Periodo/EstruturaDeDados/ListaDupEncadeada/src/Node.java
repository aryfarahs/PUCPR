public class Node<T> {
    protected T element;
    protected Node<T> next, prev;

    public Node(Node<T> prev, Node<T> next, T element) {
        this.element = element;
        this.prev = prev;
        this.next = next;
    }





    public T getElement() {
        return this.element;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}
