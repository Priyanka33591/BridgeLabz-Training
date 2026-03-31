import java.util.*;

public class FestivalLuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lucky draw number (or -1 to stop): ");

            if(!sc.hasNextInt()) {
                System.out.println("Invalid Input! Try again.\n");
                sc.next(); // skip invalid input
                continue;
            }

            int num = sc.nextInt();
            if(num == -1) break;

            if(num % 3 == 0 && num % 5 == 0) {
                System.out.println("🎁 Congratulations! You won a gift!\n");
            } else {
                System.out.println("Better luck next time!\n");
            }
        }

        System.out.println("Lucky draw session ended.");
        sc.close();
    }
}
