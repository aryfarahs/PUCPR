import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array_bubble = {9, 4, 65, 7 ,12 ,5};
        int[] array_insertion = {13, 4, 12, 5, 23, 1};
        int[] array_quick = {19, 34, 2, 77, 54, 131};

        // printa os arrays antes de serem ordenados
        System.out.println("Antes do Sort");
        System.out.print("Bubble: ");
        printArray(array_bubble);

        System.out.print("\nInsertion: ");
        printArray(array_insertion);

        System.out.print("\nQuick: ");
        printArray(array_quick);

        // ordena os arrays
        System.out.println("\n\nOrdenando...");
        int[] reaady_bubble = bubbleSort(array_bubble, array_bubble.length);
        int[] ready_insertion = insertionSort(array_insertion);
        int[] ready_quick = quickSort(array_quick, 0, array_quick.length - 1);

        // printa os arrays depois de serem ordenados
        System.out.println("Depois do Sort");

        System.out.print("Insertion: ");
        printArray(ready_insertion);

        System.out.print("\nBubble: ");
        printArray(reaady_bubble);

        System.out.print("\nQuick: ");
        printArray(ready_quick);

    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " | ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // BUBBLESORT
    public static int[] bubbleSort(int[] array, int size) {
        if (size == 1) {
            return array;
        }

        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
            }
        }

        bubbleSort(array, size - 1);
        return array;
    }

    // INSERTIONSORT
    public static int[] insertionSort(int[] array) {
        int lenght = array.length;

        while (lenght > 0) {
            for (int i = 0; i < lenght - 1; i++) {
                if (array[i + 1] < array[i]) {
                    swap(array, i, i + 1);
                }
            }
            lenght--;
        }

        return array;
    }

    // QUICKSORT
    public static int[] quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivotIndex = qs(array, start, end); // calcula o pivot
            quickSort(array, start, pivotIndex - 1); // ordena a primeira metade
            quickSort(array, pivotIndex + 1, end); // ordena a segunda metade
        }
        return array;
    };

    public static int qs(int[] array, int start, int end) {
        int pivot = array[end]; // pivot de referencia
        int smaller = start -1; // balde para armazenar os valores menores que o pivot

        for (int i = start; i < end; i++) { // percorre o arrya
            if (array[i] < pivot) { // se o atual for menor que o pivot...
                smaller++; // incrementa o indice de "menores"
                swap(array, i, smaller); // troca o indice atual com o indice de menores
            }
        }
        swap(array, smaller + 1, end); // troca o pivot com o indice de menores + 1
        return smaller + 1;
    }


}