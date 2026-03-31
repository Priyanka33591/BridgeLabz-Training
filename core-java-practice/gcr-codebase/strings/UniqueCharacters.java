import java.util.Scanner;

public class UniqueCharacters {

    static int findLength(String text) {
        int i = 0;
        try {
            while (true) {
                text.charAt(i);
                i++;
            }
        } catch (Exception e) {
            return i;
        }
    }

    static char[] uniqueCharacters(String text) {
        int len = findLength(text);
        char[] temp = new char[len];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (ch == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[count++] = ch;
            }
        }

        char[] result = new char[count];
        for (int i = 0; i < count; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = uniqueCharacters(text);
        System.out.print("Unique Characters: ");
        for (char c : unique)
            System.out.print(c + " ");
        sc.close();
    }
}
