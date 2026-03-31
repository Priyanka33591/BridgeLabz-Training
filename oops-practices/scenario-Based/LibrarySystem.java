class BookNotAvailableException extends Exception {}

interface FineCalculator {
    double fine(int days);
}

class StudentFine implements FineCalculator {
    public double fine(int d) { return d * 2; }
}

public class LibrarySystem {
    public static void main(String[] args) {
        FineCalculator f = new StudentFine();
        System.out.println(f.fine(3));
    }
}
