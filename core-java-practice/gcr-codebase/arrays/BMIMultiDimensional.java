import java.util.Scanner;

public class BMIMultiDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Create 2D array: [][0] = Weight, [][1] = Height, [][2] = BMI
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        // Take input for weight and height
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1));

            System.out.print("Enter weight (kg): ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (meters): ");
            personData[i][1] = sc.nextDouble();

            // Validate input
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input! Enter positive values.");
                i--; // decrement index to re-enter values
            }
        }

        // Calculate BMI and weight status
        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] /
                    (personData[i][1] * personData[i][1]);

            if (personData[i][2] <= 18.4)
                weightStatus[i] = "Underweight";
            else if (personData[i][2] <= 24.9)
                weightStatus[i] = "Normal";
            else if (personData[i][2] <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        // Display result
        System.out.println("\nWeight\tHeight\tBMI\tStatus");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%s\n",
                    personData[i][0],
                    personData[i][1],
                    personData[i][2],
                    weightStatus[i]);
        }
        sc.close();
    }
}
