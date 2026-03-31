import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int counter = 100;

        if (number > 0 && number < 100) {
            System.out.println("Multiples of " + number + " below 100:");
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        } else {
            System.out.println("Enter a positive number less than 100");
        }

        scanner.close();
    }
}
