public class ReverseInteger {
    public int Reverse(int x) {
        int n = x;
        int rev = 0;
        while(n != 0) {
            if((long)rev * 10 + (long)n % 10 > (long)Int32.MaxValue 
                || (long)rev * 10 + (long)n % 10 < (long)Int32.MinValue
            ) {
                return 0;
            }
                
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}