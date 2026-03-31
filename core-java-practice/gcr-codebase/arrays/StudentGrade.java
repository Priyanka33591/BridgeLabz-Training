import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take input for number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // b. Create arrays
        int[][] marks = new int[n][3];   // [][0]=Physics, [][1]=Chemistry, [][2]=Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // c. Take input for marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1));

            System.out.print("Enter Physics marks: ");
            marks[i][0] = sc.nextInt();

            System.out.print("Enter Chemistry marks: ");
            marks[i][1] = sc.nextInt();

            System.out.print("Enter Maths marks: ");
            marks[i][2] = sc.nextInt();

            // Validate input
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks! Enter positive values.");
                i--;   // decrement index
            }
        }

        // d. Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 80)
                grade[i] = 'A';
            else if (percentage[i] >= 70)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 50)
                grade[i] = 'D';
            else if (percentage[i] >= 40)
                grade[i] = 'E';
            else
                grade[i] = 'R';
        }

        // e. Display result
        System.out.println("\nPhysics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t\t%d\t%.2f\t\t%c\n",
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    percentage[i],
                    grade[i]);
        }
        sc.close();
    }
}
