import java.util.ArrayList;
import java.util.List;

public class PrimosNThreads {

    public static void main(String[] args) throws InterruptedException {
        int inicio = 2;
        int fim = 1000000;
        int numThreads = 4;
        int tamanhoSubIntervalo = (fim - inicio + 1) / numThreads;

        List<Thread> threads = new ArrayList<>();
        List<List<Integer>> primosPorThread = new ArrayList<>();

        for (int i = 0; i < numThreads; i++) {
            primosPorThread.add(new ArrayList<>());
        }

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            final int subInicio = inicio + i * tamanhoSubIntervalo;
            final int subFim = (i == numThreads - 1) ? fim : subInicio + tamanhoSubIntervalo - 1;

            Thread thread = new Thread(() -> {
                List<Integer> primos = primosPorThread.get(threadIndex);
                for (int j = subInicio; j <= subFim; j++) {
                    if (isPrimo(j)) {
                        primos.add(j);
                    }
                }
            });

            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        for (int i = 0; i < numThreads; i++) {
            final int subInicio = inicio + i * tamanhoSubIntervalo;
            final int subFim = (i == numThreads - 1) ? fim : subInicio + tamanhoSubIntervalo - 1;

            System.out.println("Primos no intervalo [" + subInicio + "-" + subFim + "]: ");
            System.out.print("| ");
            for (int primo : primosPorThread.get(i)) {
                System.out.print(primo + " | ");
            }
            System.out.println();
            System.out.println();
        }
    }

    private static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}