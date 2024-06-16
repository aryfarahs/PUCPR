import java.util.ArrayList;
import java.util.List;

public class PrimosDuasThreads {

    public static void main(String[] args) throws InterruptedException {
        int inicio = 2;
        int fim = 1000000;
        int meio = (inicio + fim) / 2;

        List<Integer> primosPrimeiraMetade = new ArrayList<>();
        List<Integer> primosSegundaMetade = new ArrayList<>();

        Thread th1 = new Thread(() -> {
            for (int i = inicio; i <= meio; i++) {
                if (isPrimo(i)) {
                    primosPrimeiraMetade.add(i);
                }
            }
        });

        Thread th2 = new Thread(() -> {
            for (int i = meio + 1; i <= fim; i++) {
                if (isPrimo(i)) {
                    primosSegundaMetade.add(i);
                }
            }
        });

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println("Primos na primeira metade [" + inicio + "-" + meio + "]: ");
        System.out.print("| ");
        for (int primo : primosPrimeiraMetade) {
            System.out.print(primo + " | ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Primos na segunda metade [" + (meio + 1) + "-" + fim + "]: ");
        System.out.print("| ");
        for (int primo : primosSegundaMetade) {
            System.out.print(primo + " | ");
        }
        System.out.println();
        System.out.println();
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