import java.util.*;
import java.util.regex.*;
import java.time.*;

public class GlobalShipmentManifestValidator {

    static boolean validateShipmentCode(String code) {
        // SHIP-XXXXXX format
        if (!code.matches("SHIP-[1-9][0-9]{5}"))
            return false;

        String digits = code.substring(5);

        // no digit repeats more than 3 times consecutively
        if (digits.matches(".*(\\d)\\1{3,}.*"))
            return false;

        return true;
    }

    static boolean validateDate(String date) {
        try {
            LocalDate d = LocalDate.parse(date);
            int year = d.getYear();
            return year >= 2000 && year <= 2099;
        } catch (Exception e) {
            return false;
        }
    }

    static boolean validateMode(String mode) {
        return mode.matches("AIR|SEA|ROAD|RAIL|EXPRESS|FREIGHT");
    }

    static boolean validateWeight(String weight) {

        // regex rule
        if (!weight.matches("(0|[1-9]\\d{0,5})(\\.\\d{1,2})?"))
            return false;

        double w = Double.parseDouble(weight);

        if (w <= 0 || w > 999999.99)
            return false;

        return true;
    }

    static boolean validateStatus(String status) {
        return status.matches("DELIVERED|CANCELLED|IN_TRANSIT");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {

            String line = sc.nextLine();
            String[] parts = line.split("\\|");

            if (parts.length != 5) {
                System.out.println("NON-COMPLIANT RECORD");
                continue;
            }

            boolean valid =
                    validateShipmentCode(parts[0]) &&
                    validateDate(parts[1]) &&
                    validateMode(parts[2]) &&
                    validateWeight(parts[3]) &&
                    validateStatus(parts[4]);

            if (valid)
                System.out.println("COMPLIANT RECORD");
            else
                System.out.println("NON-COMPLIANT RECORD");
        }

        sc.close();
    }
}