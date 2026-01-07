import java.util.*;

public class CabBookingTest {
    public static void main(String[] args) throws Exception {

        User u1 = new User(1, "Priyanka");
        Driver d1 = new Driver(101, "Rahul");

        FareCalculator calculator = new PeakFareCalculator();

        if (!d1.available) {
            throw new NoDriverAvailableException("No Driver Available");
        }

        d1.available = false;
        double fare = calculator.calculateFare(12);

        Ride ride = new Ride(u1, d1, fare);
        ride.showRide();
    }
}
