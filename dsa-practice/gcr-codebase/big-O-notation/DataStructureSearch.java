import java.util.*;

public class DataStructureSearch {

    public static void main(String[] args) {
        int n = 1_000_000;

        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            arr[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        // Array Search
        // Time Complexity: O(N)
        long start = System.nanoTime();
        for (int i : arr) {
            if (i == n - 1) break;
        }
        long end = System.nanoTime();
        System.out.println("Array Search Time: " + (end - start) / 1_000_000 + " ms");

        // HashSet Search
        // Time Complexity: O(1) average
        start = System.nanoTime();
        hashSet.contains(n - 1);
        end = System.nanoTime();
        System.out.println("HashSet Search Time: " + (end - start) / 1_000_000 + " ms");

        // TreeSet Search
        // Time Complexity: O(log N)
        start = System.nanoTime();
        treeSet.contains(n - 1);
        end = System.nanoTime();
        System.out.println("TreeSet Search Time: " + (end - start) / 1_000_000 + " ms");
    }
}

/*
COMPARISON:
Array → Slow (O(N))
HashSet → Fastest lookup (O(1))
TreeSet → Maintains order with O(log N)
*/
