import java.util.Scanner;

public class SplitWordsCompare {

    static int findLength(String s) {
        int i = 0;
        try {
            while (true) {
                s.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }

    static String[] customSplit(String text) {
        int len = findLength(text);
        int spaces = 0;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                spaces++;

        int[] indexes = new int[spaces + 2];
        indexes[0] = -1;
        int idx = 1;

        for (int i = 0; i < len; i++)
            if (text.charAt(i) == ' ')
                indexes[idx++] = i;

        indexes[idx] = len;

        String[] words = new String[spaces + 1];

        for (int i = 0; i < words.length; i++) {
            String word = "";
            for (int j = indexes[i] + 1; j < indexes[i + 1]; j++)
                word += text.charAt(j);
            words[i] = word;
        }
        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] custom = customSplit(text);
        String[] builtIn = text.split(" ");

        System.out.println("Comparison Result: " + compareArrays(custom, builtIn));
        sc.close();
    }
}
