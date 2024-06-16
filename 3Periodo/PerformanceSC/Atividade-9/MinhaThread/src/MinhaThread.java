public class MinhaThread implements Runnable {
    private String nome;

    public MinhaThread(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        System.out.println("Thread " + nome + " está em execução.");
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + nome + " - " + i);
            try {
                Thread.sleep(1000); // Simula algum trabalho
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}