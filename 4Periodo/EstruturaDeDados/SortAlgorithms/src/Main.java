import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array_bubble = {9, 4, 65, 7 ,12 ,5};
        int[] array_insertion = {13, 4, 12, 5, 23, 1};

        System.out.println("Antes do Sort");
        System.out.print("Bubble: ");
        printArray(array_bubble);

        System.out.print("\nInsertion: ");
        printArray(array_insertion);

        int[] reaady_bubble = bubbleSort(array_bubble, array_bubble.length);
        int[] ready_insertion = insertionSort(array_insertion);

        System.out.println("\n");
        System.out.println("Depois do Sort");

        System.out.print("Insertion: ");
        for (int i = 0; i < reaady_bubble.length; i++) {
            System.out.print(reaady_bubble[i] + " | ");
        }
        System.out.println();

        System.out.print("Bubble: ");
        for (int i = 0; i < ready_insertion.length; i++) {
            System.out.print(ready_insertion[i] + " | ");
        }
        System.out.println("\n");

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
    public static int[] quickSort(int[] array) {
        
    }

}