import java.util.Scanner;

public class CharacterTypeTable {

    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z')
            ch = (char)(ch + 32);

        if (ch >= 'a' && ch <= 'z')
            return ("aeiou".indexOf(ch) >= 0) ? "Vowel" : "Consonant";

        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Char\tType");
        for (int i = 0; i < text.length(); i++)
            System.out.println(text.charAt(i) + "\t" + checkChar(text.charAt(i)));
        sc.close();
    }
}
