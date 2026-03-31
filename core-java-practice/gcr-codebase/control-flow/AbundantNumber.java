import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        // Find divisors and their sum
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }

        // Check Abundant Number
        if (sum > number) {
            System.out.println("Abundant Number");
        } else {
            System.out.println("Not an Abundant Number");
        }

        sc.close();
    }
}
