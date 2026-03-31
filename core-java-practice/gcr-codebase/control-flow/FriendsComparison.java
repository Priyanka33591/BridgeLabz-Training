import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int amarAge = scanner.nextInt();
        int akbarAge = scanner.nextInt();
        int anthonyAge = scanner.nextInt();

        double amarHeight = scanner.nextDouble();
        double akbarHeight = scanner.nextDouble();
        double anthonyHeight = scanner.nextDouble();

        // Find Youngest
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));

        if (youngestAge == amarAge) {
            System.out.println("Amar is the youngest");
        } else if (youngestAge == akbarAge) {
            System.out.println("Akbar is the youngest");
        } else {
            System.out.println("Anthony is the youngest");
        }

        // Find Tallest
        double tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));

        if (tallestHeight == amarHeight) {
            System.out.println("Amar is the tallest");
        } else if (tallestHeight == akbarHeight) {
            System.out.println("Akbar is the tallest");
        } else {
            System.out.println("Anthony is the tallest");
        }

        scanner.close();
    }
}
