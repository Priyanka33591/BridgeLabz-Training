import java.util.Scanner;

public class FactorsUsingWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int counter = 1;

        if (number > 0) {
            System.out.println("Factors of " + number + " are:");
            while (counter < number) {
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++;
            }
        } else {
            System.out.println("Please enter a positive integer");
        }

        scanner.close();
    }
}
