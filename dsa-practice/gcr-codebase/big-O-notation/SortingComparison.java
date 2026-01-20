public class SortingComparison {

    // Bubble Sort
    // Time Complexity: O(N^2)
    // Very slow for large datasets
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
    }

    // Merge Sort
    // Time Complexity: O(N log N)
    // Stable sorting algorithm
    static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
        }
    }

    // Quick Sort
    // Average Time Complexity: O(N log N)
    // Fastest in practice, but unstable
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++)
                if (arr[j] < pivot) {
                    i++;
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            int t = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = t;
            quickSort(arr, low, i);
            quickSort(arr, i + 2, high);
        }
    }
}

/*
COMPARISON:
Bubble Sort → O(N^2) → Not suitable for large data
Merge Sort → O(N log N) → Stable and reliable
Quick Sort → O(N log N) → Fastest average case
*/
