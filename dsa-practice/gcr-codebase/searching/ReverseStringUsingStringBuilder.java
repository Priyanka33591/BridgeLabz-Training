public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {
        String input = "hello";
        StringBuilder sb = new StringBuilder();

        sb.append(input);
        sb.reverse();
        String reversedString = sb.toString();
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}
