public class CircularQueue<T> extends StaticQueue<T> {

    public CircularQueue(int size) {
        super(size);
    }


    public void move(int pos) {
        return pos + 1 == data.length ? 0 : pos + 1;
    }


}
