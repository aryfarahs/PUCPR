//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DoublyLinkedList<String> list1 = new DoublyLinkedList<>();
        list1.addFirst(new Node<String>(null, null, "2"));
        list1.addFirst(new Node<String>(null, null, "1"));
        list1.addLast(new Node<String>(null, null, "3"));

        System.out.println("Imprimindo os elementos \n" + list1);

    }
}