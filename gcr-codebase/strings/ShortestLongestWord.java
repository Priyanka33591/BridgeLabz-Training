import java.util.Scanner;

public class ShortestLongestWord {

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

    static String[] splitWords(String text) {
        return text.split(" ");
    }

    static int[] findShortestLongest(String[] words) {
        int min = findLength(words[0]);
        int max = min;

        for (String w : words) {
            int len = findLength(w);
            if (len < min) min = len;
            if (len > max) max = len;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitWords(text);
        int[] result = findShortestLongest(words);

        System.out.println("Shortest Length: " + result[0]);
        System.out.println("Longest Length: " + result[1]);
        sc.close();
    }
}
