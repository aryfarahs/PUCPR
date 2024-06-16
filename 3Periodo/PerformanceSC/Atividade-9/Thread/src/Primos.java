public class Primos {
    public static void main(String[] args) {
        int inicio = 2;
        int fim = 1000000;

        System.out.println("Primos no intervalo [" + inicio + "-" + fim + "]: ");
        System.out.print("| ");
        for(int i = inicio; i <= fim; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " | ");
            }
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
        for(int i = 3; i <= Math.sqrt(num); i += 2) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
