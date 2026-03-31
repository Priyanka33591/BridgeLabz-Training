import java.util.Scanner;

public class BMICalculation {

    // b) Method to calculate BMI and Status for one person
    static String[] calculateBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100; // convert cm to meter
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi <= 18.4)
            status = "Underweight";
        else if (bmi <= 24.9)
            status = "Normal";
        else if (bmi <= 39.9)
            status = "Overweight";
        else
            status = "Obese";

        bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 digits

        return new String[]{
                String.valueOf(heightCm),
                String.valueOf(weight),
                String.valueOf(bmi),
                status
        };
    }

    // c) Method to compute BMI details for all persons
    static String[][] computeAllBMI(double[][] hw) {
        String[][] result = new String[hw.length][4];

        for (int i = 0; i < hw.length; i++) {
            result[i] = calculateBMIStatus(hw[i][0], hw[i][1]);
        }
        return result;
    }

    // d) Display result in tabular format
    static void displayBMIReport(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\tStatus");
        for (String[] row : data) {
            System.out.println(
                    row[0] + "\t\t" +
                    row[1] + "\t\t" +
                    row[2] + "\t" +
                    row[3]
            );
        }
    }

    // e) Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Take input for height and weight
        double[][] heightWeight = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter Weight (kg): ");
            heightWeight[i][0] = sc.nextDouble();

            System.out.print("Enter Height (cm): ");
            heightWeight[i][1] = sc.nextDouble();
        }

        String[][] bmiReport = computeAllBMI(heightWeight);
        displayBMIReport(bmiReport);
        sc.close();
    }
}
