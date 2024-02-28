import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class PBL01 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> mult = new ArrayList<>();
        ArrayList<Integer> par = new ArrayList<>();
        ArrayList<Integer> impar = new ArrayList<>();

        for (int i=0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();
        for (int i=0; i < 13; i++){
            System.out.print(" ");
        }
        System.out.println("Lista Aleatória");
        for (int i=0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();
        

        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        System.out.print("Escolha a quantidade de números da lista: ");
        int quant = sc.nextInt();
        System.out.println();

        sc.close();

        Random random = new Random();
        for (int i=0; i < quant; i++) {
            int num = random.nextInt(1000);
            numeros.add(num);
        }
        System.out.println("Lista gerada: " + numeros);
        System.out.println();


        for (var valor : numeros) {
            if (valor % 3 == 0) {
                mult.add(valor);
            }
            if (valor % 2 == 0) {
                par.add(valor);
            }
            if (valor % 2 == 1) {
                impar.add(valor);
            }
        }
        
        System.out.println("Múltiplos de 3: " + mult);
        System.out.println("Pares: " + par);
        System.out.println("Ímpares: " + impar);
        System.out.println();
    }

}
