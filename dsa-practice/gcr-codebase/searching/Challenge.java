import java.util.*;

public class Challenge {
    static int missingPositive(int[] arr) {
        boolean[] seen = new boolean[arr.length + 1];
        for (int x : arr)
            if (x > 0 && x <= arr.length)
                seen[x] = true;

        for (int i = 1; i <= arr.length; i++)
            if (!seen[i]) return i;
        return arr.length + 1;
    }

    static int binarySearch(int[] arr, int t) {
        Arrays.sort(arr);
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (arr[m] == t) return m;
            else if (arr[m] < t) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}
