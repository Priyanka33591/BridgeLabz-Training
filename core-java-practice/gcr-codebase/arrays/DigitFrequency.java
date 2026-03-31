import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;

        // Find count of digits
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        // Store digits in array
        int[] digits = new int[count];
        int index = 0;

        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        // Frequency array
        int[] frequency = new int[10];

        // Calculate frequency
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }

        // Display frequency
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }
        sc.close();
    }
}
