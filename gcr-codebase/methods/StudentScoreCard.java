import java.util.Scanner;

public class StudentScoreCard {

    // Method to generate random 2-digit PCM scores
    public static int[][] generatePCMScores(int students) {
        int[][] scores = new int[students][3]; // Physics, Chemistry, Maths

        for (int i = 0; i < students; i++) {
            scores[i][0] = (int)(Math.random() * 90) + 10;
            scores[i][1] = (int)(Math.random() * 90) + 10;
            scores[i][2] = (int)(Math.random() * 90) + 10;
        }
        return scores;
    }

    // Method to calculate total, average, percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] result = new double[scores.length][3]; // total, average, percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // Method to find grade
    public static String findGrade(double percentage) {
        if (percentage >= 80) return "A";
        else if (percentage >= 70) return "B";
        else if (percentage >= 60) return "C";
        else if (percentage >= 50) return "D";
        else if (percentage >= 40) return "E";
        else return "R";
    }

    // Method to display scorecard
    public static void displayScoreCard(int[][] scores, double[][] result) {
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(
                scores[i][0] + "\t" +
                scores[i][1] + "\t" +
                scores[i][2] + "\t" +
                result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t" +
                findGrade(result[i][2])
            );
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int students = sc.nextInt();

        int[][] scores = generatePCMScores(students);
        double[][] result = calculateResults(scores);

        displayScoreCard(scores, result);
        sc.close();
    }
}
