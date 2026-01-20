import java.io.*;

public class FileReadComparison {

    public static void main(String[] args) throws Exception {

        // FileReader
        // Reads character by character
        // Slower for large files
        long start = System.nanoTime();
        FileReader fr = new FileReader("large.txt");
        while (fr.read() != -1) {}
        fr.close();
        long end = System.nanoTime();
        System.out.println("FileReader Time: " + (end - start) / 1_000_000 + " ms");

        // InputStreamReader
        // Reads bytes and converts to characters
        // Faster and more efficient
        start = System.nanoTime();
        InputStreamReader isr = new InputStreamReader(new FileInputStream("large.txt"));
        while (isr.read() != -1) {}
        isr.close();
        end = System.nanoTime();
        System.out.println("InputStreamReader Time: " + (end - start) / 1_000_000 + " ms");
    }
}

/*
COMPARISON:
FileReader → Good for small text files
InputStreamReader → Better for large files
*/
