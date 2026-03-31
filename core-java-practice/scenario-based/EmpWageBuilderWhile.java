public class EmpWageBuilderWhile {

    // Constants must be final to use in switch case
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NUM_OF_WORKING_DAYS = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    public static void main(String[] args) {

        int totalEmpHrs = 0, totalWorkingDays = 0;

        while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            int empHrs = 0;

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

            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + "   Hours Worked: " + empHrs);
        }

        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("\nTotal Working Hours: " + totalEmpHrs);
        System.out.println("Total Monthly Wage: " + totalEmpWage);
    }
}
