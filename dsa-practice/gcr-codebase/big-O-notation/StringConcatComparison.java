public class StringConcatComparison {

    public static void main(String[] args) {

        // String (Immutable)
        // Time Complexity: O(N^2)
        // Creates new object every time → Very slow
        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += "a";
        }
        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) / 1_000_000 + " ms");

        // StringBuilder (Mutable, Not thread-safe)
        // Time Complexity: O(N)
        // Fastest for single-threaded use
        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) / 1_000_000 + " ms");

        // StringBuffer (Mutable, Thread-safe)
        // Time Complexity: O(N)
        // Slightly slower due to synchronization
        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sbf.append("a");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) / 1_000_000 + " ms");
    }
}

/*
COMPARISON:
String → Very slow (O(N^2))
StringBuilder → Fastest (O(N)) for single thread
StringBuffer → Thread-safe but slightly slower
*/
