public class ReverseInteger {
    public int reverse(int x) {
        long num = 0;
        while (x != 0) {
            long rem = x % 10;
            x = x / 10;
            num = num * 10 + rem;
        }

        if (num > Integer.MAX_VALUE || num < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) num;
    }
}