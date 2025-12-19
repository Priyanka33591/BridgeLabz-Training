import java.util.Scanner;

public class SumCompareFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            int sum1 = n * (n + 1) / 2;
            int sum2 = 0;

            for (int i = 1; i <= n; i++) {
                sum2 += i;
            }

            System.out.println("Formula Result = " + sum1);
            System.out.println("For Loop Result = " + sum2);
        }
        sc.close();
    }
}
