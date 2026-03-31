import java.util.Scanner;

public class FirstAndLastIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = scan.nextInt();
        }

        int target = scan.nextInt();
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0; i < len; i++) {
            if (arr[i] == target) {
                if (firstIndex == -1) {
                    firstIndex = i;
                }
                lastIndex = i;
            }
        }
        System.out.println("first index of " + target + " in the array is " + firstIndex);
        System.out.println("last index of " + target + " in array is " + lastIndex);
        scan.close();
    }

}
