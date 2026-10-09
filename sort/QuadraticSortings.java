package sort;

public class QuadraticSortings {
    public static void BubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void InsertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int index = i;
            while (index > 0 && arr[index] < arr[index - 1]) {
                swap(arr, index, index - 1);
                index--;
            }
        }
    }

    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[i]) {
                    swap(arr, i, j);
                }
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int val = arr[i];
        arr[i] = arr[j];
        arr[j] = val;
    }
}