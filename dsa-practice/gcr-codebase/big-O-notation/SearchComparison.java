public class SearchComparison {

    // Linear Search
    // Time Complexity: O(N)
    // Checks each element one by one
    // Slow for large datasets
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    // Binary Search
    // Time Complexity: O(log N)
    // Requires sorted array
    // Much faster for large datasets
    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = 1_000_000;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;

        // Linear Search Performance
        long start = System.nanoTime();
        linearSearch(arr, n - 1);
        long end = System.nanoTime();
        System.out.println("Linear Search Time: " + (end - start) / 1_000_000 + " ms");

        // Binary Search Performance
        start = System.nanoTime();
        binarySearch(arr, n - 1);
        end = System.nanoTime();
        System.out.println("Binary Search Time: " + (end - start) / 1_000_000 + " ms");
    }
}

/*
COMPARISON:
Linear Search → O(N) → Slow when N is large
Binary Search → O(log N) → Very fast but needs sorted data
*/
