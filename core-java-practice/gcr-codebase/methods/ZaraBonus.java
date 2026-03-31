public class ZaraBonus {

    // Method to generate salary and years of service
    public static double[][] generateEmployeeData(int employees) {
        double[][] data = new double[employees][2]; // salary, years

        for (int i = 0; i < employees; i++) {
            data[i][0] = (int)(Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int)(Math.random() * 11);           // 0–10 years
        }
        return data;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] data) {
        double[][] result = new double[data.length][3]; // old, bonus, new

        for (int i = 0; i < data.length; i++) {
            double salary = data[i][0];
            double years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = salary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

    // Method to display totals
    public static void displayTotals(double[][] result) {
        double totalOld = 0, totalBonus = 0, totalNew = 0;

        System.out.println("OldSalary\tBonus\t\tNewSalary");

        for (double[] r : result) {
            System.out.println(r[0] + "\t\t" + r[1] + "\t\t" + r[2]);
            totalOld += r[0];
            totalBonus += r[1];
            totalNew += r[2];
        }

        System.out.println("---------------------------------------");
        System.out.println(totalOld + "\t" + totalBonus + "\t" + totalNew);
    }

    public static void main(String[] args) {
        double[][] data = generateEmployeeData(10);
        double[][] result = calculateBonus(data);
        displayTotals(result);
    }
}
