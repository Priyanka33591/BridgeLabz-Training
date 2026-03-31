import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter age (or -1 to exit): ");
            int age = sc.nextInt();
            
            if (age == -1) break;

            if (age >= 18) {
                System.out.print("Enter your vote (1/2/3): ");
                int vote = sc.nextInt();

                if (vote == 1 || vote == 2 || vote == 3) {
                    System.out.println("Vote recorded for Candidate " + vote);
                } else {
                    System.out.println("Invalid vote!");
                }
            } else {
                System.out.println("Not eligible to vote.");
            }
        }
        sc.close();
    }
}
