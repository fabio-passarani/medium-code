public class InsertionSort {

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            // Sposta gli elementi dell'array arr[0..i-1] che sono
            // maggiori di key, di una posizione avanti rispetto alla corrente
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            printArray("array dopo " + i + " cicli: ", arr);
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

        insertionSort(arr);

        System.out.print("Array ordinato: ");
        printArray(arr);
    }

}