import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return (r == 0) ? "rock" : (r == 1) ? "paper" : "scissors";
    }

    static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("paper") && comp.equals("rock")) ||
            (user.equals("scissors") && comp.equals("paper")))
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of games: ");
        int n = sc.nextInt();

        int userWins = 0, compWins = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next();
            String comp = computerChoice();

            int res = winner(user, comp);
            if (res == 1) userWins++;
            else if (res == -1) compWins++;

            System.out.println("Game " + i + ": Computer = " + comp);
        }

        System.out.println("\nPlayer Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Player Win %: " + (userWins * 100.0 / n));
        System.out.println("Computer Win %: " + (compWins * 100.0 / n));
        sc.close();
    }
}
