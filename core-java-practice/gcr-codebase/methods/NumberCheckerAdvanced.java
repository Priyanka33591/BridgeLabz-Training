public class NumberCheckerAdvanced {

    public static int sumDigits(int[] digits) {
        int s = 0;
        for (int d : digits) s += d;
        return s;
    }

    public static double sumOfSquares(int[] digits) {
        double s = 0;
        for (int d : digits) s += Math.pow(d, 2);
        return s;
    }

    public static boolean isHarshad(int n, int[] digits) {
        return n % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i;

        for (int d : digits)
            freq[d][1]++;

        return freq;
    }
}
