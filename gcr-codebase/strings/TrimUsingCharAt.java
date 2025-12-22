import java.util.Scanner;

public class TrimUsingCharAt {

    static int[] findTrimIndexes(String text) {
        int start = 0, end = text.length() - 1;

        while (text.charAt(start) == ' ') start++;
        while (text.charAt(end) == ' ') end--;

        return new int[]{start, end + 1};
    }

    static String substring(String text, int s, int e) {
        String res = "";
        for (int i = s; i < e; i++)
            res += text.charAt(i);
        return res;
    }

    static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        int[] idx = findTrimIndexes(text);
        String custom = substring(text, idx[0], idx[1]);
        String builtIn = text.trim();

        System.out.println("Match Result: " + compare(custom, builtIn));
        sc.close();
    }
}
