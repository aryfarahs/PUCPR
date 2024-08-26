public class DoublyLinkedList<T> {
    protected Node<T> header;
    protected Node<T> trailer;
    protected int size;

    public DoublyLinkedList() {
        this.header = new Node<T>(null,null,null);
        this.trailer = new Node<T>(null,null,null);
        this.size = 0;
        this.header.setNext(trailer);
        this.trailer.setPrev(header);
    }

    public void addFirst(Node<T> no) {
        Node<T> w = this.header.getNext();
        no.setNext(w);
        no.setPrev(this.header);
        w.setPrev(no);
        this.header.setNext(no);
        size++;
    }

    public Node<T> getFirst() throws IllegalStateException {
        if(isEmpty())
            throw new IllegalStateException("Lista Vazia");
        return this.header.getNext();
    }

    public Node<T> getLast() throws IllegalStateException {
        if(isEmpty())
            throw new IllegalStateException("Lista Vazia");
        return trailer.getPrev();
    }

    public Node<T> getPrev(Node<T> no) throws IllegalArgumentException {
        if(no == this.header)
            throw new IllegalStateException("Lista Vazia");
        return no.getPrev();
    }

    public Node<T> getNext(Node<T> no) throws IllegalArgumentException {
        if(no==this.trailer)
            throw new IllegalArgumentException("Não há nó anterior");
        return no.getPrev();
    }


    public void addBefore(Node<T> v, Node<T> no) throws IllegalArgumentException{
        Node<T> u = getPrev(v);
        no.setPrev(u);
        no.setNext(v);
        v.setPrev(no);
        u.setNext(no);
        size++;
    }

    public void addAfter(Node<T> v, Node<T> no) throws IllegalArgumentException{
        Node<T> u = getNext(v);
        no.setPrev(v);
        no.setNext(u);
        v.setNext(no);
        u.setPrev(no);
        size++;
    }

    public void addLast(Node<T> no) {
        addBefore(this.trailer, no);
    }


    public void removeNo(Node<T> no) throws IllegalArgumentException {
        Node<T> u = getPrev(no);
        Node<T> w = getNext(no);
        u.setNext(w);
        w.setPrev(u);
        no.setNext(null);
        no.setPrev(null);
        size--;
    }

    public boolean hasAnt(Node<T> no){
        return (no!=this.header);
    }

    public boolean hasSuc(Node<T> no) {
        return (no != this.trailer);
    }


    public String toString(){
        Node<T> ponteiro = this.header.getNext();
        String s = "{";
        int i = 1;
        while(ponteiro.getNext()!=null){
            if(i==1)
                s +=" [.]-> ";
            s += " <- ";
            s += ponteiro.getElement();
            s += " -> ";
            i++;
            ponteiro = ponteiro.getNext();
        }
        return s+="<-[.]}";
    }


    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return (this.size == 0);
    }

//    public boolean isFull() {
//        return (this.size == top);
//    }

}
