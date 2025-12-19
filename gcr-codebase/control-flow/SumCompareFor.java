import java.util.Scanner;

public class SumCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number >= 0) {
            int sum1 = number * (number + 1) / 2;
            int sum2 = 0;

            for (int i = 1; i <= number; i++) {
                sum2 += i;
            }

            System.out.println("Formula Result = " + sum1);
            System.out.println("For Loop Result = " + sum2);
        }
        sc.close();
    }
}
