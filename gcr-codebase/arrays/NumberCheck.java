import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        // Input
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking numbers
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0)
                    System.out.println(num + " is Positive and Even");
                else
                    System.out.println(num + " is Positive and Odd");
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println("Number is Zero");
            }
        }

        // Comparing first and last element
        if (numbers[0] == numbers[4])
            System.out.println("First and Last elements are Equal");
        else if (numbers[0] > numbers[4])
            System.out.println("First element is Greater than Last");
        else
            System.out.println("First element is Less than Last");
        sc.close();
    }
}
