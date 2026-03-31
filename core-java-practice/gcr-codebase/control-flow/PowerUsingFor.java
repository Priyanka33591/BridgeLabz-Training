import java.util.Scanner;

public class PowerUsingFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int power = scanner.nextInt();
        int result = 1;

        if (number > 0 && power >= 0) {
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println("Result = " + result);
        } else {
            System.out.println("Please enter valid positive integers");
        }

        scanner.close();
    }
}
