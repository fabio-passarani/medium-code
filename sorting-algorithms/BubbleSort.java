public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Scambia arr[j] e arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            printArray("Array dopo aver completato il " + (i + 1) + " ciclo esterno: ", arr);
        }
    }

    static void printArray(String message, int[] arr) {
        System.out.print(message);
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void printArray(int[] arr) {
        printArray("", arr);
    }

    public static void main(String[] args) {
        int[] arr = { 55, 5, 18, 2 };

        System.out.print("Array iniziale: ");
        printArray(arr);

        bubbleSort(arr);

        System.out.print("Array ordinato: ");
        printArray(arr);
    }

}