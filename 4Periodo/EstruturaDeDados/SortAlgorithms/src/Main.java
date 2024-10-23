public class Main {
    public static void main(String[] args) {

        int[] array_bubble = {9, 4, 65, 7 ,12 ,5};
        int[] array_insertion = {13, 4, 12, 5, 23, 1};

        System.out.println("Antes do Sort");
        System.out.print("Bubble: ");
        printArray(array_bubble);
        System.out.print("\nInsertion: ");
        printArray(array_insertion);

        bubbleSort(array_bubble, array_bubble.length);
        insertionSort(array_insertion);

        System.out.println("\n");
        System.out.println("Depois do Sort");
        System.out.print("Bubble: ");
        printArray(array_bubble);
        System.out.print("\nInsertion: ");
        printArray(array_insertion);

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
    public static void bubbleSort(int[] array, int size) {
        if (size == 1) {
            return;
        }

        for (int i = 0; i < size - 1; i++) {
            if (array[i] > array[i + 1]) {
                swap(array, i, i + 1);
            }
        }
//        System.out.println();
//        printArray(array);
        bubbleSort(array, size - 1);
    }

    // INSERTIONSORT
    public static void insertionSort(int[] array) {
        int lenght = array.length;

        while (lenght > 1) {
            for (int i = 1; i < lenght; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                }
            }
            System.out.println();
            printArray(array);
            lenght--;
        }

    }

}