import java.util.Scanner;

public class BMITracker {

    // Method to calculate BMI and store in 3rd column
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;
            data[i][2] = weight / (heightM * heightM);
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] persons = new double[10][3]; // weight, height, BMI

        for (int i = 0; i < 10; i++) {
            persons[i][0] = sc.nextDouble(); // weight in kg
            persons[i][1] = sc.nextDouble(); // height in cm
        }

        calculateBMI(persons);
        String[] bmiStatus = determineBMIStatus(persons);

        for (int i = 0; i < 10; i++) {
            System.out.println(
                "Weight: " + persons[i][0] +
                " Height: " + persons[i][1] +
                " BMI: " + persons[i][2] +
                " Status: " + bmiStatus[i]
            );
        }
        sc.close();
    }
}
