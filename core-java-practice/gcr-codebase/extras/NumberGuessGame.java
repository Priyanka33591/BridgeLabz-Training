import java.util.*;

public class NumberGuessGame {
    static int generateGuess(int low, int high){
        return (low + high) / 2; // smarter than random
    }

    static String userFeedback(Scanner sc){
        System.out.print("Is the guess High(H), Low(L), or Correct(C)? : ");
        return sc.next().toUpperCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        System.out.println("Think of a number between 1 to 100!");

        while (true) {
            int guess = generateGuess(low, high);
            System.out.println("\nComputer guesses: " + guess);

            String feedback = userFeedback(sc);

            if (feedback.equals("H")) high = guess - 1;
            else if (feedback.equals("L")) low = guess + 1;
            else if (feedback.equals("C")) {
                System.out.println("Computer guessed correctly! 🎉");
                break;
            } else {
                System.out.println("Invalid choice. Enter H/L/C only.");
            }
        }
        sc.close();
    }
}
