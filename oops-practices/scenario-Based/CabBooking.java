class NoDriverAvailableException extends Exception {}

interface FareCalculator {
    double calculate(double km);
}

class NormalFare implements FareCalculator {
    public double calculate(double km) { return km * 10; }
}

public class CabBooking {
    public static void main(String[] args) {
        FareCalculator f = new NormalFare();
        System.out.println(f.calculate(5));
    }
}
