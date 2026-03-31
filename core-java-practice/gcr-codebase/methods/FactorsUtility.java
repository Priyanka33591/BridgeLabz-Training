public class FactorsUtility {

    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] factors = new int[count];
        int idx = 0;

        for (int i = 1; i <= n; i++)
            if (n % i == 0) factors[idx++] = i;

        return factors;
    }

    public static int greatestFactor(int[] f) {
        return f[f.length - 1];
    }

    public static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    public static long product(int[] f) {
        long p = 1;
        for (int x : f) p *= x;
        return p;
    }

    public static double cubeProduct(int[] f) {
        double p = 1;
        for (int x : f) p *= Math.pow(x, 3);
        return p;
    }
}
