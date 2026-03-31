import java.util.*;

public class PalindromeCheck {
    static boolean isPalindrome(String s){
        String rev = new StringBuilder(s).reverse().toString();
        return s.equalsIgnoreCase(rev);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s) ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}
