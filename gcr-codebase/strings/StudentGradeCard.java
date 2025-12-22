import java.util.Scanner;

public class StudentGradeCard {

    // a) Generate random 2-digit PCM scores for students
    static int[][] generatePCMScores(int students) {
        int[][] pcm = new int[students][3]; // P, C, M

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                pcm[i][j] = (int) (Math.random() * 51) + 50; // 50–100
            }
        }
        return pcm;
    }

    // b) Calculate total, average and percentage
    static double[][] calculateResults(int[][] pcm) {
        double[][] result = new double[pcm.length][3]; // total, avg, %

        for (int i = 0; i < pcm.length; i++) {
            int total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            result[i][0] = Math.round(total * 100.0) / 100.0;
            result[i][1] = Math.round(avg * 100.0) / 100.0;
            result[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return result;
    }

    // c) Calculate grade based on percentage
    static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];

        for (int i = 0; i < results.length; i++) {
            double p = results[i][2];

            if (p >= 80) grades[i][0] = "A";
            else if (p >= 70) grades[i][0] = "B";
            else if (p >= 60) grades[i][0] = "C";
            else if (p >= 50) grades[i][0] = "D";
            else if (p >= 40) grades[i][0] = "E";
            else grades[i][0] = "R";
        }
        return grades;
    }

    // d) Display scorecard in tabular format
    static void displayScoreCard(int[][] pcm, double[][] results, String[][] grades) {
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");

        for (int i = 0; i < pcm.length; i++) {
            System.out.println(
                (i + 1) + "\t" +
                pcm[i][0] + "\t" +
                pcm[i][1] + "\t" +
                pcm[i][2] + "\t" +
                results[i][0] + "\t" +
                results[i][1] + "\t" +
                results[i][2] + "\t" +
                grades[i][0]
            );
        }
    }

    // main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] pcmScores = generatePCMScores(n);
        double[][] results = calculateResults(pcmScores);
        String[][] grades = calculateGrades(results);

        displayScoreCard(pcmScores, results, grades);
        sc.close();
    }
}
