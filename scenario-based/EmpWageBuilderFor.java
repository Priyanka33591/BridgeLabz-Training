public class EmpWageBuilderFor {

    public static void main(String[] args) {
        // Constants
        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int NUM_OF_WORKING_DAYS = 20;

        // Variables
        int empHrs = 0, empWage = 0, totalEmpWage = 0;

        // Computation
        for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * EMP_RATE_PER_HOUR;
            totalEmpWage += empWage;
            System.out.println("Day " + (day + 1) + " Wage = " + empWage);
        }

        System.out.println("Total Monthly Wage = " + totalEmpWage);
    }
}
