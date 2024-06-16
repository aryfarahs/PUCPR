public class Processo {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MinhaThread("T1"));
        Thread t2 = new Thread(new MinhaThread("T2"));

        t1.start();
        t2.start();
    }
}