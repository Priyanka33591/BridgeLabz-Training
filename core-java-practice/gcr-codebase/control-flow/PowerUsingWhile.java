import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int power = scanner.nextInt();
        int result = 1;
        int counter = 0;

        if (number > 0 && power >= 0) {
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println("Result = " + result);
        } else {
            System.out.println("Please enter valid positive integers");
        }

        scanner.close();
    }
}
