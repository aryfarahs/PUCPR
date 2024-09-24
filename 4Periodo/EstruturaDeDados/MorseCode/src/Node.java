public class Node<T> {
    protected Node<T> left;
    protected Node<T> right;
    protected T value;

    public Node(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node<T> getLeft() {
        return left;
    }

    public Node<T> getRight() {
        return right;
    }

    public T getValue() {
        return value;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
