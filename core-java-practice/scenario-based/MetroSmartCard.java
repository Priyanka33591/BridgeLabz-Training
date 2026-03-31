import java.util.Scanner;

public class MetroSmartCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double balance;
        System.out.print("Enter Initial Smart Card Balance: ");
        balance = sc.nextDouble();

        while (balance > 0) {
            System.out.print("Enter distance travelled (or -1 to exit): ");
            double dist = sc.nextDouble();

            if (dist == -1) break;

            double fare = (dist <= 5) ? 10 :
                          (dist <= 10) ? 20 : 30;

            if (balance >= fare) {
                balance -= fare;
                System.out.println("Fare Deducted: " + fare);
                System.out.println("Remaining Balance: " + balance);
            } else {
                System.out.println("Insufficient Balance!");
                break;
            }
        }
        sc.close();
    }
}
