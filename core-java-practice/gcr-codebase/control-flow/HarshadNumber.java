import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int sum = 0;

        // While loop to calculate sum of digits
        while (number != 0) {
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        // Check Harshad Number
        if (originalNumber % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}
