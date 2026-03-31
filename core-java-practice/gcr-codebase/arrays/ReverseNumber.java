import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int temp = number;
        int count = 0;

        // Count digits
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = 0;

        // Store digits
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        int[] reverse = new int[count];
        for (int i = 0; i < count; i++) {
            reverse[i] = digits[count - i - 1];
        }

        // Display reversed number
        for (int i = 0; i < count; i++) {
            System.out.print(reverse[i]);
        }
        sc.close();
    }
}
