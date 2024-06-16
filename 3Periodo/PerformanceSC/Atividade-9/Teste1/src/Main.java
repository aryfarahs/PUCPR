public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread rodando: " + Thread.currentThread().getName());
                System.out.println("Prioridade da thread: " + Thread.currentThread().getPriority());
            }
        });

        thread.setName("MinhaThread");
        thread.setPriority(Thread.MAX_PRIORITY);

        thread.start();
    }
}