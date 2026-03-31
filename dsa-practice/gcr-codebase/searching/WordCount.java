import java.io.*;

public class WordCount {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
        String word = "java";
        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String w : words) {
                if (w.equalsIgnoreCase(word)) count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
