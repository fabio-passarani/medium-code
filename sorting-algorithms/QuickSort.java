public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = (high + 1);
        for (int j = high; j > low; j--) {
            if (arr[j] >= pivot) {
                i--;
                // Scambia arr[i] e arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Scambia arr[i+1] e arr[high] (o pivot)
        int temp = arr[i - 1];
        arr[i - 1] = arr[low];
        arr[low] = temp;
        return i - 1;
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
        int[] arr = { 27, 5, 18, 97, 2, 55, 61, 24, 53, 6, 5 };

        System.out.print("Array iniziale: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.print("Array ordinato: ");
        printArray(arr);
    }

}
