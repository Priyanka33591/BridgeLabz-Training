public class SentenceSearch {
    public static String search(String[] s, String word) {
        for (String line : s)
            if (line.contains(word)) return line;
        return "Not Found";
    }
}
