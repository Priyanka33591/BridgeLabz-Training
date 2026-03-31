import java.util.Scanner;

public class FirstAndLastIndexUsingBinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }
        int target = scan.nextInt();
        int firstIdx = firstIndex(arr, target);
        int lastIdx = lastIndex(arr, target);
        System.out.println("first index is " + firstIdx);
        System.out.println("last index is " + lastIdx);
        scan.close();
    }

    public static int firstIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int firstIdx = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                firstIdx = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstIdx;
    }

    public static int lastIndex(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int lastIdx = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastIdx = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastIdx;
    }
}
