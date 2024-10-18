public class SelectionSortAlgorithm {

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {

            int min_idx = i;

            // itero nella porzione rimanente per trovare il vero minimo
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }
            System.out.println("indice del valore minimo: " + min_idx);

            // cambio l'elemento all'attuale indice con il minimo trovato
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
            printArray("ordine array dopo " + (i + 1) + " cicli: ", arr);
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

        selectionSort(arr);

        System.out.print("Array ordinato: ");
        printArray(arr);
    }

}