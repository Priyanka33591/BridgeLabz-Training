import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int greatestFactor = 1;

        if (number > 1) {
            for (int i = number - 1; i >= 1; i--) {
                if (number % i == 0) {
                    greatestFactor = i;
                    break;
                }
            }
            System.out.println("Greatest Factor = " + greatestFactor);
        } else {
            System.out.println("Please enter a number greater than 1");
        }

        scanner.close();
    }
}
