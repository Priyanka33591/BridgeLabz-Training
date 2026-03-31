import java.util.Scanner;

public class StringLengthWithoutLength {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = sc.next();

        System.out.println("Custom Length: " + findLength(text));
        System.out.println("Built-in Length: " + text.length());
        sc.close();
    }
}
